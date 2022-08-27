package Bridgelabz;

import java.util.Scanner;

public class AddressBookDelete {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ContactDelete AddressBook = new ContactDelete();
		/*
		 * Calling createContact method
		 */
		AddressBook.createContact();
		/*
		 * Calling displayContacts method
		 */
		AddressBook.displayContacts();	

		
		System.out.println("Press \'1\' to edit contact Or Press \'2\' to delete contact");
		System.out.println("Enter the option:");
		int option = sc.nextInt();
		
		if(option == 1) {
		/*
		 * Calling editContact method
		 */
		AddressBook.editContact();
		/*
		 * Calling displayContacts method
		 */
		AddressBook.displayContacts();
		}else if(option == 2){
		/*
		 * Calling to deleteContact method
		 */
		AddressBook.deleteContact();
		/*
		 * Calling displayContacts method
		 */
		AddressBook.displayContacts();
		}
	}
}
