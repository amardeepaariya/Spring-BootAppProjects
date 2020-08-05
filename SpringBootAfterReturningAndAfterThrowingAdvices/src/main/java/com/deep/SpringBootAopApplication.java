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
public class SpringBootAopApplication {

	public static void main(String[] args)  {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootAopApplication.class, args);
		AccountService accountService = ctx.getBean("accountServiceImpl", AccountServiceImpl.class);
		
		Account account;
		try {
			account = accountService.getAccountByCustomerId("C67669811");
			//account = accountService.getAccountByCustomerId(null);
			if(account != null)
				System.out.println(account.getAccountNumber()+"\t"+account.getAccountDescrption());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}