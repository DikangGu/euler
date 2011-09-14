package com.dikang.algorithm.projecteuler;

public class p2{
	
	public static void main(String[] args) {
		int n = 4000000;
		int ppre = 1;
		int pre = 1;
		
		int cur = ppre + pre;
		
		int sum = 0;
		
		while (cur <= n) {
			if (cur % 2 == 0) {
				sum += cur;
			}              
			
			ppre = pre;
			pre = cur;
			cur = ppre + pre;
		}                    
		
		System.out.println(sum);
		
	}
}