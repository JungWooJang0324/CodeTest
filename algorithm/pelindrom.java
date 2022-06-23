package algorithm;

import java.util.List;

public class pelindrom {
	public pelindrom(String pel) {
	
	int len=pel.length(),center=(len/2)+1;
	boolean flag=true;
	for(int i=0; i<len/2; i++) {
		if(pel.charAt(i) != pel.charAt(len-i-1)) {
			flag=false;
			System.out.println("Æ²¸²");
		}
	}
	

	}
	
	public static void main(String[] args) {
		String num = "12345";
		
		String pel = "1";
		new pelindrom(pel);
	}
}
