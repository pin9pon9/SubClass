package com.test.kh;
public class Test1 {
	public static void main(String [] args) {
		for(int i = 1; i <= 5; i++){ //별표 5줄수
			for(int j = 1; j<=5-i; j++) // 첫번째 별표 칠떄의 공백 4칸 3 2 1 로 줄어듬
				System.out.print(" ");
			
			for(int j =1; j <= i*2-1; j++) // 별표가 홀수로나가는거 
				System.out.print("*");
			System.out.println();
				}
	}

} // 똑같은 모양이지만 반복문을 1번만 사용하고 String 클래스에 관련되어진 method를 사용하지않는다. 삼항연산자를 사용???