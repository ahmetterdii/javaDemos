package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) {
		return tutar * 1.18;
	}
}

//E�er metodumuzun override edilmesini istemiyorsak final ifadesi kullan�lmal�d�r.
//public final double hesapla(double tutar) {}