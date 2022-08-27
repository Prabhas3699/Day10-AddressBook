package Bridgelabz;

import java.util.Scanner;

public class AddressBookDictionary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ContactDictionary AddressBook = new ContactDictionary();
		System.out.println("Enter the number of person:");
		int person =sc.nextInt();
		
		for(int i=1; i<=person;i++) {
			System.out.println("Enter the \'"+i+"\' person detail:");
		/*
		 * Calling createContact method
		 */
		AddressBook.createContact();
		/*
		 * Calling displayContacts method
		 */
		AddressBook.displayContacts();	
		System.out.println("-------------------------------------------");
		}
		
		System.out.println("Press \'1\' to edit contact Or Press \'2\' to delete contact Or Press \\'3\\' to Display contact");
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
		System.out.println("-------------------------------------------");
		AddressBook.displayContacts();
		}else if(option == 2){
		/*
		 * Calling to deleteContact method
		 */
		AddressBook.deleteContact();
		/*
		 * Calling displayContacts method
		 */
		System.out.println("-------------------------------------------");
		AddressBook.displayContacts();
		}else if (option ==3) {
			System.out.println("-------------------------------------------");
			AddressBook.displayContacts();
		}
		}
}
