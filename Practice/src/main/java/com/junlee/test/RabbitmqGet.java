package com.junlee.test;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.ConsumerCancelledException;
import com.rabbitmq.client.QueueingConsumer;
import com.rabbitmq.client.ShutdownSignalException;

public class RabbitmqGet {
	public static void main(String[] args) throws IOException, TimeoutException, ShutdownSignalException,
			ConsumerCancelledException, InterruptedException {
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("192.168.113.89");
		factory.setPort(5672);
		factory.setUsername("junlee");
		factory.setPassword("123123");
		String queueName = "testq";

		Connection connection = factory.newConnection();

		Channel channel = connection.createChannel();

		channel.queueDeclare(queueName, true, false, false, null);
		channel.basicQos(1);
		QueueingConsumer consumer = new QueueingConsumer(channel);
		channel.basicConsume(queueName, false, consumer);

		while (true) {
			QueueingConsumer.Delivery delivery = consumer.nextDelivery();
			byte[] bts = delivery.getBody();
			System.out.println(new String(bts));
			channel.basicAck(delivery.getEnvelope().getDeliveryTag(), false);
		}
	}
}
