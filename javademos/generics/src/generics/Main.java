package generics;

public class Main {

	public static void main(String[] args) {
		//Tip g�venli �al��ma.
		MyList<Customer> sehirler = new MyList<Customer>();
		sehirler.add(new Customer());
		sehirler.add(new Customer());
	}

}
