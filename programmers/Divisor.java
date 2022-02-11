package codeTest;

public class Divisor {
	
	public int divisor(int n) {
		int answer= 0;
		for(int i=1; i<=n; i++) {
			answer+= (n%i ==0)? i:0;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int a = 5;
		System.out.println(new Divisor().divisor(a));
	}

}
