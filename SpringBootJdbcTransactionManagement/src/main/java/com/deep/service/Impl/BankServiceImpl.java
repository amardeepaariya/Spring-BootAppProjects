package com.deep.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.deep.dao.BankDao;
import com.deep.dao.exception.InsufficientAccountBalanceException;
import com.deep.model.Account;
import com.deep.service.BankService;

@Service
public class BankServiceImpl implements BankService {
	
	@Autowired
	private BankDao bankDao;

	public void setBankDao(BankDao bankDao) {
		this.bankDao = bankDao;
	}

	public BankDao getBankDao() {
		return bankDao;
	}

	
	@Transactional(isolation=Isolation.READ_COMMITTED,propagation=Propagation.REQUIRED,readOnly=false,timeout=100,rollbackFor=Exception.class)
	@Override
	public void transferFund(Account fromAccount, Account toAccount,
			Double amount) throws InsufficientAccountBalanceException {
		getBankDao().withdraw(fromAccount, toAccount, amount);
		getBankDao().deposit(fromAccount, toAccount, amount);
	}
}