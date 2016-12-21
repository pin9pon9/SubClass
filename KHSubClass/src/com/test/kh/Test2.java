package com.test.kh;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch, result;
		// 변수 = 조건?값1:값2;
		// 조건이 참이면 값1을 변수에 돌려줌
		// 조건이 거짓이면 값2를 변수에 돌려줌
		// A:65 , a:97
		try {
			System.out.println("한문자 ? ");
			ch = sc.next().charAt(0);
			result = ch >= 'A' && ch <= 'Z' ? (char) (ch + 32) : (ch >= 'a' && ch <= 'z' ? (char) (ch - 32) : ch);
			System.out.println(ch + "->" + result);
		} finally {
			sc.close(); // 닫아줘야 메모리 낭비가 적다.
		}

	}

}

/*
 * 하나의 문자를 입력 받아 소문자이면 대문자로 대문자이면 소문자로, 기타문자는 입력 받은 문자를 그대로 출력 문자 ?a a->A
 * 
 * 문자?7 7 -> 7
 */
