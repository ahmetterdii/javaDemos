package abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla();
	/* inherit eden class hesaplay� i�ermek zorunda ve onu override etmek zorunda anlam�na gelir. */
	
	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
}
