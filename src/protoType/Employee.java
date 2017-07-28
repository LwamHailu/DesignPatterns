package protoType;

import java.io.Serializable;
import java.util.Arrays;

public class Employee implements Cloneable,Serializable {
	
	private int id;
	private String lastname;
	private String firstname;
	private String streetAddress;
	private String city;
	private String state;
	private String zipcode;
	private Employee supervisor;
	private Employee staff[];
	
	
	public Employee(int id ,String firstname,String lastname , String streetAddress, String city, String state,
			String zipcode) {
		
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
//		this.supervisor=supervisor;
//		this.staff=staff;
	}
	
	
	public Employee(int i, Employee supervisor, Employee staff[]) {
		this.id=i;
		this.supervisor=supervisor;
		this.staff=staff;
	}


	public void setStaff(Employee[] staff) {
		this.staff = staff;
	}
	public void setSupervisor(Employee supervisor) {
		this.supervisor = supervisor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastname() {
		return lastname;
	}
	public void setlastName(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setfirstName(String firstname) {
		this.firstname = firstname;
	}
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
	public Employee getSupervisor() {
		return supervisor;
	}
	
	public Employee[] getStaff() {
		return staff;
	}
	
	@Override
	protected Employee clone() throws CloneNotSupportedException {
		Employee employee=new Employee(id,supervisor,staff);
		return employee;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", lastname=" + lastname + ", firstname=" + firstname + ", streetAddress="
				+ streetAddress + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + ", supervisor="
				+ supervisor + ", staff=" + Arrays.toString(staff) + "]";
	}


	
}
