import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b = sc.nextInt();
		int c = sc.nextInt();
		int mul = a*b*c;
		int[] arr = Stream.of(String.valueOf(mul).split("")).mapToInt(Integer::parseInt).toArray();
        
       	for(int j=0;j<10;j++){
		int cnt=0;
	        for(int i=0; i<arr.length;i++){
    			if(arr[i]==j){
    				cnt++;
    			}    		
        	}
    				System.out.println(cnt);
        
        	
        }
        
        
    }

}