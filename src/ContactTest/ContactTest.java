package ContactTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Contact.Contact;

class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("1", "Troy", "Smith", "0123456789", "012345678910111213141516171819");
		assertTrue(contact.getcontactID().equals("1"));
		assertTrue(contact.getfirstName().equals("Troy"));
		assertTrue(contact.getlastName().equals("Smith"));
		assertTrue(contact.getNumber().equals("0123456789"));
		assertTrue(contact.getAddress().equals("123 Any Where, USA, TN. 12345"));
	}
	
	@Test
	void testContactContactIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			new Contact("01234567891", "Troy", "Smith", "0123456789", "012345678910111213141516171819");
		});
	}
	void testContactContactFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			new Contact("0123456789", "Troy Smith V", "Smith", "0123456789", "012345678910111213141516171819");
		});
	}
	void testContactContactLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			new Contact("0123456789", "Troy", "Smith Troy V", "0123456789", "012345678910111213141516171819");
		});
	}
	void testContactContactNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			new Contact("0123456789", "Troy", "Smith", "01234567891", "012345678910111213141516171819");
		});
	}
	void testContactContactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			new Contact("0123456789", "Troy", "Smith", "0123456789", "0123456789101112131415161718192");
		});
	}
}
