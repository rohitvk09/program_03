package program_03;
import java.time.LocalDate;
import java.time.Period;

class Person {
    String name;
    LocalDate dob;

    public Person(String name, String dob) {
        this.name = name;
        this.dob = LocalDate.parse(dob); // Format: YYYY-MM-DD
    }

    public void displayInfo() {
        int age = Period.between(dob, LocalDate.now()).getYears();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Employee extends Person {
    String empId;
    double salary;

    public Employee(String name, String dob, String empId, double salary) {
        super(name, dob);
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployee() {
        displayInfo();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee("Rohit", "2001-01-01", "E101", 45000);
        e.displayEmployee();
    }
}