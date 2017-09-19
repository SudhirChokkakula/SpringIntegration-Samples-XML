package com.si.samples.routers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RoutersDemo {

	public static void main(String[] args) {
		
		new ClassPathXmlApplicationContext("/META-INF/spring/integration/routers/si-routers-config.xml");
	}

}
