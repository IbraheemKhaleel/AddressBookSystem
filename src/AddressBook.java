import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
	
	AddressBookSystem addressBookSystem = new  AddressBookSystem();
	List<AddressBookSystemManage> contactList = new ArrayList<>();
	// method to add contact
	public  void addContact()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first name");
		String firstName = input.nextLine();
		for (int index = 0 ; index < contactList.size(); index ++)
		{
			if(firstName.equals(contactList.get(index).getFirstName()))
			{
				System.out.println(" The name already exists ");
				AddressBookSystem.entryOptions();
			}
		}
		System.out.println(" Enter second name ");
		String secondName = input.nextLine();
		System.out.println(" Enter city name ");
		String city = input.nextLine();
		System.out.println(" Enter zip code ");
		String zip = input.nextLine();
		
		AddressBookSystemManage addressBookSystem = new AddressBookSystemManage(firstName,secondName,city,zip);
		contactList.add(addressBookSystem);
	}
	// method for editing existing contact
	public void editContact()
	{
		Scanner nameInput = new Scanner(System.in);
		System.out.println(" Enter the first name ");
		String fName = nameInput.nextLine();
		for(int index = 0 ; index < contactList.size(); index++)
		{
			if (contactList.get(index).getFirstName().equals(fName))
			{
				contactList.remove(index);
				AddressBook addressBook = new AddressBook();
				addressBook.addContact();				
			}
			else
			{
				System.out.println(" There is no contact ");
			}
		}
	}
	public void deleteContact()
	{
		Scanner deleteNameInput = new Scanner(System.in);
		String deleteFirstName = deleteNameInput.nextLine();
		for (int increment = 0 ; increment < contactList.size(); increment++)
		{
			if(contactList.get(increment).getFirstName().equals(deleteFirstName))
			{
				contactList.remove(increment);
			}
			else
			{
				System.out.println(" Name does not exist");
			}
		}
	}

}
