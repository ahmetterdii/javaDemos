package inheritance;

public class Main {

	public static void main(String[] args) {
		//�ki nesne aras�nda miras durumu
		//Bir nesne di�erine miras b�rak�r.
		Customer customer = new Customer();
		Employee employee = new Employee();
		
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
	}

}
