package com.test.kh;

public class Test3 {

	public static void main(String[] args) {
		int a = 10, b = 5;
		/*
		 * int c; c=a; a=b; b=c;
		 */
		a = a ^ b;
		b = b ^ a;
		a = a ^ b;

		System.out.println(a + ":" + b);
	}

}