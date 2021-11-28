import java.util.Comparator;

public class IdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee anotherEmployee1, Employee anotherEmployee2) {
        if(anotherEmployee1.id == anotherEmployee2.id) {
            return 0;
        }else if(anotherEmployee1.id < anotherEmployee2.id) {
            return -1;
        }else {
            return 1;
        }
    }
}
