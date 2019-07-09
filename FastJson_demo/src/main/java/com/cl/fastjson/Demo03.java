package com.cl.fastjson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

public class Demo03 {
	public static void main(String[] args) {
		List<Map<String, Object>> list = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		map.put("key1", "zhangs");
		map.put("key2", "lisi");

		Map<String, Object> map2 = new HashMap<>();
		map2.put("key3", 22);
		map2.put("key4", 23);

		list.add(map);
		list.add(map2);

		String string = JSON.toJSONString(list);
		System.out.println(string);

		JSONArray jsonArray = JSON.parseArray(string);
		System.out.println(jsonArray);
	}
}
