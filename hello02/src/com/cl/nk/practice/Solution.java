package com.cl.nk.practice;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
  private Stack<Integer> stack1=new Stack<>();
  private Stack<Integer> stack2=new Stack<>();
  
  public void push(int node){
	  stack1.push(node);
  }
  
  
  public int pop(){
	  if (stack1.isEmpty()&&stack2.isEmpty()) {
		throw new RuntimeException("Queue is empty!");
	}
	  
	  if (stack2.isEmpty()) {
		while(!stack1.isEmpty()){
			stack2.push(stack1.pop());
		}
	}
	  return stack2.pop();
  }
  
  public double Power(double base, int exponent) {
	return Math.pow(base, exponent);
}
  
  public void reOrderArray(int [] arrauy) {
	  for (int i = 0; i < arrauy.length-1; i++) {
		for (int j = 0; j < arrauy.length-i-1; j++) {
			if (arrauy[j]%2==0&&arrauy[j+1]%2==1) {
				int temp=arrauy[j];
				arrauy[j]=arrauy[j+1];
				arrauy[j+1]=temp;
			}
		}
	}
  }
  
  public static void main(String[] args) {
	  Solution solution=new Solution();
	  int[] a=new int[]{21,3,4,6,8,34,11,64};
	  solution.reOrderArray(a);
	  for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
}

}
