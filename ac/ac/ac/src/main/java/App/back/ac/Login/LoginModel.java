package App.back.ac.Login;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Loginmodel")
public class LoginModel {
	
	@Id
	@Column(name = "loginid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int loginId;
	
	@Column(name="username")
	private String userName;
	
	@Column(name="password")
	private String customerPassword;
	
	@Column(name="userid")
	private int userId;

	public LoginModel() {
		super();
	}

	public LoginModel(int loginId, String userName, String customerPassword, int userId) {
		super();
		this.loginId = loginId;
		this.userName = userName;
		this.customerPassword = customerPassword;
		this.userId = userId;
	}

	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
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

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
}
