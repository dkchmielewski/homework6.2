public class Company {
    private Employee[] employees = new Employee[2];
    private int index = 0;

    void add (Employee employee) {
        if (index < employees.length) {
            employees[index] = employee;
            index++;
        } else
            System.out.println("Nie mozna juz dodac pracownikow");
    }

    Employee get(int index) {
        return employees[index];
    }

    double salaryCost() {
        return employees[0].getSalary() + employees[1].getSalary();
    }
}
