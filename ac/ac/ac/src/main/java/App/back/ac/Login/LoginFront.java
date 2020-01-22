package App.back.ac.Login;

public class LoginFront {
	
	private String userName;
	
	private String customerPassword;

	public LoginFront() {
		super();
	}

	public LoginFront(String userName, String customerPassword) {
		super();
		this.userName = userName;
		this.customerPassword = customerPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

}
