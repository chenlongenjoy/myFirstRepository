package com.cl.nk.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListParamTest {
	public static void resetList(List<Integer> dataList) {
		List<Integer> list = dataList.subList(2, 4);
		System.out.println(list);
		list.set(0, 40);
		System.out.println(list);
		dataList = new ArrayList<Integer>(dataList);
		System.out.println(dataList);
		dataList.add(50);
	}

	public static void setOne(List<Integer> dataList) {
		dataList.set(3, 100);
	}

	public static void main(String[] args) {
		List<Integer> dataList = new ArrayList<Integer>(Arrays.asList(10, 20, 30, null));
		System.out.println(dataList);
		resetList(dataList);
		System.out.println(dataList);
		setOne(dataList);
		System.out.println(dataList);
		int sum = 0;
		for (Integer v : dataList) {
			sum += v;
		}
		System.out.println(sum);
	}
}