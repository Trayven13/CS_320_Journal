package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import contact.Task;
import contact.TaskService;

class ContactServiceTest {

	@Test
	void testAddContact() {
		TaskService service = new TaskService();
		Task c = new Task("1", "Bob", "Long", "5555555555", "1001 Bob lane");
		
		service.addContact(c);
		
		assertNotNull(service.getContact("1"));
	}
	
	@Test
	void testDuplicateContact() { 
		TaskService service = new TaskService();
		Task c1 = new Task("1", "Bob", "Long", "5555555555", "1001 Bob lane");
		Task c2 = new Task("1", "Bill", "Short", "1111111111", "1001 Bill street");
		
		service.addContact(c1);
		
		assertThrows(IllegalArgumentException.class, () -> {
			service.addContact(c2);
		});
	}
	
	@Test
	void testDeleteContact() {
		TaskService service = new TaskService();
		Task c1 = new Task("1", "Bob", "Long", "5555555555", "1001 Bob lane");
		
		service.addContact(c1);
		service.deleteContact("1");
		
		assertNull(service.getContact("1"));
	}
	
	@Test
	void testDeleteInvContact() {
		TaskService service = new TaskService();
		Task c1 = new Task("1", "Bob", "Long", "5555555555", "1001 Bob lane");
		
		service.addContact(c1);
		
		assertThrows(IllegalArgumentException.class, () -> {
			service.deleteContact("999");
		});
	}
	
	@Test
	void testUpdateFields() {
		TaskService service = new TaskService();
		Task c = new Task("1", "Bob", "Long", "5555555555", "1001 Bob lane");
		
		service.addContact(c);
		
		service.updateFirstName("1", "Bill");
		service.updateLastname("1", "Short");
		service.updatenumber("1", "1111111111");
		service.updateaddress("1", "1001 Bill Street");
		
		assertTrue(c.getFirstName().equals("Bill"));
		assertTrue(c.getLastName().equals("Short"));
		assertTrue(c.getNumber().equals("1111111111"));
		assertTrue(c.getAddress().equals("1001 Bill Street"));
	}
}
