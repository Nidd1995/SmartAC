package App.back.ac.LiveStatus;

import java.util.Date;

public class AcStatusMongoModelPojo {
	
	private int acId;
	
	private String gasType;
	
	private int gasValue;
	
	private Date date;

	public AcStatusMongoModelPojo() {
		super();
	}

	public AcStatusMongoModelPojo(int acId, String gasType, int gasValue, Date date) {
		super();
		this.acId = acId;
		this.gasType = gasType;
		this.gasValue = gasValue;
		this.date = date;
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

	public int getGasValue() {
		return gasValue;
	}

	public void setGasValue(int gasValue) {
		this.gasValue = gasValue;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
