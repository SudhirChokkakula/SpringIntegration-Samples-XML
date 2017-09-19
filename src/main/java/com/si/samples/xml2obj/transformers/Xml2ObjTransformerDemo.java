package com.si.samples.xml2obj.transformers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Xml2ObjTransformerDemo {

	public static void main(String[] args) {
		
		new ClassPathXmlApplicationContext("/META-INF/spring/integration/transformers/si-xml2obj-transformer.xml");
	}

}
