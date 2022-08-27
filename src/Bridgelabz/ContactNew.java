package Bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactNew {
	private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;

    Scanner sc = new Scanner(System.in);
    ArrayList<ContactNew> listOfContacts = new ArrayList<ContactNew>();

    /*
     * Added contact into a list
     */
    public void createContact() {
        
        
    	ContactNew ContactDetail = new ContactNew();
    	
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
