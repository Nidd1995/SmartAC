package App.back.ac.LiveStatus;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AcStatusModel {
	
	@Id
	@Column(name="acid")
	int acId;
	
	@Column(name="status")
	String status;
	
	@Column(name = "date")
	Date date;

	public AcStatusModel() {
		super();
	}

	public AcStatusModel(int acId, String status, Date date) {
		super();
		this.acId = acId;
		this.status = status;
		this.date = date;
	}

	public int getAcId() {
		return acId;
	}

	public void setAcId(int acId) {
		this.acId = acId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	

}
