package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new TarimKrediManager());
	}

}

/* KrediUI classında içerisinde ogretmenKrediManager veya tarimKrediManager göndermek yerine
baseKrediManager gönderilir. Referans tip olduğu için ana manager gönderilmesi gerekir, hata üretmez */