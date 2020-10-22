import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookSystem {
	
	static List<AddressBookSystemManage> contactList = new ArrayList<>();
	
	
	//method for adding contacts
	public  static void addContact()
	{
		Scanner input = new Scanner(System.in);
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
		Scanner sc = new Scanner(System.in);
		int flag = 1 ;
		while(flag == 1)
		{
			System.out.println(" Welcome to address book program ");
			System.out.println(" Select a choice : 1. Add 2. Exit");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1 : addContact();
				break;
				case 2 : flag = 0 ;
				break;
				default : System.out.println(" Enter a valid choice");
				break;
			}		
		}
		System.out.println(contactList);
	}
}
