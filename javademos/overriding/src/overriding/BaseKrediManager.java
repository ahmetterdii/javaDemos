package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) {
		return tutar * 1.18;
	}
}

//Eğer metodumuzun override edilmesini istemiyorsak final ifadesi kullanılmalıdır.
//public final double hesapla(double tutar) {}