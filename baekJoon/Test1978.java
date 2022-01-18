package javase_prj;

import java.util.Scanner;

public class Test1978 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		int checkCnt=0;
		
		for(int j=0; j<N; j++) {
			int num = sc.nextInt();
			int cnt =0;

			for(int i=1; i<=num; i++) {
				if(num % i==0) {
					cnt++;
				}
				
			}
			
			if(cnt == 2) {
				checkCnt++;
			}
			
		}
		System.out.println(checkCnt);
		sc.close();
	}
}
