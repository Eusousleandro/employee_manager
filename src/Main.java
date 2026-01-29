import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        EmployeeList employeeList = new EmployeeList();

        System.out.print("How many employees will be registered?");
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++){
            System.out.println();
            System.out.println("Employee # :" + (i + 1));
            System.out.print("Id: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            Double salary = scanner.nextDouble();

            employeeList.addEmployee(new Employee(id, name, salary));
        }

        System.out.println();
        System.out.print(" Enter the employee id that will have salary increase: ");
        int idSalary = scanner.nextInt();
        Employee pos = employeeList.position(idSalary);
        if (pos == null) {
            System.out.println("The id does not exist!");
        } else {
            System.out.println("Emter the percentage: ");
            double percent = scanner.nextDouble();
            pos.incrementSalary(percent);
        }
        scanner.close();
    }
}
