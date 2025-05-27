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

