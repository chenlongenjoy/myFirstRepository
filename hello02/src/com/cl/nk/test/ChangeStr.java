package com.cl.nk.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * 现有字符串char[] text，实现函数char[] drawChar(char[]
 * text)，找出text中重复出现最多的字符，然后将该字符移到text的最前端，生成一个新的字符串。
 * 假设重复出现最多的字符只有一个。请充分考虑内存和性能效率。 举例： “abcaba”，转换后成为“aaabcb”。
 * 
 * @author cl
 *
 */
public class ChangeStr {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
        	String string = sc.next();
        	System.out.println(getStr(string));
        }

	}
	
	public static String getStr(String string){
		char[] cs = string.toCharArray();
		Map<Character, Integer> map=new LinkedHashMap<>();
		for (int i = 0; i < cs.length; i++) {
			map.put(cs[i], map.getOrDefault(cs[i], 0)+1);
		}
		
		List<Map.Entry<Character, Integer>> list=new ArrayList<>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {

			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				return o2.getValue()-o1.getValue();
			}
		});
		String s = string.replaceAll(list.get(0).getKey()+"", "");
		String ret="";
		for (int i = 0; i < list.get(0).getValue(); i++) {
			ret+=list.get(0).getKey();
		}
		return ret+s;
	}

}
