package codeTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test7568 {
	
	public Test7568() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� �Է����ּ���");
		int people = sc.nextInt();
		int[][] wehe = new int[people][2];
		
		for(int i=0; i<people; i++) {
			System.out.println("������");
			wehe[i][0] = sc.nextInt();
			System.out.println("Ű");
			wehe[i][1] = sc.nextInt();
		}
		
		for(int i = 0; i < people; i++) {
			int rank = 1;
			
			for(int j = 0; j < people; j++) {
				if(i == j) continue;
				if (wehe[i][0] < wehe[j][0] && wehe[i][1] < wehe[j][1]) {
					rank++;
				}
			}
 
			System.out.print(rank + " ");
		}
 
	}
	
	
	public static void main(String[] args) {
		new Test7568();
	}

}
