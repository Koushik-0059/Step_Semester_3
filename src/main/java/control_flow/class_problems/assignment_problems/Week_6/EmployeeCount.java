package control_flow.class_problems.assignment_problems.Week_6;

class Employee {

    String empName;
    double salary;

    static String companyName =
        "Bright Horizon Technologies";

    static int employeeCount = 0;

    Employee(String name, double salary) {

        empName = name;
        this.salary = salary;

        employeeCount++;
    }

    static void printCompanyInfo() {

        System.out.println(companyName);
        System.out.println(
            "Employees on record: " + employeeCount
        );
    }
}

public class EmployeeCount {

    public static void main(String[] args) {

        Employee e1 =
            new Employee("Ravi", 50000);

        Employee e2 =
            new Employee("Priya", 60000);

        Employee e3 =
            new Employee("Arjun", 55000);

        Employee.printCompanyInfo();
    }
}