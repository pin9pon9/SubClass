package com.test.kh;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		int s;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("점수?");
			s = sc.nextInt();
			switch (s/10) {
			case 10 : 
				break;
			case 9: System.out.println("수");
				break;
			case 8: System.out.println("우");
				break;
			case 7: System.out.println("미");
				break;
			case 6: System.out.println("양");
				break;
			default: System.out.println("가");
				break;
			}
		} finally {
			sc.close();
		}

	}

}