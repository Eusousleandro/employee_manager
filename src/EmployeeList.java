import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    private final List<Employee> employeeList;

    public EmployeeList() {
        this.employeeList = new ArrayList<>();
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
}
