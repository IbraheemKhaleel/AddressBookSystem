import java.util.Comparator;

public class SortByName implements Comparator<AddressBookSystemManage>
{
	public int compare(AddressBookSystemManage firstPerson , AddressBookSystemManage nextPerson)
	{
		return firstPerson.getFirstName().compareTo(nextPerson.getFirstName());
	}
}