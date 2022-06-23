package algorithm;

public class fibonachi {
	
	public fibonachi() {
	int[] arr = new int[100];
	arr[0]=1;
	arr[1]=0;
	for(int i=2; i<100; i++) {
		arr[i] = arr[i-1]+arr[i-2];
		if(arr[i]>100) {
			break;
		}
		System.out.println(arr[i]);
	}
		
	}
	
	public static void main(String[] args) {
		new fibonachi();
	}
}


/*
 * //핵심 소스코드의 설명을 주석으로 작성하면 평가에 큰 도움이 됩니다. public class Solution{ public int
 * fibo(int n){ int ans = 0;
 * 
 * if(n==0) ans=0; else if(n==1) ans=1; else ans = fibo(n-2) + fibo(n-1);
 * 
 * return ans; }
 * 
 * public int solution(int n){ return fibo(n);
 * 
 * } }
 */