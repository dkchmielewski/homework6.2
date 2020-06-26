class CompanyTest {
    public static void main(String[] args) {
        EmployeeBuilder employeeBuilder = new EmployeeBuilder();

        Company company = new Company();
        company.add(employeeBuilder.createEmployee());
        company.add(employeeBuilder.createEmployee());


        System.out.println("Salary cost: " + company.salaryCost());
        System.out.println(company.get(0).getFirstName());
    }
}
