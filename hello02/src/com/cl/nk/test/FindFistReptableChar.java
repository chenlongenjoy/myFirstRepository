package com.cl.nk.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import sun.security.util.Length;

public class FindFistReptableChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String string = sc.next();
            System.out.println(getMaxHuiWen(string));
		}
		sc.close();
	}

	public static boolean isValidate(String a, String b) {
		boolean flag = false;
		for (int i = 1; i < a.length(); i++) {
			StringBuilder sb = new StringBuilder(a.substring(i, a.length()));
			sb.append(a.substring(0, i));
			if (sb.toString().equals(b)) {
				flag = true;
				break;
			}
		}

		return flag;
	}

	public static void getArr(int[] a, int[] b) {
		Set<Integer> set = new TreeSet<>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		for (int i = 0; i < b.length; i++) {
			set.add(b[i]);
		}
		for (Integer integer : set) {
			System.out.print(integer);
		}
		System.out.println();
	}

	public static String getRetStr(String string, char c) {
		char[] cs = string.toCharArray();
		int count = 0;
		for (int i = 0; i < cs.length; i++) {
			if (cs[i] == c) {
				break;
			}
			count++;
		}
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < cs.length; i++) {
			sb.append(Math.abs(i - count)).append(",");
		}
		sb.substring(0, (sb.length() - 2));
		sb.append("]");
		return sb.toString();

	}

	public static String getMaxHuiWen(String string) {
		int m = string.length();
		List<String> list=new ArrayList<>();
		for (int i = 0; i < m; i++) {
			for (int j = i+1; j < m; j++) {
				String substring = string.substring(i, j);
				if (isHuiWen(substring)) {
					list.add(substring);
				}
			}
		}
		Collections.sort(list);
		System.out.println(list);
		return list.get(list.size()-1);

	}

	public static boolean isHuiWen(String string) {
		char[] cs = string.toCharArray();
		for (int i = 0; i < cs.length / 2; i++) {
			if (cs[i] != cs[cs.length - i-1]) {
				return false;
			}
		}
		return true;
	}
}
