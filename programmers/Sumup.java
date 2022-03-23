package codeTest;

public class Sumup {
	
	public int solution(int[] scoville) {
        int answer = 45;
        for(int i=0; i< scoville.length; i++) {
        	answer-=scoville[i];
        }
        
        return answer;
    }
	
	
	public static void main(String[] args) {
		Sumup msc= new Sumup();
		int[] scoville= {1, 2, 3, 4,6,7,8};
		System.out.println(msc.solution(scoville));

	}

}
