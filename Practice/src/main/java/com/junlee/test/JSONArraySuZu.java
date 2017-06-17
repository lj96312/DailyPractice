package com.junlee.test;

import net.sf.json.JSONArray;

/**
 * @author JunLee
 *
 */
public class JSONArraySuZu {
	public static void main(String[] args) {
		// Java数组转JSONArray
		boolean[] boolArray = new boolean[] { true, false, true, true };

		JSONArray jsonArray = JSONArray.fromObject(boolArray);

		System.out.println(jsonArray);
		System.out.println("======================Java数组转JSONArray======================\n");

		// JSONArray转Java数组
		Object[] obj = jsonArray.toArray();

		for (Object o : obj) {
			System.out.println(o + "\t");
		}

		System.out.println("======================JSONArray转Java数组======================\n");
	}
}
