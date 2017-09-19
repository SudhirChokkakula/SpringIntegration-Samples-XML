package com.si.samples.transformers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransformersDemo {

	public static void main(String[] args) {
		
		new ClassPathXmlApplicationContext("/META-INF/spring/integration/transformers/si-config.xml");

	}

}
