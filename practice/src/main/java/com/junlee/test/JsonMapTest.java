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
		// Mapתjson�ַ���
		Map<String, Student> map = new HashMap<String, Student>();

		map.put("1", new Student("����1", "����1"));
		map.put("2", new Student("����2", "����2"));

		JSONObject jsonObject = JSONObject.fromObject(map);
		System.out.println(jsonObject);

		System.out.println("======================Mapתjson�ַ���======================\n");

		// json�ַ���תMap
		String jsonStr = "{\"2\":{\"password\":\"222222\",\"username\":\"nxj\"},\"1\":{\"password\":\"111111\",\"username\":\"lwc\"}}";

		@SuppressWarnings("rawtypes")
		Map map1 = JSONObject.fromObject(jsonStr);

		// ��ȡ���е�keyֵ
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

		System.out.println("======================Mapתjson�ַ���======================\n");
	}
}
