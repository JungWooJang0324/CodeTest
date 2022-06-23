package algorithm;

public class Greedy_UntilOne {
	
	public int untilOne(int N, int K) {
		int answer = 0;
		while(N!=1) {
			if(N%K==0) {
				N= N/K;
				answer++;
			}else {
				N--;
				answer++;
			}
		}
		return answer;
	}
	

	public static void main(String[] args) {
		int N=17, K=16;
		//내 풀이
		Greedy_UntilOne gu = new Greedy_UntilOne();
		
		int answer = 0;
		
		if(N%K==0) {
			answer+= gu.untilOne(N, K);
		}
		else {
			answer+= N%K; //나머지 만큼을 더해준후 거기서 뺀 값을 돌리기
			answer+= gu.untilOne(N-(N%K), K);
		}
		System.out.println("정우 answer= "+answer);
		
		
		
		
		////////////////////////////////////////////////////////
		//동빈나 풀이
		int result = 0;
		while(true) {
			//N이 K로 나누어 질떄까지 빼기
			int target = (N/K) * K; //나누어질수 있는 가장 근접한 수
			result += (N-target);
			N = target;
			
			//N이 K보다 작을때 반복문 탈출
			if(N<K) break;
			
			// K로 나누기
			result += 1;
			N/= K;
			
		}
		
		//마지막 나눈 수에 1씩 빼기
		result += (N-1);
		System.out.println(result);
		
		
	}

}
