import java.util.GregorianCalendar;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entites.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
	
		customerManager.save(new Customer(1, "Elif", "Karagöz", new GregorianCalendar(2000, 02 , 14).getTime(), "43597864310"));
		
	}

}
