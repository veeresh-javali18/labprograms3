import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

class Person {
    String name;
    LocalDate dob;

    Person(String name, String dob) {
        this.name = name;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.dob = LocalDate.parse(dob, formatter);
    }

    public void displayPerson() {
        System.out.println("Name: " + name);
        Period age = Period.between(dob, LocalDate.now());
        System.out.println("Age: " + age.getYears() + " years");
    }
}
class Employee extends Person {
    int empid;
    double salary;

    public Employee(String name, String dob, int empid, double salary) {
        super(name, dob);
        this.empid = empid;
        this.salary = salary;
    }

    @Override
    public void displayPerson() {
        super.displayPerson();  // Display name and age
        System.out.println("Emp ID: " + empid);
        System.out.println("Salary: " + salary);
    }
}

public class main {
    public static void main(String[] args) {
        Employee e = new Employee("Veeresh", "31-08-2005", 8, 25500.0);
        e.displayPerson();
    }
}

