package App.back.ac.AcCustomer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="accustomer")
public class AcCustomerModel {
	
	@Id
	@Column(name="accustid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	int acCustId;
	
	@Column(name="customerid")
	int customerId;
	
	@Column(name="acid")
	int acId;

	public AcCustomerModel() {
		super();
	}

	public AcCustomerModel(int acCustId, int customerId, int acId) {
		super();
		this.acCustId = acCustId;
		this.customerId = customerId;
		this.acId = acId;
	}

	public int getAcCustId() {
		return acCustId;
	}

	public void setAcCustId(int acCustId) {
		this.acCustId = acCustId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getAcId() {
		return acId;
	}

	public void setAcId(int acId) {
		this.acId = acId;
	}
	
	

}
