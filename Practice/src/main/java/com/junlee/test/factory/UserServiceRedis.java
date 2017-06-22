package com.junlee.test.factory;

import org.springframework.stereotype.Component;

@Component("userserviceredis")
public class UserServiceRedis implements IUserService {

	@Override
	public String getDisPlayName(String userGuid) {
		System.out.println("UserServiceRedis >>>> do fun getDisPlayName ");

		return "UserServiceRedis";
	}
}
