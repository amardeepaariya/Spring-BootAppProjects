package com.deep.app.dao.impl;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.deep.app.dao.TopicDAO;
import com.deep.app.entities.Topic;

@Transactional
@Repository
public class TopicDAOImpl implements TopicDAO {
	
	@PersistenceContext	
	private EntityManager entityManager;	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Topic> getAllTopics() {
		String SQL = "FROM Topic as t ORDER BY t.topicId";
		return entityManager.createQuery(SQL).getResultList();
	}	
}