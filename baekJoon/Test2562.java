import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int[] arr ={10,80,70,30,29,75,63,26,34};
        int[] temp = new int[arr.length];
        int max=0;
        for(int i=0;i<arr.length; i++){
        	
    		if(arr[i]>max){
    			max = arr[i];
    		}
        }
         System.out.println(max);
		
		for(int i=0; i<arr.length;i++){
			if(max == arr[i]){
				System.out.println(i+1);
			}
		}
    			
        
    }

}