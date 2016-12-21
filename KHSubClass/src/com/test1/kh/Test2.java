package com.test1.kh;

public class Test2 {

	public static void main(String[] args) {
		User3 oo = new User3();
		System.out.println(oo.sum(100));
		
		int a = 20;
		oo.sub(a);
		System.out.println(a); // 20  call by value  
		
		int [] arr = {1,2,3};
		oo.sub(arr);
		System.out.println(arr[0]); // 11 call by
	}

}

class User3 {
	public int sum(int n) {
		int s = 0;
		for (int i = 1; i <= n; i++)
			s += i;
		return s;
	}

	// 소문자인경우 대문자로 변화
	public char upper(char ch) {
		return ch >= 'a' && ch <= 'z' ? (char) (ch - 32) : ch;
	}

	// 대문자 인지??

	public boolean isUpper(char ch) {
		return ch >= 'A' && ch <= 'Z';
	}

	/*
	 * 윤년인지 판별 년도가 4의 배수이고 100의 배수가 아니거나 400의 배수이면
	 */

	public boolean isLeap(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}

	// 점수에 따른 평점(95~100:4.5, 90~94:4.0...)
	// grade(int s)
	public double grade(int s) {
		double p = 0;

		if (s >= 95)
			p = 4.5;
		else if (s >= 90)
			p = 4.0;
		else if (s >= 85)
			p = 3.5;
		else if (s >= 80)
			p = 3.0;
		else if (s >= 75)
			p = 2.5;
		else if (s >= 70)
			p = 2.0;
		else if (s >= 65)
			p = 1.5;
		else if (s >= 60)
			p = 1.0;
		else if (s >= 55)
			p = 0.5;
		else
			p = 0;

		return p;
	}

	public void sub(int a) {
		a = 10;
		// return; 생략가능 (void 형인경우만)
	}
	
	public void sub(int[] n){
		n[0]+=10;
	}

}
