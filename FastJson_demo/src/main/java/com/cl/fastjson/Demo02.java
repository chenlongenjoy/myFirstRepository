package com.cl.fastjson;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class Demo02 {
	
	public static void main(String[] args) {
		Map<String,Object> map=new HashMap<>();
		map.put("userName", "张三");
		map.put("age", 23);
		map.put("address", "广州");
		
		String string = JSON.toJSONString(map);
		System.out.println(string);
		 
		Map<String,Object> map2 = JSON.parseObject(string, Map.class);
        for (String s:map2.keySet()) {
			System.out.println("键是："+s+"值是:"+map2.get(s));
		}
		
	
	}

}
