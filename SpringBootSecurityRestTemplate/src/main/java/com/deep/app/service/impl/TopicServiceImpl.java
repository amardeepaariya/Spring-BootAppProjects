package com.deep.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deep.app.dao.TopicDAO;
import com.deep.app.entities.Topic;
import com.deep.app.service.TopicService;
/**
 * @author Amardeep Kumar
 */
@Service
public class TopicServiceImpl implements TopicService {
	
	@Autowired
	private TopicDAO topicDAO;
	
	@Override
	public Topic getTopicById(int topicId) {
		Topic topic = topicDAO.getTopicById(topicId);
		return topic;
	}
	
	@Override
	public List<Topic> getAllTopics(){
		return topicDAO.getAllTopics();
	}
	
	@Override
	public  boolean addTopic(Topic topic){
       if (topicDAO.topicExists(topic.getTitle(), topic.getCategory())) {
    	   return false;
       } else {
    	   topicDAO.addTopic(topic);
    	   return true;
       }
	}
	
	@Override
	public void updateTopic(Topic topic) {
		topicDAO.updateTopic(topic);
	}
	
	@Override
	public void deleteTopic(int topicId) {
		topicDAO.deleteTopic(topicId);
	}
}
