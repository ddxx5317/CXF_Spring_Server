package com.cxf.ws.utils;

import javax.xml.ws.Endpoint;
import com.ws.cxf.impl.HelloWordImpl;


public class ServerMain {

	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:12345/sayHi", new HelloWordImpl());
		//��ӷ�������in��out������
		//dp.getInInterceptors().add(new AuthInterceptor());
		System.out.println("����webService�ɹ���");
	}
}
 