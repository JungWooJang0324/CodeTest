package algorithm;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(), ans=1;
		
		for(int i=num; i>0; i--) {
			ans*=i;
		}
		
		System.out.println(ans);
	}
}
