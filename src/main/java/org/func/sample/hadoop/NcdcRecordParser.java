package org.func.sample.hadoop;

import org.apache.hadoop.io.Text;


public class NcdcRecordParser {
	private static final int MISSING_TEMPERATURE = 9999;

	private String year;

	private int airTemperature;
	private String quality;

	public void parse(String value) {
		year = value.substring(15, 19);
		String airTemperatureString;
		if (value.charAt(87) == '+') {
			airTemperatureString = value.substring(88, 92);
		} else {
			airTemperatureString = value.substring(87, 92);
		}
		airTemperature = Integer.parseInt(airTemperatureString);
		quality = value.substring(92, 93);
	}

	public void parse(Text record) {
		parse(record.toString());
	}

	public boolean isValidTemperature() {
		return airTemperature != MISSING_TEMPERATURE && quality.matches("[01459]");
	}

	public String getYear() {
		return year;
	}

	public int getAirTemperature() {
		return airTemperature;
	}
}
