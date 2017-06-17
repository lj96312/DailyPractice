package com.junlee.test;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * @author JunLee
 *
 */
public class JsonListTest {
	public static void main(String[] args) {
		// Listתjson�ַ���
		List<Student> lst = new ArrayList<Student>();

		lst.add(new Student("����1", "����1"));
		lst.add(new Student("����2", "����2"));

		JSONArray jsonArray = JSONArray.fromObject(lst);

		System.out.println(jsonArray);
		System.out.println("======================Listתjson�ַ���======================\n");

		// json�ַ���תList
		List<Student> lst1 = new ArrayList<Student>();
		String jsonStr = "[{\"password\":\"����1\",\"username\":\"����1\"},{\"password\":\"����2\",\"username\":\"����2\"}]";
		JSONArray jsonArray1 = JSONArray.fromObject(jsonStr);

		for (int i = 0; i < jsonArray1.size(); i++) {
			JSONObject jsonObject = jsonArray1.getJSONObject(i);

			Student stu2 = (Student) JSONObject.toBean(jsonObject, Student.class);

			lst1.add(stu2);
		}

		System.out.println(lst1.get(0).getPassword());

		System.out.println("======================json�ַ���תList======================\n");
	}
}
