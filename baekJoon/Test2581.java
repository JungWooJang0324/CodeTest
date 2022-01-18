package javase_prj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2581 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt(), N = sc.nextInt();
		int sum =0;
		List<Integer> maxList = new ArrayList<Integer>();


		for(int i=M; i<=N; i++) {
			int cnt=0;

			for(int j=1; j<=i; j++) {
				if(i%j == 0) {
					cnt++;
				}			
			}
			
			
			if(cnt == 2) {
				sum+=i;
				maxList.add(i);
			}
			
}

		if(sum==0) {
			System.out.println(-1);

		}else {
			System.out.println(sum);
			System.out.println(maxList.get(0));
			
		}
		

		sc.close();
		
		
	}

}
