package com.test.kh;

public class Test4 {

	public static void main(String[] args) {
		float a= 0;
		double b= 0;
		
		for(int i = 1 ; i <= 100000; i++) {
			a+=100000;
			b+=100000;
		}
		
		System.out.println((a/100000));
		System.out.println((b/100000));
	}

}
/*
	정밀한 값을 요구할때 double을 써야한다
*/
