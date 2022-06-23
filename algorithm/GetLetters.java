package algorithm;

import java.util.ArrayList;
import java.util.List;

public class GetLetters {

	public int getLetters(String text, String gt) {

		//1. 판별할 문자열 gt를 가져와서 첫글자로 판별
		char firstLetter = gt.charAt(0);

		//2. 같은 글자의 index값들을 가져오기
		List<Integer> fLetIndex= new ArrayList<Integer>(); 
		
		for(int i=0; i<text.length(); i++) {
			if(text.charAt(i)==firstLetter) fLetIndex.add(i);
		}
	
		//3. 겹쳐지는 숫자갯수
		int cnt = 0;
		for(int i: fLetIndex) {
			if(text.substring(i, i+gt.length()).equals(gt)) cnt++;			
		}
		
		return cnt;
		
	}
	
	
	public static void main(String[] args) {
		String text="abcab안녕하세요, 저는 ab입니다. 안녕";
		String gt = " ";
	
		System.out.println(new GetLetters().getLetters(text, gt));
	}
}
