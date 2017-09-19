package com.si.samples.xml2obj.transformers;

public class PrintingServiceActivator {
	
	public void printOrder(Object order) {
		Shiporder shiporder = (Shiporder) order;
		System.out.println(shiporder.getShipto().getAddress());
		System.out.println(shiporder.getShipto().getCity());
	}

}
