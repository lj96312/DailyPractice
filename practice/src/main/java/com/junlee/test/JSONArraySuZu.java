package com.junlee.test;

import net.sf.json.JSONArray;

/**
 * @author JunLee
 *
 */
public class JSONArraySuZu {
	public static void main(String[] args) {
		// Java����תJSONArray
		boolean[] boolArray = new boolean[] { true, false, true, true };

		JSONArray jsonArray = JSONArray.fromObject(boolArray);

		System.out.println(jsonArray);
		System.out.println("======================Java����תJSONArray======================\n");

		// JSONArrayתJava����
		Object[] obj = jsonArray.toArray();

		for (Object o : obj) {
			System.out.println(o + "\t");
		}

		System.out.println("======================JSONArrayתJava����======================\n");
	}
}
