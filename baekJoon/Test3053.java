package javase_prj;

import java.util.Scanner;

public class Test3053 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		double R = in.nextDouble();	// ������ R
		in.close();
		
		System.out.println(R * R * Math.PI);	// ��Ŭ���� ���� ����
		System.out.println(2 * R * R);		// �ýñ����� ���� ����
	}
		

}
