package org.func.sample.hadoop;

import org.apache.hadoop.util.ToolRunner;


public class MaxTemperature {

	/*
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.addResource("configuration-1.xml");
		conf.addResource("configuration-2.xml");


		System.out.println(conf.get("color"));
		System.out.println(conf.getInt("size",0));
		System.out.println(conf.get("breadth"));
		System.out.println(conf.get("color"));
		System.out.println(conf.getInt("size",0));
		System.out.println(conf.get("breadth","wide"));
		System.out.println(conf.get("size-weight"));
		System.out.println(conf.get("weight"));
		System.setProperty("size", "14");
		System.out.println(conf.get("size-weight"));
	}
	*/

	public static void main(String[] args) throws Exception {
		int exitCode = ToolRunner.run(new ConfigurationPrinter(), args);
		System.exit(exitCode);
	}

}
