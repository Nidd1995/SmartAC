package App.back.ac.Customer;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CustomerDAO extends CrudRepository<CustomerModel ,Integer>{
	
	public List<CustomerModel> findByCustomerContact(long customerContact);
	
}


