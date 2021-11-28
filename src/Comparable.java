import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comparable {
    public static void main(String[] args) {
        Employee employee1 = new Employee(100, "Zaur", "Tregulov", 12345);
        Employee employee2 = new Employee(15, "Ivan", "Petrov", 6242);
        Employee employee3 = new Employee(123, "Ivan", "Sidorov", 8542);

        List <Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        System.out.println("Before sorting \n" + employeeList);

        Collections.sort(employeeList, new NameComparator());

        System.out.println("After sorting \n" + employeeList);

//        Arrays.sort(new Employee[] {employee1,employee2,employee3});
    }
}
