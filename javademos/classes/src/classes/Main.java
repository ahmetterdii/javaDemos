package classes;

public class Main {

	public static void main(String[] args) {
		//class --> reference type
		
		CustomerManager customerManager = new CustomerManager();
		/* Stack alan�nda customerManager olu�turulur. Heap'te de bunun referans� olu�ur.
		Diyelim 101 numaral� alan buraya ait olsun. */
		CustomerManager customerManager2 = new CustomerManager();
		// Ayn� �ekilde Stack ve Heap alanlar�nda de�erler olu�sun. 102 numara buraya ait olsun.
		customerManager = customerManager2;
		/* 101 de�eri 102 olarak de�i�tirildi. Bu durumda Heap alan�nda 101 bo�ta kalm�� oldu.
		Bir s�re sonra Garbage Collector (��p Toplama) bu 101 alan�n� temizler. */
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		/* Stack alan�nda de�i�kenler ve onlar�n de�erleri tutulur. Heap alan�nda de�erler tutulmaz.
		Heap alan�nda metodlar tutulur. int, double, float.. vs value type't�r. Sadece stack alan�nda �al���rlar. */
		
		// Diziler de referans tiplerdir.
	}

}
