package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest3 {

	public static void main(String[] args) {

		String[] fNames = { "김", "이", "박", "최", "맹", "신", "조" };
		String[] lNames = { "동동", "나나", "진수", "명희", "철수", "명호", "둘리" };
		List<Student> stList = new ArrayList<>();
		Random r = new Random();

		int one = 0;
		int two = 0;
		int three = 0;

		for (int i = 1; i <= 20; i++) {
			String fName = fNames[r.nextInt(7)];
			String lName = lNames[r.nextInt(7)];
			Student s = new Student();
			s.setName(fName + lName);
			s.setGrade(r.nextInt(3) + 1);
			stList.add(s);

			if (s.getGrade() == 1) {

				one++;

			}

			else if (s.getGrade() == 2) {

				two++;

			} else if (s.getGrade() == 3) {

				three++;

			}

		}

		/*
		 * 위의 리스트는 1-3학년까지 랜덤하게 들어간 리스트 각 학년당 몇명의 학생이 있는지 출력하는 프로그램을 만들어라
		 */

		System.out.println(stList);
		
		
		if (one != 0) {

			System.out.println("1학년 : " + one + "명");

		}  if (two !=0) {

			System.out.println("2학년 : " + two + "명");
			
		}  if (three != 0) {

			System.out.println("3학년 : " + three + "명");


	}
	}
	
}
