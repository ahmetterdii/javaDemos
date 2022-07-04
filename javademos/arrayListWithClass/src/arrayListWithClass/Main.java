package arrayListWithClass;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Customer> customers = new ArrayList<Customer> ();
		
		Customer engin = new Customer(1,"Engin","Demiroð");
		customers.add(engin);
		
		Customer ahmetErdi = new Customer(2,"Ahmet Erdi","Hacýkahyaoðlu");
		customers.add(ahmetErdi);
		
		Customer arda = new Customer(3,"Arda","Erpak");
		customers.add(arda);
		
		for(Customer customer : customers) {
			System.out.println(customer.firstName);
		}
	}

}
