package arrayListDemo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList sayilar = new ArrayList();
		
		sayilar.add(1);
		sayilar.add(10);
		sayilar.add("Ankara");
		//System.out.println(sayilar.size()); //boyut bilgisi
		//sayilar.set(0, 100); //deðer deðiþtirme
		//sayilar.remove(0); //deðer silme
		//System.out.println(sayilar.get(1));
		//sayilar.clear(); //tüm elemanlarý siler
		
		for (Object i:sayilar) {
			System.out.println(i);
		}
	}

}
