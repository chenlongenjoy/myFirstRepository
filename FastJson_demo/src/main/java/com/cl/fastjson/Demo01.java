package com.cl.fastjson;

import java.util.Date;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class Demo01 {
	public static void main(String[] args) {
		Group group = new Group();
		group.setId(0L);
		group.setName("admin");

		User guestUser = new User();
		guestUser.setId(2L);
		guestUser.setName("guest");

		User rootUser = new User();
		rootUser.setId(3L);
		rootUser.setName("root");

		group.getUsers().add(guestUser);
		group.getUsers().add(rootUser);

		String jsonString = JSON.toJSONString(group,true);

		System.out.println(jsonString);
		
		Group group2 = JSON.parseObject(jsonString, Group.class);
		System.out.println(group2);
	
		System.out.println(JSON.toJSONString(new Date(),SerializerFeature.WriteDateUseDateFormat));

	}

}
