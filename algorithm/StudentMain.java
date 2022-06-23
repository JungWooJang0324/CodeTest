package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		ArrayList<Student> arr = new ArrayList<Student>();
		arr.add(new Student("홍길동", 1234));
		arr.add(new Student("저팔개", 1235));
		arr.add(new Student("장정우", 1236));
		
		Scanner sc = new Scanner(System.in);
		String search="", nameNo="", output="";
		boolean flag= true;
		while(flag) {
			System.out.println("검색을 하고 싶으시면 y, n");
			search = sc.next();
			if(search.equals("y")) {
				System.out.println("검색하십시오: ");
				nameNo=sc.next();
				for(Student st:arr) {
					if(st.getName().equals(nameNo)) {
						output=nameNo+"";
					}
					else if(Integer.toString(st.getNo()).equals(nameNo)) {
						output=nameNo+"";
					}
					else {
						output="존재하지 않습니다.";
					
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
