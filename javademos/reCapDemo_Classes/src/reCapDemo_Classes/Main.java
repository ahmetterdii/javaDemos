package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int sonuc1 = dortIslem.Topla(3, 6);
		int sonuc2 = dortIslem.Cikar(3, 6);
		int sonuc3 = dortIslem.Carp(3, 6);
		int sonuc4 = dortIslem.Bol(3, 6);
		System.out.println("Toplama : " + sonuc1 + " ��karma : " + sonuc2 + " �arpma : " + sonuc3 + " B�lme : " + sonuc4);
	}

}
