import java.util.Comparator;

public class SortByCityName implements Comparator<AddressBookSystemManage> {
	@Override
    public int compare(AddressBookSystemManage person1, AddressBookSystemManage person2) {

        return (person1.getCity()).compareTo(person2.getCity());
    }


}
