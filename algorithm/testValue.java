package algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class testValue {
	
	public int test(int[] w, int[] v, int k) {
		int max = 0;
		
		for(int i=0 ;i<v.length; i++) {
			if(max<v[i]) {
				max=v[i];
			}
			
		}
		
        return 0;
	}
	
	public static void main(String[] args) {
		testValue tv = new testValue();
		
		int[] w = {10,20,30};
		int[] v = {100,60,120};
		int k = 50;
		
		int len = tv.test(w, v, k);
	}
}

