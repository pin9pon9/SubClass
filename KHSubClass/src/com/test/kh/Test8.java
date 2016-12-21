package com.test.kh;

public class Test8 {

	public static void main(String[] args) {
		int[] num = { 5, 1, 6, 10, 8 };
		int t;
		boolean flag;
		int pass = 1;

		do {
			flag = false;
			for (int i = 0; i < num.length - pass; i++) {
				if(num[i]>num[i+1]) {
					t=num[i];
					num[i]=num[i+1];
					num[i+1] = t;
					flag=true;
				}
			}

			pass++;
		} while (flag);
		
		System.out.println("정 렬 후");
		for(int n : num) { // list set 배열 은 가능하나 map은 불가능

			System.out.println(n + " ");
		
		}
		System.out.println();

	}

}
