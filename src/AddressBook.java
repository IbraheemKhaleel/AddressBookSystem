import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AddressBook {
	
	List<AddressBookSystemManage> contactList = new ArrayList<>();
	AddressBookSystem addressBookSystem =   new AddressBookSystem();
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
				addContact();
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
				System.out.println(contactList.get(index));
				Scanner editInput = new Scanner(System.in);
				System.out.println(" Enter a choice 	1.first name 	2.last name 	3. city 	4.zip ");
				int selection = nameInput.nextInt();
				switch (selection) 
				{
					case 1: 	System.out.println(" Enter first name ");
								String first_Name = editInput.nextLine();
								contactList.get(index).setFirstName(first_Name);
								System.out.println(contactList.get(index).getFirstName());
					break;
					case 2: 	System.out.println(" Enter last name ");
								String second_Name = editInput.nextLine();
								contactList.get(index).setLastName(second_Name);
					break;
					case 3:		System.out.println(" Enter city name ");
								String input_City = editInput.nextLine();
								contactList.get(index).setCity(input_City);
					break;
					case 4:		System.out.println(" Enter zip code ");
								String input_Zip = editInput.nextLine();
								contactList.get(index).setZip(input_Zip);

					default:	System.out.println(" Enter valid input ");
 					break;
				}
			}
			
		}
		System.out.println(contactList);
		
	}
	// method for deleting a contact
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
	//method for search person's details with respect o their city
	public void searchByCity()
	{
		Scanner cityInput = new Scanner(System.in);
		System.out.println(" Enter the city name you want to get contact details ");
		String city = cityInput.nextLine();
		for (AddressBookSystemManage cityList : contactList)
		{
			if ( cityList.getCity().equals(city))
				System.out.println(cityList);
		}
		
	}
	//method for viewing persons details
	public void viewPersonDetails()
	{
		System.out.println(contactList);
	}
	//method for viewing person's details with respect o their city
	public void viewPersonByCity()
	{
		Scanner cityViewInput = new Scanner(System.in);
		System.out.println(" Enter the city name you want to get the person details");
		String city = cityViewInput.nextLine();
		for (AddressBookSystemManage cityList : contactList)
		{
			if ( cityList.getCity().equals(city))
				System.out.println(cityList);
		}
	}
	//method for count number of persons in same city
	public void countOfPersonsByCity()
	{
		int count = 0;
		Collections.sort(contactList, new SortByCityName());
		Scanner cityCountInput = new Scanner(System.in);
		System.out.println(" Enter the city ");
		String city = cityCountInput.nextLine();
		for ( int index = 0 ; index+1 < contactList.size() ; index ++)
		{
			if (contactList.get(index).getCity().equals(city))
			if (contactList.get(index).getCity().equals(contactList.get(index+1).getCity()))
			{
				count += 1 ;
			}
		
		}
		count++;
		System.out.println(" The number of persons from the city " + city + " is " + count);
	}
	public void sortingByName()
	{
		Collections.sort(contactList, new SortByName());
		System.out.println(contactList);
	}
	
	

}
