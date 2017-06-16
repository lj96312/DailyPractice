package com.junlee.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import net.sf.json.JSONObject;

/**
 * @author JunLee
 *
 */
public class JsonMapTest {
	public static void main(String[] args) {
		// Map转json字符串
		Map<String, Student> map = new HashMap<String, Student>();

		map.put("1", new Student("姓名1", "密码1"));
		map.put("2", new Student("姓名2", "密码2"));

		JSONObject jsonObject = JSONObject.fromObject(map);
		System.out.println(jsonObject);

		System.out.println("======================Map转json字符串======================\n");

		// json字符串转Map
		String jsonStr = "{\"2\":{\"password\":\"222222\",\"username\":\"nxj\"},\"1\":{\"password\":\"111111\",\"username\":\"lwc\"}}";

		@SuppressWarnings("rawtypes")
		Map map1 = JSONObject.fromObject(jsonStr);

		// 获取所有的key值
		@SuppressWarnings("rawtypes")
		Set set = map1.keySet();

		@SuppressWarnings("rawtypes")
		Iterator ite = set.iterator();

		while (ite.hasNext()) {
			String key = (String) ite.next();

			JSONObject jsonObject1 = JSONObject.fromObject(map1.get(key));

			Student stu = (Student) JSONObject.toBean(jsonObject1, Student.class);

			System.out.println(key + "\t" + stu.getUsername());
		}

		System.out.println("======================Map转json字符串======================\n");
	}
}
