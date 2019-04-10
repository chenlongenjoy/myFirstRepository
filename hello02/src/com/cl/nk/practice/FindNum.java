package com.cl.nk.practice;

import java.util.Scanner;

/**
 * 给定 x, k ，求满足 x + y = x | y 的第 k 小的正整数 y 。 | 是二进制的或(or)运算，例如 3 | 5 = 7。
 * 
 * 比如当 x=5，k=1时返回 2，因为5+1=6 不等于 5|1=5，而 5+2=7 等于 5 | 2 = 7。
 * 
 * @author cl
 *
 */
public class FindNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x = sc.nextInt();
		int k=sc.nextInt();
		int i=0;
		int count=0;
		while(true){
			i++;
			if (isValidte(x, i)) {
				count++;
			}
			if (count==k) {
				break;
			}
		}
		System.out.println(i);
	}
  
	public static boolean isValidte(int m,int n){
		return m+n==(m|n);
	}
}
