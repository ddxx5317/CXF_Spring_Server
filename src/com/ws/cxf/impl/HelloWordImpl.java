package com.ws.cxf.impl;

import java.util.Date;
import java.util.List;

import javax.jws.WebService;

import com.cxf.ws.bean.Cat;
import com.cxf.ws.bean.User;
import com.cxf.ws.service.UserService;
import com.cxf.ws.service.impl.UserServiceImpl;
import com.ws.cxf.HelloWord;

@WebService(endpointInterface="com.ws.cxf.HelloWord",serviceName="HelloWordImpl")
public class HelloWordImpl implements HelloWord {

	@Override
	public String sayHi(String name) {
		
		return name+",您好！"+","+"现在时间是："+new Date();
	}

	@Override
	public List<Cat> getCatsByUser(User user) {
		UserService service = new UserServiceImpl();
		return service.getCatsByUser(user);
	}

}
