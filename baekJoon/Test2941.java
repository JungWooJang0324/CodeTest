package javase_prj;

import java.util.Scanner;

public class Test2941 {

	public static void main(String[] args) {
		String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		Scanner sc = new Scanner(System.in);
		String str= sc.next();
		int cnt =0;
		
		for(int i=0; i<arr.length; i++) {
			if(str.contains(arr[i])) {
				str = str.replace(arr[i], "/");
			}
		}
		System.out.println(str.length());
		
		
	}

}
