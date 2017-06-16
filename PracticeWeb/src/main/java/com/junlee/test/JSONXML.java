package com.junlee.test;

import net.sf.json.JSON;
import net.sf.json.JSONObject;
import net.sf.json.xml.XMLSerializer;

/**
 * @author JunLee
 *
 */
public class JSONXML {
	public static void main(String[] args) {
		// XMLתJSON
		String xml = "<root>" + "<name type='type'>zhaipuhong</name>" + "<gender>male</gender>" + "<birthday>"
				+ "<year>1970</year>" + "<month>12</month>" + "<day>17</day>" + "</birthday>" + "</root>";

		XMLSerializer xmlSerializer = new XMLSerializer();
		JSON json = xmlSerializer.read(xml);

		System.out.println(json.toString());
		System.out.println("======================XMLתJSON======================\n");

		// JSONתXML
		String jsondata = "{\"root\":{" + "\"name\":\"zhaipuhong\"," + "\"gender\":\"male\"," + "\"birthday\":{"
				+ "\"year\":\"1970\"," + "\"month\":\"12\"," + "\"day\":\"17\"" + "}" + "}" + "}";
		JSONObject jsonObject = JSONObject.fromObject(jsondata);

		String xmlstr = new XMLSerializer().write(jsonObject);

		System.out.println(xmlstr);
		System.out.println("======================JSONתXML======================\n");
	}
}
