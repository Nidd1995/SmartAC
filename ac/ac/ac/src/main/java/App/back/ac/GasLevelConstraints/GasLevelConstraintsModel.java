package App.back.ac.GasLevelConstraints;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "safelevel")
public class GasLevelConstraintsModel {
	
	@Id
	@Column(name="gastype")
	String gasType;
	
	@Column(name="lowerlevel")
	int lowerLevel;
	
	
	@Column(name="upperlevel")
	int upperLevel;


	public GasLevelConstraintsModel() {
		super();
	}


	public GasLevelConstraintsModel(String gasType, int lowerLevel, int upperLevel) {
		super();
		this.gasType = gasType;
		this.lowerLevel = lowerLevel;
		this.upperLevel = upperLevel;
	}


	public String getGasType() {
		return gasType;
	}


	public void setGasType(String gasType) {
		this.gasType = gasType;
	}


	public int getLowerLevel() {
		return lowerLevel;
	}


	public void setLowerLevel(int lowerLevel) {
		this.lowerLevel = lowerLevel;
	}


	public int getUpperLevel() {
		return upperLevel;
	}


	public void setUpperLevel(int upperLevel) {
		this.upperLevel = upperLevel;
	}
	
	

}
