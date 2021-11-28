import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee anotherEmployee1, Employee anotherEmployee2) {

        int result = anotherEmployee1.name.compareTo(anotherEmployee2.name);
        if (result == 0) {
            result = anotherEmployee1.surname.compareTo(anotherEmployee2.surname);
        }
        return result;
    }
}
