package com.deep.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deep.app.dao.TopicDAO;
import com.deep.app.entities.Topic;
import com.deep.app.service.TopicService;
@Service
public class TopicServiceImpl implements TopicService {
	
	@Autowired
	private TopicDAO topicDAO;
	
	@Override
	public List<Topic> getAllTopics(){
		return topicDAO.getAllTopics();
	}
}