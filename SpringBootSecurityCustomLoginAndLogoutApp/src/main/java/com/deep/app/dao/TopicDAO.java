package com.deep.app.dao;

import java.util.List;

import com.deep.app.entities.Topic;

public interface TopicDAO {
	public abstract List<Topic> getAllTopics();
}