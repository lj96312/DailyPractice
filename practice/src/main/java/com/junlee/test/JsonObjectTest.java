package com.junlee.test;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * @author JunLee
 *
 */
public class JsonObjectTest {
	public static void main(String[] args) {
		// 创建JSONObject
		JSONObject jsonObject = new JSONObject();

		jsonObject.put("键1", "值1");
		jsonObject.put("键2", "值2");

		System.out.println(jsonObject);
		System.out.println("======================普通键值测试======================\n");

		// 增加属性,同put(文档说会自动判断调用accumulate,)
		jsonObject.element("键3", "值3");

		System.out.println(jsonObject);
		System.out.println("======================增加属性,同put======================\n");

		// 增加属性,如果键已存在,则自动将键当做数组
		jsonObject.accumulate("键3", "值4");

		System.out.println(jsonObject);
		System.out.println("======================增加属性,如果键已存在,则自动将键当做数组======================\n");

		// 根据key返回,打印:
		System.out.println("键1对应的值:" + jsonObject.get("键1"));
		System.out.println("键3对应的值:" + jsonObject.get("键3"));
		System.out.println("======================根据key返回,打印======================\n");

		// 判读输出对象的类型
		boolean isArray = jsonObject.isArray();
		boolean isEmpty = jsonObject.isEmpty();
		boolean isNullObject = jsonObject.isNullObject();

		System.out.println("是否数组:" + isArray + " 是否空:" + isEmpty + " 是否空对象:" + isNullObject);
		System.out.println("======================判读输出对象的类型======================\n");

		// 把JSONArray增加到JSONObject中
		JSONArray jsonArray = new JSONArray();
		jsonArray.add(0, "jsonArray值1");
		jsonArray.add(1, "jsonArray值2");
		jsonObject.put("键5", jsonArray);

		System.out.println("键5:" + jsonArray);
		System.out.println(jsonObject);
		System.out.println("======================把JSONArray增加到JSONObject中======================\n");
	}
}
