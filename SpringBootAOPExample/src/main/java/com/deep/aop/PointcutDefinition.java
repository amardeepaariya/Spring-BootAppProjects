package com.deep.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutDefinition {

	@Pointcut("within(com.deep.web..*)")
	public void webLayer() {

	}

	@Pointcut("within(com.deep.service..*)")
	public void serviceLayer() {

	}

	@Pointcut("within(com.deep.dao..*)")
	public void dataAccessLayer() {

	}
}