package App.back.ac.Login;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LoginService {
    
    @Autowired
    LoginDAO loginDAO;
    
    //*************************************************************************************************
    //*************************************************************************************************
    
    public List<LoginModel> checkLoginCredentialService(LoginFront loginFront) {
        
        final String customerUserNameTemp = loginFront.getUserName();
        final String customerUserPasswordTemp = loginFront.getCustomerPassword();
        
        //System.out.println( loginFront.getUserName());
        //System.out.println( "Hello");

        
        LoginModel nullLoginModel = new LoginModel();      // creating an empty object of LoginModel
        ArrayList<LoginModel> login1 = new ArrayList<>();  // creating a different list
        login1.add(nullLoginModel);                        // adding the empty object to another list
        
        ArrayList<LoginModel> login = new ArrayList<>(); 
        
        loginDAO.findByUserName(loginFront.getUserName()).forEach(login::add);
        
        
        if((!login.isEmpty()) && (login.get(0).getCustomerPassword().equals(customerUserPasswordTemp) 
                && login.get(0).getUserName().equals(customerUserNameTemp))){
            
            return login; // returns list of the customer whose credentials are matched
        }
        
        return login1; // returns empty list if credentials are not matched
    }
    
    //**************************************************************************************************
    //**************************************************************************************************
    
    public LoginModel setLoginCredential(LoginModel loginModel) {
        
        
        ArrayList<LoginModel> login = new ArrayList<>();
        loginDAO.findByUserName(loginModel.getUserName()).forEach(login::add);
        LoginModel elmdl= new LoginModel();
        
        if(login.isEmpty())
        {
            loginDAO.save(loginModel);
            return loginModel;
        }
        
        return elmdl;
    }
}