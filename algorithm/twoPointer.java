package algorithm;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.PriorityQueue;

public class twoPointer {
	
	public static void main(String[] args) {
		int[] num = {9,10,2,4,5};
		int k=7;
        PriorityQueue<Integer> que = new PriorityQueue<Integer>();
        for(int i=0; i<num.length; i++) {
        	que.offer(num[i]);
        }
        
        for(int i=0; i<que.size(); i++) {
        	System.out.println(que.poll());
        }
	}
}
