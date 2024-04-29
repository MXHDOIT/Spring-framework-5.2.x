package com.spring.test.impl;

import com.spring.test.service.UserService;

/**
 * @author: maxinhang.
 * @version: 2024/4/30 11:12.
 */
public class UserServiceImpl implements UserService{
	@Override
	public String getName() {
		return "Hello World";
	}
}
