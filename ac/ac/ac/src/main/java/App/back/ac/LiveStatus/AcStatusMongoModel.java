package App.back.ac.LiveStatus;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class AcStatusMongoModel {
	
	@EmbeddedId
	private AcStatusMongoModelKey acStatusMongoModelKey;
	
	@Column(name = "gasvalue")
	private int gasValue;
	
	@Column(name="date")
	private Date date;

	public AcStatusMongoModel() {
		super();
	}

	public AcStatusMongoModel(AcStatusMongoModelKey acStatusMongoModelKey, int gasValue, Date date) {
		super();
		this.acStatusMongoModelKey = acStatusMongoModelKey;
		this.gasValue = gasValue;
		this.date = date;
	}

	public AcStatusMongoModelKey getAcStatusMongoModelKey() {
		return acStatusMongoModelKey;
	}

	public void setAcStatusMongoModelKey(AcStatusMongoModelKey acStatusMongoModelKey) {
		this.acStatusMongoModelKey = acStatusMongoModelKey;
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
