package com.pluralsight.calengine;

public class Main {

    public static void main(String[] args) {
        MyServiceName service = org.apache.cxf.jaxrs.client.JAXRSClientFactory.create("http://localhost:8080/cxfrestsample", MyServiceName.class);
        String out = service.getClichedMessage();
        System.out.println("service response was: " + out);
    }

}
