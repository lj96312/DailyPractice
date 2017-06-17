package com.junlee.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;

/**
 * @author JunLee
 *
 */
public class JSONArrayListTest {
	public static void main(String[] args) {
		// Listת��JSONArray
		List<Student> lst = new ArrayList<Student>();

		lst.add(new Student("����1", "����1"));
		lst.add(new Student("����2", "����2"));

		JSONArray jsonArray = JSONArray.fromObject(lst);

		System.out.println(jsonArray);
		System.out.println("======================Listת��JSONArray======================\n");

		// JSONArrayת��List
		@SuppressWarnings("unchecked")
		List<Student> list2 = JSONArray.toList(jsonArray, new Student(), new JsonConfig());
		Iterator<Student> ite = list2.iterator();

		while (ite.hasNext()) {
			Student stu = ite.next();

			System.out.println(stu.getUsername() + "+" + stu.getPassword());
		}

		System.out.println("======================JSONArrayת��List======================\n");
	}
}
