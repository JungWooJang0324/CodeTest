package algorithm;

public class Square {
	
	 public int[] solution(int[][] v) {
	        int[] answer = {};
	        int x = 0, y=0;
	        int[] cntx= new int[v.length], cnty = new int [v.length];
	        
	        for(int i=0; i<v.length; i++){
	        	for(int j=0; j<v.length; j++) {
	        		// x축 없는 값 찾기	
	        		if(v[i][0] ==v[j][0]) cntx[i]++;
	        		
	        		if(v[i][1] == v[j][1]) cnty[i]++;
	        		
	        	}
	        	
	        	if(cntx[i]==1) x=v[i][0];
	        	if(cnty[i]==1) y = v[i][1];
	        }
	        
	        answer= new int[]{x,y};
	        
	        return answer;
	    }
	
	
	public static void main(String[] args) {
		int[][] v= {{1, 4}, {3, 4}, {3, 10}};
		int[][] v1= {{1, 1}, {2, 2}, {1, 2}};
		
		
		
		int[] ans = new Square().solution(v);
		
		for(int i=0; i<ans.length; i++) {
			System.out.println(ans[i]);
		}
	}
}
