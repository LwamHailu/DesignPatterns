package chainOfResponsibility;

public class Address {
	private String streetAddress;
	private String city;
	private String state;
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public Address(String streetAddress, String city, String state, String zipcode) {
		super();
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	
	
	private String zipcode;
	@Override
	public String toString() {
		return "Address [streetAddress=" + streetAddress + ", city=" + city + ", state=" + state + ", zipcode="
				+ zipcode + "]";
	}
	
}
