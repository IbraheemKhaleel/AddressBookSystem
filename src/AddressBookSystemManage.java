
public class AddressBookSystemManage {
	
	private String firstName ;
	private String lastName ;
	private String city ;
	private String zip ;
	
	public AddressBookSystemManage(String firstName, String lastName, String city, String zip) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.zip = zip;
	}


	@Override
	public String toString() {
		return "AddressBookSystemManage [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city
				+ ", zip=" + zip + "]";
	}


	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getZip() {
		return zip;
	}

}
