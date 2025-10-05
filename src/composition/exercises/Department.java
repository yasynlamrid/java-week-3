package composition.exercises;

import java.util.ArrayList;

/**
 TODO:
 1. Create class Employee with fields: name, role.
 2. Create class Department that HAS-A List<Employee>.
 3. Create class Company that HAS-A List<Department>.
 4. Add methods to:
      - Add employee to a department
      - List employees by department
 5. Test with multiple departments and employees.
*/

public class Department
{

    private ArrayList<Employee> employee;

    public Department(ArrayList employee){

        this.employee = new ArrayList<>();
    }



}

class Employee {

    protected String name;
    protected String role;

    public Employee(String name, String role){

        this.name = name;
        this.role = role;
    }


}

class Company {

    private ArrayList<Department> department;

    public Company(ArrayList department){

        this.department = department;
    }

    public void addEmployeee(Department emp){

        department.add(emp);

    }
}
