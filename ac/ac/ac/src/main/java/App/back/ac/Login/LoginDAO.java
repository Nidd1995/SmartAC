package App.back.ac.Login;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface LoginDAO extends CrudRepository<LoginModel , Integer> {
	
	public List<LoginModel> findByUserName(String username);
	
	
}
