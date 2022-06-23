package algorithm;

import java.util.ArrayList;
import java.util.List;

public class GetLetters {

	public int getLetters(String text, String gt) {

		//1. �Ǻ��� ���ڿ� gt�� �����ͼ� ù���ڷ� �Ǻ�
		char firstLetter = gt.charAt(0);

		//2. ���� ������ index������ ��������
		List<Integer> fLetIndex= new ArrayList<Integer>(); 
		
		for(int i=0; i<text.length(); i++) {
			if(text.charAt(i)==firstLetter) fLetIndex.add(i);
		}
	
		//3. �������� ���ڰ���
		int cnt = 0;
		for(int i: fLetIndex) {
			if(text.substring(i, i+gt.length()).equals(gt)) cnt++;			
		}
		
		return cnt;
		
	}
	
	
	public static void main(String[] args) {
		String text="abcab�ȳ��ϼ���, ���� ab�Դϴ�. �ȳ�";
		String gt = " ";
	
		System.out.println(new GetLetters().getLetters(text, gt));
	}
}
