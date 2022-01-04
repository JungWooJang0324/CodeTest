import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
class Main{
	public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] score = new int[n];
        int max = 0;
        int sum = 0;
        
        for(int i=0; i<score.length;i++){
            score[i] = sc.nextInt();
            if(score[i]>max){
                max = score[i];
            }
            sum += score[i];

        }

        double result = 100.0 * sum / max / score.length;
        System.out.println(result);
    }
}