package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest4 {

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

		///// 배열로

		List<Student> oneList = new ArrayList<>();
		List<Student> twoList = new ArrayList<>();
		List<Student> threeList = new ArrayList<>();
		int[] nums = new int[3];

		for (Student s : stList) {

			if (s.getGrade() == 1) {

				oneList.add(s);

			}

			else if (s.getGrade() == 2) {

				twoList.add(s);

			} else if (s.getGrade() == 3) {

				threeList.add(s);

			}

		}
		if (oneList.size() > 0) {
			System.out.print("1학년  " + oneList.size() + "명의 이름 :");
			for (Student s : oneList) {

				System.out.print(" " + s.getName());

			}
		}

		if (twoList.size() > 0) {
			System.out.print("\r2학년  " + twoList.size() + "명의 이름 :");

			for (Student s : twoList) {

				System.out.print(" " + s.getName());

			}
		}
		if (threeList.size() > 0) {
			System.out.print("\r3학년  " + threeList.size() + "명의 이름 :");

			for (Student s : threeList) {

				System.out.print(" " + s.getName());

			}
		}
	}

}
