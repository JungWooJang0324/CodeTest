import java.util.Scanner;

public class Test1065{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if (N<100){
			System.out.println(N);
		}
		else{
			int result = 99;

	  		for (int i = 111; i <= N; i++)
  				result += han(i);
			
			System.out.println(result);
		}
	}
	
	private static int han (int num) {
		int hun = num / 100;
		int ten = num % 100 / 10;
		int one = num % 10;
		
		if (ten*2 == hun + one) {
			return 1;
		}
        
		return 0;
	}
}
