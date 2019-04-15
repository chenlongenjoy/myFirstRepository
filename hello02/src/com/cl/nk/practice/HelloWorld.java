package com.cl.nk.practice;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
	
	public static void main(String[] args) {
		List<Integer> list=getResult();
	    for (Integer i : list) {
			System.out.println(i);
		}
	}

	public static void m1(){
		int i=2;
		System.out.println("i="+i);
	}
	
	public static List<Integer> getResult(){
		List<Integer> list=new ArrayList<>();
	
		for (int i = 1089; i < 1090; i++) {
			String s=i*9+"";
			StringBuilder sb=new StringBuilder(s);
			StringBuilder reverse = sb.reverse();
			System.out.println(sb);
			System.out.println(sb.reverse());
			System.out.println("***************");
			if (Integer.valueOf(reverse.toString()).equals(i)) {
				System.out.println(i);
				list.add(i);
			}
		}
		return list;
		
	}
}
