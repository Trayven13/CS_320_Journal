package contact;

public class Task {
	
	// variables 
	private final String contactId; 
	private String firstName;
	private String lastName;
	private String number;
	private String address;
	
	//constructors
	public Task(String contactId, String firstName, String lastName, String number, String address) {
			if (contactId == null || contactId.length() > 10) {
				throw new IllegalArgumentException();
			}
			if (firstName == null || firstName.length() > 10 || !firstName.matches("[a-zA-Z -]+")) {
				throw new IllegalArgumentException();
			}
			if (lastName == null || lastName.length() > 10 || !lastName.matches("[a-zA-Z -]+")) {
				throw new IllegalArgumentException();
			}
			if (number == null || number.length() != 10 || !number.matches("\\d+")) {
				throw new IllegalArgumentException();
			}
			if (address == null || address.length() > 30 || !address.matches("[a-zA-Z0-9 .,\\-#]+")) {
				throw new IllegalArgumentException();
			}
			
			this.contactId = contactId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.number = number;
			this.address = address;
	}
	
	//Getters
	public String getContactId() {
		return contactId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getNumber() {
		return number;
	}
	
	public String getAddress() {
		return address;
	}
	
	//Setters
	public void setFirstName(String firstName) {
		if (firstName == null || firstName.length() > 10 || !firstName.matches("[a-zA-Z -]+")) {
			throw new IllegalArgumentException();
		}
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		if (lastName == null || lastName.length() > 10 || !lastName.matches("[a-zA-Z -]+")) {
			throw new IllegalArgumentException();
		}
		this.lastName = lastName;
	}
	
	public void setNumber(String number) {
		if (number == null || number.length() != 10 || !number.matches("\\d+")) {
			throw new IllegalArgumentException();
		}
		this.number = number;
	}
	
	public void setAddress(String address) {
		if (address == null || address.length() > 30 || !address.matches("[a-zA-Z0-9 .,\\-#]+")) {
			throw new IllegalArgumentException();
		}
		this.address = address;
	}
}
	
	
