package com.junlee.test;

import net.sf.json.JSONArray;

/**
 * @author JunLee
 *
 */
public class JSONArrayTest {
	public static void main(String[] args) {
		// ����JSONArray
		JSONArray jsonArray = new JSONArray();

		jsonArray.add(0, "ֵ1");
		jsonArray.add(1, "ֵ2");

		System.out.println(jsonArray);
		System.out.println("======================����JSONArray======================\n");

		// ��������
		jsonArray.element("ֵ3");

		System.out.println(jsonArray);
		System.out.println("======================��������======================\n");

		// �����±�������ֵ
		jsonArray.set(0, "�޸ĺ��ֵ1");

		System.out.println(jsonArray);
		System.out.println("======================�����±�������ֵ======================\n");

		// ����,��ӡ
		for (int i = 0; i < jsonArray.size(); i++) {
			System.out.print(jsonArray.get(i) + "\t");
		}

		System.out.println("\n======================����,��ӡ======================\n");
	}
}
