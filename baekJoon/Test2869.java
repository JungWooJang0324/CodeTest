package javase_prj;
import java.util.Scanner;

public class Test2869 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A= sc.nextInt(), B= sc.nextInt(), V = sc.nextInt();
		
		int move = A-B;
		int slide = V-B;
		
		int day = slide/ move;
		if(slide % move!= 0){
			day++;
		}
		System.out.println(day);
		sc.close();
	}

}
