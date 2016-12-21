package com.test.kh;

public class Test9 {
	public static void main(String[] args) {
		int[] score = new int[] { 80, 90, 70, 80, 60, 100 };
		int[] rank = new int[score.length];

		for (int i = 0; i < rank.length; i++)
			rank[i] = 1; // rank 초기화

		for (int i = 0; i < score.length - 1; i++) {
			for (int j = i + 1; j < score.length; j++) {
				if (score[i] > score[j])
					rank[j]++;
				else if (score[i] < score[j])
					rank[i]++;
			}

		}
		//
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d %d\n", score[i], rank[i]);
		}	//printf 서식에 맞추어서 출력을 할떄 score[i] 가 %d 에 rank[i]가 %d\n 에 
	}

}
