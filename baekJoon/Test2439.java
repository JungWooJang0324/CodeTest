package javase_prj;
import java.util.Scanner;

public class Test2439{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in); 
        //n을 5라고 지정해주기
        int n = sc.nextInt();
        
        //5행 지정
        for(int i=1; i<=n;i++){
        	//빈칸은 n-1에서 하나씩 줄어듦
        	// * 보다 먼저 선언해줘야함
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            
            //빈칸을 채워주고 나머지 채워줌
            for(int k=1; k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
                    }
        
        sc.close();
    }
}