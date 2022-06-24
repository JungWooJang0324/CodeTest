package algorithm;

public class WhatIsBigger {
	int answer;
	public int plus(int fir, int sec) {
		answer = fir+(sec-48);
		return answer;
	}
	
	public int mul(int fir, int sec) {
		answer = fir*(sec-48);
		return answer;
	}
	
	
	public static void main(String[] args) {
		
		WhatIsBigger wb = new WhatIsBigger();
		String num = "02412";
		int plus = 0, mul = 0, answer=0, i=2;
		
		plus = wb.plus(num.charAt(0)-48, num.charAt(1));
		mul = wb.mul(num.charAt(0)-48,num.charAt(1));
		
		answer= plus>mul? plus: mul;
		while(true) {
			plus = wb.plus(answer, num.charAt(i));
			mul = wb.mul(answer, num.charAt(i));
			
			answer = plus>mul ? plus: mul;
			i++;
			
			if(i >= num.length()) break;
		}
		
		System.out.println(answer);
		
		// 풀이
		// 0이나 1인 경우 더하기로 풀기!!
		
		int result = num.charAt(0) - '0';
		int numbers=0;
		for(int j=1; j<num.length(); j++) {
			numbers = num.charAt(j) - '0';
			if(numbers<=1 || result<=1) {
				result+= numbers;
			}
			else {
				result *= numbers;
				
			}
		}
		
		System.out.println(result);
		
		
	}
	
}
