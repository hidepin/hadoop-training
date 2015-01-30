package org.func.sample.hadoop;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.apache.hadoop.conf.Configuration;

public class MaxTemperature {

	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.addResource("configuration-1.xml");
		assertThat(conf.get("color"),is("yellow"));
		assertThat(conf.getInt("size",0), is(10));
		assertThat(conf.get("breadth"), "wide", is("wide"));
		System.out.println(conf.get("color"));
		System.out.println(conf.getInt("size",0));
		System.out.println(conf.get("breadth","wide"));
		System.out.println(conf.get("size-weight"));
	}

}
