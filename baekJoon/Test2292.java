package javase_prj;
import java.util.Scanner;
 
public class Test2292 {
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();
		int count = 1; // �� ��(�ּ� ��Ʈ)
		int range = 2;	// ���� (�ּڰ� ����) 
 
		if (N == 1) {
			System.out.print(1);
		}
 
		else {
			while (range <= N) {	// ������ N���� Ŀ���� �������� �ݺ� 
				range = range + (6 * count);	// ���� ������ �ּڰ����� �ʱ�ȭ 
				count++;	// count 1 ���� 
			}
			System.out.print(count);
		}
		
		in.close();
	}
}