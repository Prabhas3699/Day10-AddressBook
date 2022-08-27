package Bridgelabz;

public class AddressBook {
	public static void main(String[] args) {
		
		Contact addressBook=new Contact("Prabhakaran","Iyanar","No.1,Thambiran Nagar,\nThambiran house","Maduranthakam","TamilNadu","603306","6380660636","prabhak620@gmail.com");

        System.out.println("Name:"+addressBook.getFirstName()+" "+addressBook.getLastName()+"\nAddress:"+addressBook.getAddress()+",\n"+addressBook.getCity()+"-"+addressBook.getZip()+"\n"+addressBook.getState()+".\nPhone Number:"+addressBook.getPhoneNumber()+"\nEmail:"+addressBook.getEmail());
	}
}
