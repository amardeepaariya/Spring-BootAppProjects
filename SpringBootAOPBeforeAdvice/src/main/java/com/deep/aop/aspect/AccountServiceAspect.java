package com.deep.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.deep.model.Account;

@Aspect
@Component
public class AccountServiceAspect {

	@Before(value = "execution(* com.deep.service.impl.AccountServiceImpl.*(..)) and args(account,..)&& @annotation(auditable) ")
	public void beforeAdvice(JoinPoint joinPoint,Account account,Auditable auditable){
		System.out.println("Before method:"+joinPoint.getSignature());
		
		System.out.println("Audit account access:"+account.getAccountNumber()+", Audit destination:"+auditable.value());
	}
}
