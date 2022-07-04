package exceptionHandling;

public class Main {

	public static void main(String[] args) {
		try
		{
			int[] sayilar = new int[] {1,2,3};
			System.out.println(sayilar[5]);
		}catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Hata oluþtu : " + exception);
		}catch (StringIndexOutOfBoundsException exception) {
			System.out.println("Hata oluþtu : " + exception);
		}catch (Exception exception) {
			System.out.println("Loglandý : " + exception);
		}finally {
			System.out.println("Ben her türlü çalýþýrým.");
		}
		

	}

}
