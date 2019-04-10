package com.cl.nk.test;

import java.util.Scanner;

public class TotalStep {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String string = sc.nextLine();
		System.out.println(numDecoding(string));
	}

	public static long f(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * f(n - 1);
		}
	}

	public static int numDecoding(String string) {
		if (string.length() == 0) {
			return 0;
		}

		int m = string.length();
		int[] dp = new int[m + 1];
		dp[0] = 1;
		dp[1] = string.charAt(0) == '0' ? 0 : 1;
		for (int i = 2; i < m + 1; i++) {
			int one = Integer.parseInt(string.substring(i - 1, i));
			int two = Integer.parseInt(string.substring(i - 2, i));
			if (one!=0) {
				dp[i]+=dp[i-1];
			}
			if (two>=10&&two<=26) {
				dp[i]+=dp[i-2];
			}
		}
		return dp[m];
	}
}
