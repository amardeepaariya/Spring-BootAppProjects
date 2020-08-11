package com.deep.service;

import com.deep.dao.exception.InsufficientAccountBalanceException;
import com.deep.model.Account;

public interface BankService {
	public abstract void transferFund(Account fromAccount,Account toAccount,Double amount)throws InsufficientAccountBalanceException;
}