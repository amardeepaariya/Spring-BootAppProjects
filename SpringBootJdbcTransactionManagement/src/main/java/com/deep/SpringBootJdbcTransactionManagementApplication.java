package com.deep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.deep.dao.exception.InsufficientAccountBalanceException;
import com.deep.model.Account;
import com.deep.service.BankService;
import com.deep.service.Impl.BankServiceImpl;

@SpringBootApplication
@EnableTransactionManagement(proxyTargetClass=true)
public class SpringBootJdbcTransactionManagementApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootJdbcTransactionManagementApplication.class,
				args);
		BankService bankService = ctx.getBean("bankServiceImpl", BankServiceImpl.class);
		Account fromAccount = new Account();
		fromAccount.setAccountNumber(1122330056L);

		Account toAccount = new Account();
		toAccount.setAccountNumber(3355330099L);

		try {
			bankService.transferFund(fromAccount, toAccount, 1000.00);
		} catch (InsufficientAccountBalanceException e) {
			e.printStackTrace();
		}
		ctx.close();

	}
}