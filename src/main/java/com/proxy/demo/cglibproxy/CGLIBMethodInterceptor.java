package com.proxy.demo.cglibproxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CGLIBMethodInterceptor implements MethodInterceptor {
	
	private Object targetObj;

	public CGLIBMethodInterceptor(Object targetObj) {
		this.targetObj = targetObj;
	}

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		System.out.println("start cglib proxy...");
		Object result = method.invoke(this.targetObj, args);
		System.out.println("end cglib proxy...");
		return result;
	}
}
