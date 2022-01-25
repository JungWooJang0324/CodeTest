package javase_prj;

import java.util.Scanner;

public class Test4153 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int first = sc.nextInt(), second=sc.nextInt(),third=sc.nextInt();
			if(first==0&& second ==0 &&third==0) break;
			
			first = (int) Math.pow(first,2);
			second = (int) Math.pow(second,2);
			third= (int) Math.pow(third,2);
			
			String answ = "";
			if(first == (second+third)) {
				answ = "right";
			}else if (second == (first+third)) {
				answ = "right";
			}else if(third == (first+second)) {
				answ = "right";				
			}else {
				answ = "wrong";				
				
			}
			
			System.out.println(answ);
		}
	}

}
