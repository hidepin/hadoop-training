package org.func.sample.hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.util.Tool;

public class ConfigurationPrinter extends Configured implements Tool {

	static {
		Configuration.addDefaultResource("hdfs-site.xml");
		Configuration.addDefaultResource("mapred-site.xml");
		Configuration.addDefaultResource("yarn-site.xml");
	}

	public int run(String[] arg0) throws Exception {
		Configuration conf = getConf();

		for (java.util.Map.Entry<String, String> entry: conf) {
			System.out.printf("%s=%s\n",entry.getKey(), entry.getValue());
		}
		return 0;
	}

}