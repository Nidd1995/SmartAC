package App.back.ac.LiveStatus;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AcStatusMongoModelKey implements Serializable {
	
	@Column(name="acid")
	private int acId;
	
	@Column(name = "gastype")
	private String gasType;

	public AcStatusMongoModelKey() {
		super();
	}

	public AcStatusMongoModelKey(int acId, String gasType) {
		super();
		this.acId = acId;
		this.gasType = gasType;
	}

	public int getAcId() {
		return acId;
	}

	public void setAcId(int acId) {
		this.acId = acId;
	}

	public String getGasType() {
		return gasType;
	}

	public void setGasType(String gasType) {
		this.gasType = gasType;
	}
	
}
