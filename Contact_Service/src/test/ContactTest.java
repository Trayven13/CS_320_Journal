package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test; 

import contact.Task;

class ContactTest {

	// Test Constructor
	@Test
	void testContact() {
		Task contact = new Task("1", "Bob", "Long", "5555555555", "1001 Bob lane");
		
		assertTrue(contact.getContactId().equals("1"));
		assertTrue(contact.getFirstName().equals("Bob"));
		assertTrue(contact.getLastName().equals("Long"));
		assertTrue(contact.getNumber().equals("5555555555"));
		assertTrue(contact.getAddress().equals("1001 Bob lane"));
	}
	
	//Test new contact variables
	@Test
	void testNullId() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(null, "Bob", "Long", "5555555555", "1001 Bob lane");
		});
	}
	
	@Test
	void testlongId() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("0123456789999", "Bob", "Long", "5555555555", "1001 Bob lane");
		});
	}
	
	@Test
	void testNullFirstName() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Task("1",null, "Long", "5555555555", "1001 Bob lane");
		});
	}
	
	@Test
	void testLongFirstName() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1","Bobbbbbbbbbbbbbbbbbbb", "Long", "5555555555", "1001 Bob lane");
		});
	}
	
	@Test
	void testInvInputFirstName() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1","Bo@b", "Long", "5555555555", "1001 Bob lane");
		});
	}
	
	@Test
	void testNullLastName() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Task("1","Bob", null, "5555555555", "1001 Bob lane");
		});
	}
	
	@Test
	void testLongLastName() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1","Bob", "Longggggggggggggggg", "5555555555", "1001 Bob lane");
		});
	}
	
	@Test
	void testInvInputLastName() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1","Bob", "Lon@g", "5555555555", "1001 Bob lane");
		});
	}
	
	@Test
	void testNullNumber() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1","Bob", "Long", null, "1001 Bob lane");
		});
	}
	@Test
	void testShortNumber() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1","Bob", "Long", "1111", "1001 Bob lane");
		});
	}
	@Test
	void testLongNumber() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1","Bob", "Long", "55555555555", "1001 Bob lane");
		});
	}
	@Test
	void testInvInputNumber() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1","Bob", "Long", "555-555-5555", "1001 Bob lane");
		});
	}
	
	@Test
	void testNullAddress() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Task("1","Bob", "Long", "5555555555", null);
		});
	}
	
	@Test
	void testLongAddress() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1","Bob", "Long", "5555555555", "1001 Bob lane lane lane lane lane");
		});
	}
	
	@Test
	void testInvInputAddress() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1","Bob", "Long", "5555555555", "1001 @ Bob lane");
		});
	}
	
	// test setters
	@Test
	void ValidateSetters() {
		Task c = new Task("1","Bob", "Long", "5555555555", "1001 Bob lane");
		
		c.setFirstName("Bill");
		c.setLastName("Short");
		c.setNumber("1111111111");
		c.setAddress("1001 Bill st.");
		
		assertTrue(c.getFirstName().equals("Bill"));
		assertTrue(c.getLastName().equals("Short"));
		assertTrue(c.getNumber().equals("1111111111"));
		assertTrue(c.getAddress().equals("1001 Bill st."));
		
	}
	
	@Test
	void setFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Task c = new Task("1","Bob", "Long", "5555555555", "1001 Bob lane");
			c.setFirstName(null);
		});
	}
	
	@Test
	void setFirstNameLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Task c = new Task("1","Bob", "Long", "5555555555", "1001 Bob lane");
			c.setFirstName("Billllllllllllllllllllll");
		});
	}
	
	@Test
	void setFirstNameInvInput() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Task c = new Task("1","Bob", "Long", "5555555555", "1001 Bob lane");
			c.setFirstName("Bil@l");
		});
	}
	
	@Test
	void setLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Task c = new Task("1","Bob", "Long", "5555555555", "1001 Bob lane");
			c.setLastName(null);
		});
	}
	
	@Test
	void setLastNameLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Task c = new Task("1","Bob", "Long", "5555555555", "1001 Bob lane");
			c.setLastName("Shortttttttttttttttt");
		});
	}
	
	@Test
	void setLastNameInvInput() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Task c = new Task("1","Bob", "Long", "5555555555", "1001 Bob lane");
			c.setLastName("Shor@t");
		});
	}
	
	@Test
	void setNumberNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Task c = new Task("1","Bob", "Long", "5555555555", "1001 Bob lane");
			c.setNumber(null);
		});
	}
	
	@Test
	void setNumberShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Task c = new Task("1","Bob", "Long", "5555555555", "1001 Bob lane");
			c.setNumber("111");
		});
	}
	
	@Test
	void setNumberLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Task c = new Task("1","Bob", "Long", "5555555555", "1001 Bob lane");
			c.setNumber("11111111111");
		});
	}
	
	@Test
	void setNumberInvInput() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Task c = new Task("1","Bob", "Long", "5555555555", "1001 Bob lane");
			c.setNumber("111-111-1111");
		});
	}
	
	@Test
	void setAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Task c = new Task("1","Bob", "Long", "5555555555", "1001 Bob lane");
			c.setAddress(null);
		});
	}
	
	@Test
	void setAddressLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Task c = new Task("1","Bob", "Long", "5555555555", "1001 Bob lane");
			c.setAddress("10000000000000000000001 Biiiilllllllllllllll streeeeeeeeeeeeeeeet");
		});
	}
	
	@Test
	void setAddressInvInput() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Task c = new Task("1","Bob", "Long", "5555555555", "1001 Bob lane");
			c.setAddress("1001 @ Bill street");
		});
	}
}
	
