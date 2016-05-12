package com.proxy.demo;

import com.proxy.demo.cglibproxy.CGLIBMethodInterceptor;
import com.proxy.demo.service.BusinessServiceImpl;

import net.sf.cglib.proxy.Enhancer;

public class CGLIBProxyMain {
	
	public static void main(String[] args) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(BusinessServiceImpl.class);
		enhancer.setCallback(new CGLIBMethodInterceptor(new BusinessServiceImpl()));
		BusinessServiceImpl businessService = (BusinessServiceImpl) enhancer.create();
		businessService.doBusiness();
	}
}
