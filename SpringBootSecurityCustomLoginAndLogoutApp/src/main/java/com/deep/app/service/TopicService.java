package com.deep.app.service;

import java.util.List;

import org.springframework.security.access.annotation.Secured;

import com.deep.app.entities.Topic;

public interface TopicService {
	 @Secured ({"ROLE_ADMIN"})
	 public abstract List<Topic> getAllTopics();
}