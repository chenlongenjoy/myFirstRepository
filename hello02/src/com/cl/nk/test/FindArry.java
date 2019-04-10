package com.cl.nk.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 给定一个字符串str，和一个字母ch，请实现相应的代码求出一个数组，使数组中每个数字表示该位置与字母ch之间的最短距离。
 * 比如str=”lexinfintech” ch=”i” 则输出为：[3,2,1,0,1,1,0,1,2,3,4,5]
 * 
 * @author cl
 *
 */
public class FindArry {
	
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
        	String string = sc.next();
        	String str = sc.next();
        	getArry(string, str.toCharArray()[0]);
        }
	}

	
	public static void getArry(String string,char ch){
		char[] cs = string.toCharArray();
		List<Integer> list=new ArrayList<>();
		for (int i = 0; i < cs.length; i++) {
			if (cs[i]==ch) {
				list.add(i);
			}
		}
		StringBuilder sb=new StringBuilder("[");
		if (list.size()==1) {
			for (int i = 0; i < cs.length; i++) {
				sb.append(Math.abs(i-list.get(0))).append(",");
			}
		}
		if (list.size()>1) {
			for (int i = 0;i<list.get(0); i++) {
				sb.append(list.get(0)-i).append(",");
			}
			for (int i = 1; i < list.size(); i++) {
				for (int j = list.get(i-1); j < list.get(i); j++) {
					int dis1=Math.abs(list.get(i-1)-j);
					int dis2=Math.abs(list.get(i)-j);
					int dis=dis1<dis2?dis1:dis2;
					sb.append(dis).append(",");
				}
			}
			
			for (int i = list.get(list.size()-1); i < cs.length; i++) {
				sb.append(i-list.get(list.size()-1)).append(",");
			}
		}
		sb.delete(sb.length()-1, sb.length());
		sb.append("]");
		System.out.println(sb);
	}
}
