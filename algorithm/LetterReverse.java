package algorithm;

import java.util.ArrayList;
import java.util.List;

public class LetterReverse {
	public LetterReverse(String letter) {		
		int[] arr = new int[letter.length()];
		int num;
		for(int i=0; i<letter.length(); i++) {
			num = letter.charAt(i);
			if(num>64 && num<91) {
				arr[i]=(num+32);
			}else {
				arr[i]=(num-32);
			}
		}
		for(int le: arr) {
			System.out.println((char)le);
		}
	}
	public static void main(String[] args) {
		String letter= "helloWorlD";
		
		new LetterReverse(letter);
	}
}
