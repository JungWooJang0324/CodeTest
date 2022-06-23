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
		//�� Ǯ��
		Greedy_UntilOne gu = new Greedy_UntilOne();
		
		int answer = 0;
		
		if(N%K==0) {
			answer+= gu.untilOne(N, K);
		}
		else {
			answer+= N%K; //������ ��ŭ�� �������� �ű⼭ �� ���� ������
			answer+= gu.untilOne(N-(N%K), K);
		}
		System.out.println("���� answer= "+answer);
		
		
		
		
		////////////////////////////////////////////////////////
		//���� Ǯ��
		int result = 0;
		while(true) {
			//N�� K�� ������ �������� ����
			int target = (N/K) * K; //���������� �ִ� ���� ������ ��
			result += (N-target);
			N = target;
			
			//N�� K���� ������ �ݺ��� Ż��
			if(N<K) break;
			
			// K�� ������
			result += 1;
			N/= K;
			
		}
		
		//������ ���� ���� 1�� ����
		result += (N-1);
		System.out.println(result);
		
		
	}

}
