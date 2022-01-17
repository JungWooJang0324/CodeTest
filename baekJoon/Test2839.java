package javase_prj;

import java.util.Scanner;

public class Test2839 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int suger = sc.nextInt();
		int answer = 0;
		int pack= 0;
		while(true) {
			if(suger % 5 ==0) {
				pack += suger/5;
				answer = pack;
				break;
			}
			else if(suger<0){
				answer = -1;
				break;
			}
			suger -=3;
			pack++;
		}
		
		System.out.println(answer);
		
		sc.close();
	}
	
}
