public class Employee implements java.lang.Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

// Variant spelling 1
//    @Override
//    public int compareTo(Employee anotherEmployee) {
//        if(this.id == anotherEmployee.id) {
//            return 0;
//        }else if(this.id < anotherEmployee.id) {
//            return -1;
//        }else {
//            return 1;
//        }
//    }

// Variant spelling 2
//    @Override
//    public int compareTo(Employee anotherEmployee) {
//        return  this.id-anotherEmployee.id;
//    }

// Variant spelling 3. Need to do "Integer id";
//    @Override
//    public int compareTo(Employee anotherEmployee) {
//        return  this.id.compareTo(anotherEmployee.id);
//    }

// Variant spelling 4.
         @Override
         public int compareTo(Employee anotherEmployee) {
             int result = this.name.compareTo(anotherEmployee.name);
             if (result == 0) {
                 result = this.surname.compareTo(anotherEmployee.surname);
             }
             return result;
         }

}
