package com.fabio.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class ArroundAdviceTempoExecucao implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("Arround Advice");
		invocation.proceed();
		return null;
	}

}
