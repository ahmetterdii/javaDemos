package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) {
		return tutar * 1.18;
	}
}

//Eðer metodumuzun override edilmesini istemiyorsak final ifadesi kullanýlmalýdýr.
//public final double hesapla(double tutar) {}