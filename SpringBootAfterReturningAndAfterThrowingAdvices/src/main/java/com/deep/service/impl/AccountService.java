package com.deep.service.impl;

import com.deep.model.Account;

public interface AccountService {
	public abstract Account getAccountByCustomerId(String customerId)
			throws Exception;
}