package App.back.ac.Airconditioner;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="acmodel")
public class AcModel {
	
	@Id
	int acId; // acId needs to be entered by administrator through frontend
	
	@Column(name="acbrand")
	String acBrand;
	
	@Column(name="acwarranty")
	int acWarranty;

	public AcModel() {
		super();
	}

	public AcModel(int acId, String acBrand, int acWarranty) {
		super();
		this.acId = acId;
		this.acBrand = acBrand;
		this.acWarranty = acWarranty;
	}

	public int getAcId() {
		return acId;
	}

	public void setAcId(int acId) {
		this.acId = acId;
	}

	public String getAcBrand() {
		return acBrand;
	}

	public void setAcBrand(String acBrand) {
		this.acBrand = acBrand;
	}

	public int getAcWarranty() {
		return acWarranty;
	}

	public void setAcWarranty(int acWarranty) {
		this.acWarranty = acWarranty;
	}
	
	
}
