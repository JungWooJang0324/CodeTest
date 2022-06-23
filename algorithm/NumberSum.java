package algorithm;

import java.util.Scanner;

public class NumberSum {
	//N개의 숫자가 공백없이 써있다 이 숫자를 모두 합해 출력하는 프로그램을 작성
	public int NumberSums(String number) {
		char[] numbers = number.toCharArray();
		int answer =0;
		for(int i=0; i< number.length(); i++) {
			answer+= numbers[i]- '0';
		}		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCnt = sc.nextInt();
		String number=sc.next();
		
		if(numCnt == number.length()) {
			System.out.println(new NumberSum().NumberSums(number));
		}
		
		sc.close();
	}
	
}
