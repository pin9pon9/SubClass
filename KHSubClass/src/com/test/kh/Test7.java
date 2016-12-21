
package com.test.kh;


public class Test7 {
	public static void main(String[] args) {
		//int [] num = new int [10]; // num[0] - num[9]
		
		//int [] num = new int[] {5,1,6,10,8}; //배열에서 초기화를 시키는 방법
	int [] num = {5,1,6,10,8};
	/*			
		for(int i = 0; i < num.length; i++)
			System.out.print(num[i]+ "  ");
		System.out.println();*/
	
		
		//Arrays.sort(num);
	
		System.out.println("정 렬 전");
		for(int n : num) { // list set 배열 은 가능하나 map은 불가능

			System.out.println(n + " ");
		
		}
		System.out.println();
		
		int t;
		for (int i = 0; i <num.length-1; i++) {
			for(int j =i+1; j<num.length; j++) {
				//System.out.println(i+ " : " + j); 비교
				if(num[i]> num[j]) { //오름차순
					t = num[i];
					num[i]=num[j];
					num[j]=t;
				}
			}
		}
		System.out.println("정 렬 후");
		for(int n : num) { // list set 배열 은 가능하나 map은 불가능

			System.out.println(n + " ");
		
		}
		System.out.println();
	}
}