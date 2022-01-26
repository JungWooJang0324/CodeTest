package javase_prj;

import java.util.Scanner;

public class Test10870 {
	public int fibonachi(int N) {
		int anw = 0;
		if(N<=1) {
			anw = N;
		}else {
			anw = fibonachi(N-2)+fibonachi(N-1);				
		}
	
	
	
		return anw;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(new Test10870().fibonachi(sc.nextInt()));
		
	}
}
