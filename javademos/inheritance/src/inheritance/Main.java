package inheritance;

public class Main {

	public static void main(String[] args) {
		//İki nesne arasında miras durumu
		//Bir nesne diğerine miras bırakır.
		Customer customer = new Customer();
		Employee employee = new Employee();
		
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
	}

}
