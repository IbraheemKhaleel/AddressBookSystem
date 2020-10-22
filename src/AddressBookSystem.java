import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookSystem {
	
	static List<AddressBookSystemManage> contactList = new ArrayList<>();
	static Scanner input = new Scanner(System.in);
	
	//method for adding contacts
	public  static void addContact()
	{
		System.out.println(" Enter first name ");
		String firstName = input.nextLine();
		System.out.println(" Enter second name ");
		String secondName = input.nextLine();
		System.out.println(" Enter city name ");
		String city = input.nextLine();
		System.out.println(" Enter zip code ");
		String zip = input.nextLine();
		
		AddressBookSystemManage addressBook = new AddressBookSystemManage(firstName,secondName,city,zip);
		contactList.add(addressBook);			
		
	}
 
	//main function
	public static void main(String[] args) {
		System.out.println(" Welcome to address book program ");
		addContact();
		System.out.println(contactList);		
	}
}
