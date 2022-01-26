package javase_prj;

import java.util.Scanner;

public class Test10872 {

	public int factorial(int N) {
		int anw=0;
		if(N==0) {
			anw= 1;		
		}else {
			anw = N* factorial(N-1);
		}
		return anw;
		
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println(new Test10872().factorial(sc.nextInt()));
	}
}
