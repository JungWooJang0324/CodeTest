package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class maxCount {

	public maxCount(List<Integer> list) {
		List<Integer> cnt = new ArrayList<Integer>();
		String output="";
		int max=0, maxNum=0;
		for(int i: list) {
			cnt.add(Collections.frequency(list, i));
		}
		
		for(int i:cnt) {
			System.out.println(i);
		}
		
		for(int i=1; i<cnt.size(); i++) {
			if(cnt.get(i)>cnt.get(i-1)) {
				max=cnt.get(i);
				output=Integer.toString(list.get(i)); 
			}
		}
		System.out.println("최다 호출번호: "+output+": "+max+"번 호출");
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,2,3,1,4,2,2,4,3,5,2};
		List<Integer> list= new ArrayList<Integer>();
		
		for(int i: arr) {
			list.add(i);
		}
		new maxCount(list);
			}
}
