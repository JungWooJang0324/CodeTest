package javase_prj;

import java.util.Scanner;

public class Test10250 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
		
			int H =sc.nextInt(), W = sc.nextInt(), N=sc.nextInt();
			int height = N%H;
			int roomNum= (N/H)+1;
			int answer=(height*100)+roomNum;
			if(height == 0) {
				height = N/H;
				roomNum = H;
				answer = (roomNum*100)+height;
			}
			System.out.println(answer);
			
		}
		sc.close();
	}
}
