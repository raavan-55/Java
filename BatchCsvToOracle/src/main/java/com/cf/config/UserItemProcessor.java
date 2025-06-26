package com.cf.config;

import org.springframework.batch.item.ItemProcessor;

import com.cf.model.User;

public class UserItemProcessor implements ItemProcessor<User, User> {

	@Override
	public User process(User user) throws Exception {
		
		return user;
	}

}
