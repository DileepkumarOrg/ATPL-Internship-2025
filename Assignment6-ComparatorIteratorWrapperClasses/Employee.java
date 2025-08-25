import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employee {
    String name;
    int EmployeeId;
    int Salary;

    Employee(String name, int EmployeeId, int Salary){
        this.name = name;
        this.EmployeeId = EmployeeId;
        this.Salary = Salary;
    }
    public static void main(String[] args) {
        List<Employee> employeeeList = new ArrayList<>();
        employeeeList.add(new Employee("Dileep", 1, 45000));
        employeeeList.add(new Employee("Naveen", 2, 50000));
        employeeeList.add(new Employee("Heamnth", 3, 20000));
        employeeeList.add(new Employee("Mahesh", 4, 50000));
        Iterator<Employee> employee = employeeeList.iterator();
        while (employee.hasNext()) {
            Employee emp = employee.next();
            if (emp.Salary > 30000) {
                System.out.printf("%-10s %-3d %d",emp.name, emp.EmployeeId, emp.Salary);
                System.out.println();
            } 
        }
    }
}
