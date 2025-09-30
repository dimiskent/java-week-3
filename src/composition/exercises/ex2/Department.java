package composition.exercises.ex2;

import java.util.ArrayList;
import java.util.List;

class Department {
    private List<Employee> employeeList;
    private final String name;
    public Department(String name) {
        this.employeeList = new ArrayList<>();
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void listEmployees() {
        for (Employee employee : employeeList) {
            System.out.println("Name: " + employee.getName());
            System.out.println("Role: " + employee.getRole());
            System.out.println();
        }
    }
}
