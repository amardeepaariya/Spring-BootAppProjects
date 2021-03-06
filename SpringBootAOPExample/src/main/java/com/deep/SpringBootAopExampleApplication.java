package com.deep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.deep.model.Account;
import com.deep.service.impl.AccountService;
import com.deep.service.impl.AccountServiceImpl;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class SpringBootAopExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootAopExampleApplication.class, args);
		AccountService accountService = ctx.getBean("accountServiceImpl", AccountServiceImpl.class);
		accountService.updateAccountBalance(new Account("6778888886", "Money tranfer"), 3000L);
	}
}