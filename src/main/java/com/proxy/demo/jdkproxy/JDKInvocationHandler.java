package com.proxy.demo.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JDKInvocationHandler implements InvocationHandler {
	
	private Object targetObject;
	
	public JDKInvocationHandler(Object targetObject) {
		this.targetObject = targetObject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("start jdk proxy...");
		Object result = method.invoke(targetObject, args);
		System.out.println("end jdk proxy...");
		return result;
	}

}
