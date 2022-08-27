package Bridgelabz;

import java.util.HashMap;
import java.util.Scanner;

public class ContactDictionary {
	private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;

    Scanner sc = new Scanner(System.in);
    HashMap<String,ContactDictionary> listOfContacts = new HashMap<String,ContactDictionary>();

    /*
     * Added contact into a list
     */
    public void createContact() {
        
        
    	ContactDictionary ContactDetail = new ContactDictionary();
    	
        System.out.println("Enter the first name:");
        ContactDetail.firstName = sc.nextLine();
        System.out.println("Enter the last name:");
        ContactDetail.lastName = sc.nextLine();
        System.out.println("Enter the address:");
        ContactDetail.address = sc.nextLine();
        System.out.println("Enter the city:");
        ContactDetail.city = sc.nextLine();
        System.out.println("Enter the state:");
        ContactDetail.state = sc.nextLine();
        System.out.println("Enter the zip code:");
        ContactDetail.zip = sc.nextLine();
        System.out.println("Enter the ph no.:");
        ContactDetail.phoneNumber = sc.nextLine();
        System.out.println("Enter the email:");
        ContactDetail.email = sc.nextLine();
        
        String key = ContactDetail.firstName + ContactDetail.lastName;
		listOfContacts.put(key,ContactDetail);
       

    }
    /*
     * method to edit contact
     */
    public void editContact() {
		sc.nextLine();
		System.out.println("Enter details to edit contact: ");
		System.out.print("Enter First Name : ");
		String firstName = sc.nextLine();
		System.out.print("Enter Last Name: ");
		String lastName = sc.nextLine();
		
		String key =firstName + lastName;
		
		if (listOfContacts.containsKey(key)) {
			ContactDictionary ContactKey=listOfContacts.get(key);
				
				System.out.print("Enter Address: ");
				ContactKey.address = sc.nextLine();
				
				System.out.print("Enter City: ");
				ContactKey.city = sc.nextLine();
				
				System.out.print("Enter Zip: ");
				ContactKey.zip = sc.nextLine();
				
				System.out.print("Enter State: ");
				ContactKey.state = sc.nextLine();
				
				System.out.print("Enter Email ID: ");
				ContactKey.email = sc.nextLine();
				
				System.out.print("Enter Phone Number: ");
				ContactKey.phoneNumber = sc.nextLine();
	
			}else {
				System.out.println("The first name and the last name are mismatch... Please enter the correct name");
			}
		}	
    
    /*
	 * For deleting the array elements
	 */
	public void deleteContact() {
		sc.nextLine();
		System.out.println("Enter details to delete contact: ");
		System.out.print("Enter First Name : ");
		String firstName = sc.nextLine();
		System.out.print("Enter Last Name: ");
		String lastName = sc.nextLine();
		
		String key =firstName+lastName;
			if (listOfContacts.containsKey(key)) {
				listOfContacts.remove(key);
				System.out.println("Your contact list is Deleted Successfully");
			}else {
				System.out.println("The first name and the last name are mismatch... Please enter the correct name");
			}
		}
	
    /*
     * Displaying all contacts
     */
    public void displayContacts() {
        for (ContactDictionary ContactDetail:listOfContacts.values() ) {
            System.out.println("First Name: "+ContactDetail.firstName);
            System.out.println("Last Name: "+ContactDetail.lastName);
            System.out.println("Address: "+ContactDetail.address);
            System.out.println("city: "+ContactDetail.city);
            System.out.println("Zip: "+ContactDetail.zip);
            System.out.println("State: "+ContactDetail.state);
            System.out.println("Phone Number: "+ContactDetail.phoneNumber);
            System.out.println("Email id: "+ContactDetail.email);
        }
    
    }

}
