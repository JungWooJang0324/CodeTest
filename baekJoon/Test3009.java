package javase_prj;

import java.util.Scanner;

public class Test3009 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		int x[] = new int[3];
		int y[] = new int[3];
		int cordx = 0;
		for(int i=0; i<x.length; i++) {
			x[i] =sc.nextInt();
			y[i] =sc.nextInt();
		}
		
		for(int j=0; j<x.length;j++) {
			if(x[j] != y[j]) {
				cordx = x[j];
				System.out.println(cordx);
			}

		}
		
		
	}
}
