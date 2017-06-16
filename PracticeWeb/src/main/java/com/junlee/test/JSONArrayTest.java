package com.junlee.test;

import net.sf.json.JSONArray;

/**
 * @author JunLee
 *
 */
public class JSONArrayTest {
	public static void main(String[] args) {
		// 创建JSONArray
		JSONArray jsonArray = new JSONArray();

		jsonArray.add(0, "值1");
		jsonArray.add(1, "值2");

		System.out.println(jsonArray);
		System.out.println("======================创建JSONArray======================\n");

		// 增加属性
		jsonArray.element("值3");

		System.out.println(jsonArray);
		System.out.println("======================增加属性======================\n");

		// 根据下标设置新值
		jsonArray.set(0, "修改后的值1");

		System.out.println(jsonArray);
		System.out.println("======================根据下标设置新值======================\n");

		// 遍历,打印
		for (int i = 0; i < jsonArray.size(); i++) {
			System.out.print(jsonArray.get(i) + "\t");
		}

		System.out.println("\n======================遍历,打印======================\n");
	}
}
