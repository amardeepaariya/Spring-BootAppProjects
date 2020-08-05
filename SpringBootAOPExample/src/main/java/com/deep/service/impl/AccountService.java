package com.deep.service.impl;

import com.deep.model.Account;

public interface AccountService {
	public abstract void updateAccountBalance(Account account, Long amount);
}