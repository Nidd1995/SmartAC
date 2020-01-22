package App.back.ac.Login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(method = RequestMethod.POST , value = "/login/check")
	public List<LoginModel> checkLoginCredentialController(@RequestBody LoginFront loginFront)
	{
		return loginService.checkLoginCredentialService(loginFront);
	}
	
	@RequestMapping(method = RequestMethod.POST ,  value ="/login/addlogin")
    public void setLoginCredentialController(@RequestBody LoginModel loginModel)
    {
    	loginService.setLoginCredential(loginModel);
    }
	
}
