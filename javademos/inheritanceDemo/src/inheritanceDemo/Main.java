package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new TarimKrediManager());
	}

}

/* KrediUI class�nda i�erisinde ogretmenKrediManager veya tarimKrediManager g�ndermek yerine
baseKrediManager g�nderilir. Referans tip oldu�u i�in ana manager g�nderilmesi gerekir, hata �retmez */