package com.junlee.test.factory;

import org.springframework.stereotype.Component;

@Component("userservicedb")
public class UserServiceDB implements IUserService {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String getDisPlayName(String userGuid) {
		System.out.println("UserServiceDB >>>> do fun getDisPlayName " + message);

		return "UserServiceDB";
	}
}
