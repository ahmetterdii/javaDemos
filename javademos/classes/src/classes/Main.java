package classes;

public class Main {

	public static void main(String[] args) {
		//class --> reference type
		
		CustomerManager customerManager = new CustomerManager();
		/* Stack alanýnda customerManager oluþturulur. Heap'te de bunun referansý oluþur.
		Diyelim 101 numaralý alan buraya ait olsun. */
		CustomerManager customerManager2 = new CustomerManager();
		// Ayný þekilde Stack ve Heap alanlarýnda deðerler oluþsun. 102 numara buraya ait olsun.
		customerManager = customerManager2;
		/* 101 deðeri 102 olarak deðiþtirildi. Bu durumda Heap alanýnda 101 boþta kalmýþ oldu.
		Bir süre sonra Garbage Collector (Çöp Toplama) bu 101 alanýný temizler. */
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		/* Stack alanýnda deðiþkenler ve onlarýn deðerleri tutulur. Heap alanýnda deðerler tutulmaz.
		Heap alanýnda metodlar tutulur. int, double, float.. vs value type'týr. Sadece stack alanýnda çalýþýrlar. */
		
		// Diziler de referans tiplerdir.
	}

}
