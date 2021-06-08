import service.Employee;
import service.EmployeeServiceImplService;

public class Main {
    public static void main(String[] args) {
        Employee employeeById = new EmployeeServiceImplService().getEmployeeServiceImplPort().getEmployeeById(1);
        System.out.println(employeeById);
    }
}
