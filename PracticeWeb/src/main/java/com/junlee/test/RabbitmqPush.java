package com.junlee.test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class RabbitmqPush {
	public static void main(String[] args) throws UnsupportedEncodingException, IOException, TimeoutException {
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("192.168.113.89");
		factory.setPort(5672);
		factory.setUsername("junlee");
		factory.setPassword("123123");
		String queueName = "testq";

		Connection connection = factory.newConnection();

		Channel channel = connection.createChannel();
		channel.queueDeclare(queueName, true, false, false, null);

		String msg = "Hello";
		channel.basicPublish("", queueName, null, msg.getBytes("UTF-8"));

		channel.close();
		connection.close();
	}
}
