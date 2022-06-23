package algorithm;

import java.util.Scanner;

public class FibonachiCallBack {
	public int fibo(int n) {
		int ans=0;
		if(n<=1) {
			ans=n;
		}else {
			ans = fibo(n-2)+fibo(n-1);
		}
		
		return ans;
		
		
	}
	
	public static void main(String[] args) {
		FibonachiCallBack fc = new FibonachiCallBack();
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=1; i<num; i++) {
			System.out.println(fc.fibo(i));
		}
	}
}
