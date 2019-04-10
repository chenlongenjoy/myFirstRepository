package com.cl.nk.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BInAdd {
  public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   while(sc.hasNext()){
         int k = sc.nextInt();
         int n = sc.nextInt();
         int[][] a=new int[n][n];
         for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j]=sc.nextInt();
			}
		}
         System.out.println(getMin(a, k));
   }
}
  
  
  public static String add(String a,String b){
	  int m = Integer.parseInt(a,2);
	  int n = Integer.parseInt(b,2);
	  return Integer.toBinaryString(m+n);
  }
  
  
  public static int getMin(int[][] a,int k){
	  List<Integer> list=new ArrayList<>();
	  for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			list.add(a[i][j]);
		}
	}
	  Collections.sort(list);
	  return list.get(k-1);
  }

}
