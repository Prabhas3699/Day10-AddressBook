package Bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactMultiple {
	private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;

    Scanner sc = new Scanner(System.in);
    ArrayList<ContactMultiple> listOfContacts = new ArrayList<ContactMultiple>();

    /*
     * Added contact into a list
     */
    public void createContact() {
        
        
    	ContactMultiple ContactDetail = new ContactMultiple();
    	
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
        
        
        listOfContacts.add(ContactDetail);

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
		
		for (int i = 0; i<listOfContacts.size(); i++) {
			System.out.println("Loading... ");
			String FirstName = listOfContacts.get(i).firstName;
			String LastName = listOfContacts.get(i).lastName;
			if (FirstName.equals(firstName) && LastName.equals(lastName)) {
				
				System.out.print("Enter Address: ");
				listOfContacts.get(i).address = sc.nextLine();
				
				System.out.print("Enter City: ");
				listOfContacts.get(i).city = sc.nextLine();
				
				System.out.print("Enter Zip: ");
				listOfContacts.get(i).zip = sc.nextLine();
				
				System.out.print("Enter State: ");
				listOfContacts.get(i).state = sc.nextLine();
				
				System.out.print("Enter Email ID: ");
				listOfContacts.get(i).email = sc.nextLine();
				
				System.out.print("Enter Phone Number: ");
				listOfContacts.get(i).phoneNumber = sc.nextLine();
	
			}else {
				System.out.println("The first name and the last name are mismatch... Please enter the correct name");
			}
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
		
		for (int i = 0; i<listOfContacts.size(); i++) {
			System.out.println("Loading... ");
			String FirstName = listOfContacts.get(i).firstName;
			String LastName = listOfContacts.get(i).lastName;
			if (FirstName.equals(firstName) && LastName.equals(lastName)) {
				listOfContacts.remove(i);
				System.out.println("Your contact list is Deleted Successfully");
			}else {
				System.out.println("The first name and the last name are mismatch... Please enter the correct name");
			}
		}
	}
	
    /*
     * Displaying all contacts
     */
    public void displayContacts() {
        for (int i = 0; i<listOfContacts.size(); i++) {
            System.out.println("First Name: "+listOfContacts.get(i).firstName);
            System.out.println("Last Name: "+listOfContacts.get(i).lastName);
            System.out.println("Address: "+listOfContacts.get(i).address);
            System.out.println("city: "+listOfContacts.get(i).city);
            System.out.println("Zip: "+listOfContacts.get(i).zip);
            System.out.println("State: "+listOfContacts.get(i).state);
            System.out.println("Phone Number: "+listOfContacts.get(i).phoneNumber);
            System.out.println("Email id: "+listOfContacts.get(i).email);
        }
    
    }
	
}
