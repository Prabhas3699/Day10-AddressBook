package Bridgelabz;

public class AddressBookEdit {
	public static void main(String[] args) {
		
		ContactEdit AddressBook = new ContactEdit();	
		/*
		 * Calling createContact method
		 */
		AddressBook.createContact();
		/*
		 * Calling displayContacts method
		 */
		AddressBook.displayContacts();	

		System.out.println("\nPress Enter to edit contact:");
		/*
		 * Calling editContact method
		 */
		AddressBook.editContact();
		System.out.println("\nAdressbook of the person");
		/*
		 * Calling displayContacts method
		 */
		AddressBook.displayContacts();
		
	}
}
