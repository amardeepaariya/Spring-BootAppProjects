package com.deep.dao;

import com.deep.dao.exception.InsufficientAccountBalanceException;
import com.deep.model.Account;

public interface BankDao {
	public abstract void deposit(Account fromAccount,Account toAccount,Double amount);
	public abstract void withdraw(Account fromAccount,Account toAccount,Double amount) throws InsufficientAccountBalanceException;
}