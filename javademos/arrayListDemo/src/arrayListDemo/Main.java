package arrayListDemo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList sayilar = new ArrayList();
		
		sayilar.add(1);
		sayilar.add(10);
		sayilar.add("Ankara");
		//System.out.println(sayilar.size()); //boyut bilgisi
		//sayilar.set(0, 100); //de�er de�i�tirme
		//sayilar.remove(0); //de�er silme
		//System.out.println(sayilar.get(1));
		//sayilar.clear(); //t�m elemanlar� siler
		
		for (Object i:sayilar) {
			System.out.println(i);
		}
	}

}
