package com.junlee.test;

import net.sf.json.JSONObject;

/**
 * @author JunLee
 *
 */
public class JavaBeanTest {
	public static void main(String[] args) {
		// JavaBean对象转json字符串
		Student stu1 = new Student("学生1", "密码1");

		JSONObject jsonObject = JSONObject.fromObject(stu1);

		System.out.println(jsonObject);
		System.out.println("======================JavaBean对象转json字符串======================\n");

		// json字符串转JavaBean
		String jsonStr = "{\"password\":\"111111\",\"username\":\"lwc\"}";

		Student stu2 = (Student) JSONObject.toBean(JSONObject.fromObject(jsonStr), Student.class);

		System.out.println(stu2.getPassword());
	}
}
