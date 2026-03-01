package contact;

import java.util.HashMap;
import java.util.Map;

 
public class TaskService {
	
	//create HashMap to store contacts
	private Map<String, Task> contacts = new HashMap<>();
	
	//Add contact
	public void addContact(Task contact) {
		if (contacts.containsKey(contact.getContactId())) {
			throw new IllegalArgumentException();
		}
		contacts.put(contact.getContactId(), contact);
	}

	//Delete contact by ID
	public void deleteContact(String contactId) {
		if (!contacts.containsKey(contactId)) {
			throw new IllegalArgumentException();
		}
		contacts.remove(contactId);
	}
	
	//Update contact first name
	public void updateFirstName(String contactId, String firstName) {
		contacts.get(contactId).setFirstName(firstName);
	}
	
	//Update contact Last name
	public void updateLastname(String contactId, String lastName) {
		contacts.get(contactId).setLastName(lastName);
	}
	
	//Update contact number
	public void updatenumber(String contactId, String number) {
		contacts.get(contactId).setNumber(number);
	}
	
	//Update address
	public void updateaddress(String contactId, String address) {
		contacts.get(contactId).setAddress(address);
	}
	
	// For testing
	public Task getContact(String contactId) {
		return contacts.get(contactId);
	}
}
