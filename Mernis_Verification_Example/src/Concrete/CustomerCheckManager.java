package Concrete;

import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entites.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
		
	}

	


}
