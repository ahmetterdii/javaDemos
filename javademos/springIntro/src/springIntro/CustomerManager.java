package springIntro;

public class CustomerManager implements ICustomerService {
	
	private ICustomerDal customerDal;
	
	//setter injection
	public ICustomerDal getCustomerDal() {
		return customerDal;
	}

	public void setCustomerDal(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	//constructor injection
	/* public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	} */
	public void add() {
		//Ýþ kurallarý
		customerDal.add();
	}
}
