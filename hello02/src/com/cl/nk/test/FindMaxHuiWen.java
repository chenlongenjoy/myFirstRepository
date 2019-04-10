package com.cl.nk.test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class FindMaxHuiWen {
	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
        	String string = sc.next();
        	System.out.println(findMaxHuiWen(string));
        }
	}

	public static String findMaxHuiWen(String string){
		Set<String> set=new LinkedHashSet<>();
		for (int i = 0; i < string.length(); i++) {
			for (int j = i+1; j <= string.length(); j++) {
				String str=string.substring(i, j);
				if (isHuiWen(str)) {
					set.add(str);
				}
			}
		}
		List<String> list=new ArrayList<>();
		for (String string2 : set) {
			list.add(string2);
		}
		String max=list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (max.length()<list.get(i).length()) {
				max=list.get(i);
			}
		}
		return max;
		
	}
	public static boolean isHuiWen(String string) {
		char[] cs = string.toCharArray();
		for (int i = 0; i < cs.length/2; i++) {
			if (cs[i] != cs[cs.length - i - 1]) {
				return false;
			}
		}
		return true;
	}
}
