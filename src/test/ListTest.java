package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Student {
	private String name;
	private int grade;

	@Override
	public String toString() {
		return "Student [이름 :" + name + ", 학년 :" + grade + "]";
	}

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class ListTest {//학년을 1 - 10학년까지 랜덤하게 대입 -학년이 짝수일 경우에만 아래의 양식에 맞춰서 출력 - 이름 : 결과값, 학년 : 결과값 학년 

	public static void main(String[] args) {
		List<Student> stList = new ArrayList<>();
		Random r = new Random();
				
		for(int i =1 ; i<=5;i++) {
			Student st2 = new Student();
			stList.add(st2);
			st2.setName("이름 "+ i);
			st2.setGrade(r.nextInt(10)+1);
			
		}
		
		
		
		
		
		for(int i = 0 ;i<stList.size();i++)
		{
			Student st = stList.get(i);
	
			int grade = st.getGrade();
			
			
			
			if((i%2)==1) {
				System.out.print(i + "값 ");
				System.out.println(st);	
				
			}
		
		
				
				
		}
		
	
		
		
		
		
	}
}
