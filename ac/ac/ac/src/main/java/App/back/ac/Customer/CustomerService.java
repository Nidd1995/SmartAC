package App.back.ac.Customer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	@Autowired
	CustomerDAO customerDAO;
	
	public List<CustomerModel> CustomerRegistrationService(CustomerModel customerModel) {
		
		final long customerModelContactTemp = customerModel.getCustomerContact();
		ArrayList<CustomerModel> customerList = new ArrayList<>();
		ArrayList<CustomerModel> customerListEmpty = new ArrayList<>();
		CustomerModel emptyCustomerModel = new CustomerModel();
		
		customerListEmpty.add(emptyCustomerModel); // adding empty object to list to signify customer registration fails
		
	    customerDAO.findByCustomerContact(customerModelContactTemp).forEach(customerList::add);
		
	    if(customerList.isEmpty())
	    {
	    	customerDAO.save(customerModel); // saving the data of the new user
	    	                                 // adding the new user to the list 
	    	customerDAO.findByCustomerContact(customerModelContactTemp).forEach(customerList::add);
	    	
	    	return customerList;  
	    }
	    
	    else if(!customerList.isEmpty())
	    {
	    	return customerListEmpty;
	    }
	    
		return customerListEmpty;
	}

}
