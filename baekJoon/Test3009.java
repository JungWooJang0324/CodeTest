package javase_prj;

import java.util.Scanner;

public class Test3009 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		int x[] = new int[3];
		int y[] = new int[3];
		int cordx = 0, cordy =0;
		for(int i=0; i<x.length; i++) {
			x[i] =sc.nextInt();
			y[i] =sc.nextInt();
		}
		
		if(x[1] == x[2]) {
			cordx = x[0];
		}
		else {
			cordx = (x[0] == x[1]) ? x[2]:x[1];
		}
		
		if(y[1] == y[2]) {
			cordy = y[0];
		}
		else {
			cordy = (y[0] == y[1]) ? y[2]:y[1];
		}
		
		System.out.println(cordx+" "+cordy);
		
		

		
		
	}
}
