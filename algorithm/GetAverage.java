package algorithm;

import java.util.Scanner;

/*
 * double totalScore=0; for(int score: scores) { totalScore +=
 * (double)score/max*100; }
 */

/**
 * @author 장정우
 * 기말고사를 망쳐서 다시 평균 내기 M : 최고점 
 *	모든 점수를 점수/M*100 
 *
 */
public class GetAverage {
	
	/**
	 * (A/M*100+ B/M*100 + C/M*100 ) / 3 
	 * ==> 
	 * (A+B+C) * 100/M/3
	 * @return
	 */
	public double newAvg() {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[] scores= new int[cnt];
		
		for(int i=0; i<cnt; i++) scores[i] = sc.nextInt();
		
		long max = 0;
		long sum = 0;
		for(int score: scores) {
			if(max<score) max=score;
			sum+= score;
		}
		
		double answer = sum * 100.0 / max/cnt;
		return answer;	
	}
	
	
	
	public static void main(String[] args) {
		GetAverage ga = new GetAverage();
		System.out.println(ga.newAvg());
		
	}
}
