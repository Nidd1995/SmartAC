package App.back.ac.Customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping(method = RequestMethod.POST , value = "/customer/register")
	public List<CustomerModel> CustomerRegistrationController(@RequestBody CustomerModel customerModel)
	{
		return customerService.CustomerRegistrationService(customerModel);
	}

}
