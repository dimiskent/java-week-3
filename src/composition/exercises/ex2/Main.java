package composition.exercises.ex2;
/**
 * TODO:
 * 1. Create class Employee with fields: name, role.
 * 2. Create class Department that HAS-A List<Employee>.
 * 3. Create class Company that HAS-A List<Department>.
 * 4. Add methods to:
 * - Add employee to a department
 * - List employees by department
 * 5. Test with multiple departments and employees.
 */
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Joe", "Developer");
        Employee employee2 = new Employee("Mary", "Manager");
        Employee employee3 = new Employee("Rick", "Support");
        Employee employee4 = new Employee("Dany", "Support");

        Department department1 = new Department("Developer");
        Department department2 = new Department("Support");

        department1.addEmployee(employee1);
        department1.addEmployee(employee2);
        department2.addEmployee(employee3);
        department2.addEmployee(employee4);

        Company myCompany = new Company();
        myCompany.addDepartment(department1);
        myCompany.addDepartment(department2);
        myCompany.listEmployees();
    }
}
