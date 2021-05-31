package Contact;

public class Contact {
	private String contactID;
	private String firstName;
	private String lastName;
	private String Number;
	private String Address;
	
	public Contact (String contactID,String firstName,String lastName,String Number,String Address) {
		if(contactID == null || contactID.length()>10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		if(Number == null || Number.length()==10) {
			throw new IllegalArgumentException("Invalid Number");
		}
		if(Address == null || Address.length()>30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.Number = Number;
		this.Address = Address;	
	}
	public String getcontactID() {
		return contactID;
	}
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String firstName) {
		       this.firstName = firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public void setlastName(String lastName) {
	       this.lastName = lastName;
}
	public String getNumber() {
		return Number;
	}
	public void setNumber(String Number) {
	       this.Number = Number;
}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String Address) {
	       this.Address = Address;
}
}
