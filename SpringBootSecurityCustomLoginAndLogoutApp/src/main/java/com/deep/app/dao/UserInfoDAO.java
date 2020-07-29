package com.deep.app.dao;
import com.deep.app.entities.UserInfo;

public interface UserInfoDAO {
	public abstract UserInfo getActiveUser(String userName);
}