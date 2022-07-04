package packagesDemo;

//build-in --> javanýn içinde olan package anlamýna gelir.
import java.util.Scanner;

import matematik.DortIslem;
import matematik.Logaritma;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Adýnýzý giriniz : ");
		
		String isim = scanner.nextLine();
		
		System.out.println("Merhaba " + isim);
		
		DortIslem dortIslem = new DortIslem();
		dortIslem.topla(2, 3);
		Logaritma logaritma = new Logaritma();
		logaritma.logaritmaHesapla();
	}

}
