package com.junlee.test;

import net.sf.json.JSONObject;

/**
 * @author JunLee
 *
 */
public class JavaBeanTest {
	public static void main(String[] args) {
		// JavaBean����תjson�ַ���
		Student stu1 = new Student("ѧ��1", "����1");

		JSONObject jsonObject = JSONObject.fromObject(stu1);

		System.out.println(jsonObject);
		System.out.println("======================JavaBean����תjson�ַ���======================\n");

		// json�ַ���תJavaBean
		String jsonStr = "{\"password\":\"111111\",\"username\":\"lwc\"}";

		Student stu2 = (Student) JSONObject.toBean(JSONObject.fromObject(jsonStr), Student.class);

		System.out.println(stu2.getPassword());
	}
}
