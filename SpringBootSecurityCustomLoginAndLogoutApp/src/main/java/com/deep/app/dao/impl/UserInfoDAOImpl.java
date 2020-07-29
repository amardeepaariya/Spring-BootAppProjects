package com.deep.app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.deep.app.dao.UserInfoDAO;
import com.deep.app.entities.UserInfo;

@Repository
@Transactional
public class UserInfoDAOImpl implements UserInfoDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public UserInfo getActiveUser(String userName) {
		UserInfo userInfo = new UserInfo();
		short ENABLED = 1;
		List<?> list = entityManager.createQuery("SELECT u FROM UserInfo u WHERE userName=? and enabled=?")
				.setParameter(1, userName).setParameter(2, ENABLED).getResultList();
		if (!list.isEmpty()) {
			userInfo = (UserInfo) list.get(0);
		}
		return userInfo;
	}
}