package javase_prj;

import java.util.Scanner;

public class Test1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int k, han=0;
		int[] a=new int[3];
	
		for(int i=1;i<=N; i++) {
			
			//�Ѽ�: 1-100������ �׳��Ѽ�
			if(i<100) han = i;
			else {
				k=0; int t=i;
				while(t>0) {
					a[k] = t%10;
					t /=10;
					k++;
				}
				if(a[0]-a[1] == a[1]-a[2]) han++;
			}
		}
		System.out.println(han);

	}

}
