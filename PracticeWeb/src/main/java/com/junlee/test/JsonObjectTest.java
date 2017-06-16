package com.junlee.test;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * @author JunLee
 *
 */
public class JsonObjectTest {
	public static void main(String[] args) {
		// ����JSONObject
		JSONObject jsonObject = new JSONObject();

		jsonObject.put("��1", "ֵ1");
		jsonObject.put("��2", "ֵ2");

		System.out.println(jsonObject);
		System.out.println("======================��ͨ��ֵ����======================\n");

		// ��������,ͬput(�ĵ�˵���Զ��жϵ���accumulate,)
		jsonObject.element("��3", "ֵ3");

		System.out.println(jsonObject);
		System.out.println("======================��������,ͬput======================\n");

		// ��������,������Ѵ���,���Զ�������������
		jsonObject.accumulate("��3", "ֵ4");

		System.out.println(jsonObject);
		System.out.println("======================��������,������Ѵ���,���Զ�������������======================\n");

		// ����key����,��ӡ:
		System.out.println("��1��Ӧ��ֵ:" + jsonObject.get("��1"));
		System.out.println("��3��Ӧ��ֵ:" + jsonObject.get("��3"));
		System.out.println("======================����key����,��ӡ======================\n");

		// �ж�������������
		boolean isArray = jsonObject.isArray();
		boolean isEmpty = jsonObject.isEmpty();
		boolean isNullObject = jsonObject.isNullObject();

		System.out.println("�Ƿ�����:" + isArray + " �Ƿ��:" + isEmpty + " �Ƿ�ն���:" + isNullObject);
		System.out.println("======================�ж�������������======================\n");

		// ��JSONArray���ӵ�JSONObject��
		JSONArray jsonArray = new JSONArray();
		jsonArray.add(0, "jsonArrayֵ1");
		jsonArray.add(1, "jsonArrayֵ2");
		jsonObject.put("��5", jsonArray);

		System.out.println("��5:" + jsonArray);
		System.out.println(jsonObject);
		System.out.println("======================��JSONArray���ӵ�JSONObject��======================\n");
	}
}
