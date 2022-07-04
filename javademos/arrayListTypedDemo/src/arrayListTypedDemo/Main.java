package arrayListTypedDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> sehirler = new ArrayList<String>();
		sehirler.add("Ankara");
		sehirler.add("Ýstanbul");
		sehirler.add("Ýzmir");
		sehirler.add("Aydýn");
		
		sehirler.remove("Ýstanbul");
		Collections.sort(sehirler);
		
		for(String sehir : sehirler) {
			System.out.println(sehir);
		}
	}

}
