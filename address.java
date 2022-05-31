package project;


public class address extends university{

	private int flatNumber;
	private int houseNumber;
	private String streetName;
	private String distinctName;
	private String cityName;
	private String government;
	private String country;
	private int postalCode;
//	///////////////////////////////////////////////////////////////////////////////////
	
	public address(int flatNumber, int houseNumber, String streetName, String distinctName, String cityName,
			String government, String country, int postalCode) {
		this.flatNumber = flatNumber;
		this.houseNumber = houseNumber;
		this.streetName = streetName;
		this.distinctName = distinctName;
		this.cityName = cityName;
		this.government = government;
		this.country = country;
		this.postalCode = postalCode;
//		mailAddress.add("Flat number :"+this.flatNumber+" / "+"House number:"+" - " +this.houseNumber+" - "+this.streetName);
	}
//	///////////////////////////////////////////////////////////////////////////////////////////
	// setter and getter
	public int getFlatNumber() {
		return flatNumber;
	}
	public void setFlatNumber(int flatNumber) {
		this.flatNumber = flatNumber;
	}

	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getDistinctName() {
		return distinctName;
	}
	public void setDistinctName(String distinctName) {
		this.distinctName = distinctName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getGovernment() {
		return government;
	}
	public void setGovernment(String government) {
		this.government = government;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
///////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public String toString() {
		return "\n"+"flatNumber=" + flatNumber +"\n"+ ", houseNumber=" + houseNumber +"\n"+ ", streetName=" + streetName
				+"\n"+ ", distinctName=" + distinctName +"\n"+ ", cityName=" + cityName +"\n"+ ", government=" + government
				+"\n"+ ", country=" + country +"\n"+ ", postalCode=" + postalCode;
	}
}
