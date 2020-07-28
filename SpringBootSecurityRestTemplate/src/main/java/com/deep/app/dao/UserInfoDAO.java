package com.deep.app.dao;
import com.deep.app.entities.UserInfo;
/**
 * @author Amardeep Kumar
 */
public interface UserInfoDAO {
	public abstract UserInfo getActiveUser(String userName);
}