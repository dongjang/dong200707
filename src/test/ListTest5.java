package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Food{
	private String name;
	private int price;
	private String locale;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + ", locale=" + locale + "]";
	}
	
}
public class ListTest5 {

	public static void main(String[] args) {
		List<Food> fList = new ArrayList<>();
		String[] locales = {"한식","양식","중식","일식","분식","경양식"};
		Random r = new Random();
		for(int i=1;i<=30;i++) {
			Food f = new Food();
			f.setLocale(locales[r.nextInt(locales.length)]);
			f.setName("음식" + i);
			int price = (r.nextInt(50)+1) * 1000;
			f.setPrice(price);
			fList.add(f);
		}
		/*
		 * 제일 비싼 음식과 제일 저렴한 음식을 찾아서 출력해주시면 됩니다.
		 */
		for(Food f :fList) {
			System.out.println(f);
		}
		int min = 50000;
		int max = 0;
		for(int i=0;i<30;i++) {
			Food f = fList.get(i);
			if(max<f.getPrice()) {
				max = f.getPrice();
			}
			if(min>f.getPrice()) {
				min = f.getPrice();
			}
		}
		List<Food> minList = new ArrayList<>();
		List<Food> maxList = new ArrayList<>();
	
		for(int i=0;i<30;i++) {
			Food f = fList.get(i);
			if(max==f.getPrice()) {
				maxList.add(f);
			}
			if(min==f.getPrice()) {
				minList.add(f);
			}
		}
		
		int[] fdarray= new int[6];
		
		for(int i = 0; i<locales.length;i++) {
			for(int j =0;j<fList.size();j++) {
				if(locales[i].equals(fList.get(j).getLocale())) {
				
					fdarray[i]++;
				}
				
				
				
			}
			
		}
		
		

		for(int i=0;i<locales.length;i++) {
		
		System.out.println(locales[i]+ "갯수 : " + fdarray[i]);

		}
		
		
	}
}