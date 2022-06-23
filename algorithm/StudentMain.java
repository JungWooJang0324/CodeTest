package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		ArrayList<Student> arr = new ArrayList<Student>();
		arr.add(new Student("ȫ�浿", 1234));
		arr.add(new Student("���Ȱ�", 1235));
		arr.add(new Student("������", 1236));
		
		Scanner sc = new Scanner(System.in);
		String search="", nameNo="", output="";
		boolean flag= true;
		while(flag) {
			System.out.println("�˻��� �ϰ� �����ø� y, n");
			search = sc.next();
			if(search.equals("y")) {
				System.out.println("�˻��Ͻʽÿ�: ");
				nameNo=sc.next();
				for(Student st:arr) {
					if(st.getName().equals(nameNo)) {
						output=nameNo+"";
					}
					else if(Integer.toString(st.getNo()).equals(nameNo)) {
						output=nameNo+"";
					}
					else {
						output="�������� �ʽ��ϴ�.";
					
					}
				}
				System.out.println(output);
			}else if(search.equals("n")) {
				flag=false;
			}
			
		}
		sc.close();
	}

}
