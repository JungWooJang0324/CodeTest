package javase_prj;

import java.util.Scanner;

public class Test4344{

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		
		for(int i=0; i<C;i++) {
			int N = sc.nextInt(); // 학생의 수
			int[] score = new int[N]; //점수 리스트
			
			double avg = 0;
			int stuCnt = 0;
			
			for(int j=0; j<N; j++) {
				score[j] = sc.nextInt(); //점수 입력
				avg+= score[j];
			}
			avg /= N;
			for(int k : score) {
				if(avg<k) {
					stuCnt++;
				}
			}
			
			System.out.printf("%.3f",(double)stuCnt/(double)N * 100);
			System.out.println("%");
			
			
			
		}
		
	}

}
