package composition.exercises.ex2;

import java.util.ArrayList;
import java.util.List;

class Company {
    private List<Department> departmentList;

    public Company() {
        this.departmentList = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departmentList.add(department);
    }
    public void listEmployees() {
        for(Department department : departmentList) {
            System.out.println("Listing the " + department.getName() + " department:");
            department.listEmployees();
            System.out.println("--------------------");
        }
    }
}
