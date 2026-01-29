import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    private List<Employee> employeeList;

    public EmployeeList() {
        this.employeeList = new ArrayList<>();
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public Employee position(Integer id) {
        Employee employeeById = null;
        if (!employeeList.isEmpty()){
            for (Employee employee : employeeList) {
                if (employee.getId().equals(id)) {
                    employeeById = employee;
                }
            }
        }

        return employeeById;
    }

    public boolean hasId(EmployeeList employeeList, int id) {
        Employee employeeById = null;
        if(!this.employeeList.isEmpty()) {
            for (Employee employee : this.employeeList) {
                if (employee.getId().equals(id)) {
                    employeeById = employee;
                }
            }
        }
        return employeeById != null;
    }
}