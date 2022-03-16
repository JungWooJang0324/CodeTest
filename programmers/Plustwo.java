package codeTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class plustwo {
	public int[] solution(int[] numbers) {
		List<Integer> list= new ArrayList<Integer>();
		
		for(int i=0; i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				list.add(numbers[i]+numbers[j]);
			}
		}
		Collections.sort(list);
		List<Integer> newList = list.stream().distinct().collect(Collectors.toList());
		
		int[] answer= new int[newList.size()];
		for(int i=0;i<newList.size();i++) {
			answer[i]=newList.get(i);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		int[] test= {5,0,2,7};
		new plustwo().solution(test);
	}
}
