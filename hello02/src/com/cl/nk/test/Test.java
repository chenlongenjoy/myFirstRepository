package com.cl.nk.test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNext()){
			int count=0;
			int m = sc.nextInt();
			int n=sc.nextInt();
			for (int i = m; i < n; i++) {
				if (isLuckyNum(i)) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

	public static boolean isLuckyNum(int num) {
		if (num < 6) {
			return false;
		}
		int ret = 0;
		while (num > 0) {
			ret = num % 10;
			if (ret == 6 || ret == 8) {
				num /= 10;
			} else {
				return false;
			}
		}
		return true;

	}
}