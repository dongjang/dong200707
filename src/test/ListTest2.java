package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class LOLChamp {
	private String name;
	private int power;

	public String toString() {
		return "LOLChamp [name=" + name + ", power=" + power + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

}

public class ListTest2 {

	public static void main(String[] args) {
		String[] names = { "티모", "나미", "람머스", "나무", "징크스", "애쉬" };
		List<LOLChamp> lolList = new ArrayList<>();

		Random rs = new Random();

		for (int i = 0; i < names.length; i++) {

			LOLChamp lc = new LOLChamp();

			lc.setName(names[i]);
			lc.setPower(rs.nextInt(51) + 50);
			lolList.add(lc);

		}

		System.out.println("처음에 나온 애들");

		for (int i = 0; i < names.length; i++) {

			LOLChamp names2 = lolList.get(i);
			System.out.println(names2);

		}

		int max = 0;
		int maxName =0;
		
		for (int i = 0; i < names.length; i++) {

			LOLChamp lc = lolList.get(i);
		
		

			if (max<lc.getPower()) {
					
				max = lc.getPower();
				maxName = i;

			}

		}
		System.out.println("짱 쎈 " + lolList.get(maxName));
	

	}

}
