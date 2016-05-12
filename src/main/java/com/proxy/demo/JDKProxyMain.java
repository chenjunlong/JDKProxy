package com.proxy.demo;

import java.lang.reflect.Proxy;

import com.proxy.demo.jdkproxy.JDKInvocationHandler;
import com.proxy.demo.service.BusinessServiceImpl;
import com.proxy.demo.service.BusinessServices;

public class JDKProxyMain {

	public static void main(String[] args) {
		BusinessServices businessService = (BusinessServices) Proxy.newProxyInstance(
				BusinessServiceImpl.class.getClassLoader(), BusinessServiceImpl.class.getInterfaces(),
				new JDKInvocationHandler(new BusinessServiceImpl()));
		businessService.doBusiness();
	}
}
