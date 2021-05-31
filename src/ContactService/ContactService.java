package ContactService;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import Contact.Contact;

public class ContactService {
	private static int uniqueId=2000;
	   private static Map<Integer, Contact> contacts = new HashMap<>();
	   
	public Map<Integer, Contact> addContact(Contact contact) {
	       uniqueId++;
	       contacts.put(uniqueId, contact);
	       return contacts;
	   }
	public Map<Integer, Contact> deleteContact(String contactID) {

	       Iterator<Entry<Integer, Contact>> itr = contacts.entrySet().iterator();

	       while (itr.hasNext()) {
	           Map.Entry<Integer, Contact> entry = (Map.Entry<Integer, Contact>) itr.next();
	           if (entry.getValue().getcontactID() == contactID) {
	               itr.remove();
	           }
	       }

	       return contacts;

	   }
	 public Map<Integer, Contact> updateContact(String contactID, String firstName, String lastName, String Number,
	           String Address) {

	       Iterator<Entry<Integer, Contact>> itr = contacts.entrySet().iterator();

	       while (itr.hasNext()) {
	           Map.Entry<Integer, Contact> entry = (Map.Entry<Integer, Contact>) itr.next();

	           if (entry.getValue().getcontactID() == contactID) {
	               entry.getValue().setfirstName(firstName);
	               entry.getValue().setlastName(lastName);
	               entry.getValue().setNumber(Number);
	               entry.getValue().setAddress(Address);
	           }

	       }

	       return contacts;

	   }

}
