package javase_prj;
import java.util.*;
import java.util.Scanner;

     
public class 10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String word = sc.next();
        
        for(char in='a'; in<='z';in++) {
        	System.out.println(word.indexOf(in)+ " ");
        	
        }
        
        sc.close();
    }
}