package com.cl.nk.test;

import java.util.ArrayList;
import java.util.List;

public class FindUglyNum {
	public static void main(String[] args) {
		System.out.println(getUglyNum(8));

	}

	public static int getUglyNum(int n){
		int i=0;
		int count=0;
		while(true){
			++i;
			if (isUglyNum(i)) {
				count++;
			}
			if (count==n) {
				break;
			}
		}
		return i;
	}
	public static boolean isUglyNum(int num) {
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);
		for (int i = 2; i <=num; i++) {
			if (num%i==0) {
				if (!list.contains(i)) {
					return false;
				}
				num/=i;
			}
		}
		return true;

	}
}
