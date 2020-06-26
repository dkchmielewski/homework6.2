import java.util.Scanner;

public class EmployeeBuilder {
    public Employee createEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First name: ");
        String firstName = scanner.nextLine();
        System.out.println("Last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Salary: ");
        double salary = scanner.nextDouble();
        return new Employee(firstName, lastName, salary);
    }


}