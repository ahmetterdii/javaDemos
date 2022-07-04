package abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla();
	/* inherit eden class hesaplayý içermek zorunda ve onu override etmek zorunda anlamýna gelir. */
	
	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
}
