package com.junlee.test.factory;

public class UserServiceFactory {
	public IUserService create() {
		return new UserServiceDB();
		// return new UserServiceRedis();
	}
}
