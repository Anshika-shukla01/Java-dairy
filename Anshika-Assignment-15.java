import java.util.HashSet;

class Employee {
    private int employeeID;
    private String employeeName;

    // Constructor
    public Employee(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    // Override equals() only
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Employee other = (Employee) obj;
        return this.employeeID == other.employeeID;
    }

    @Override
    public String toString() {
        return "Employee[ID=" + employeeID + ", Name=" + employeeName + "]";
    }
}
public class Main {
    public static void main(String[] args) {
        // Three employees with different IDs
        Employee e1 = new Employee(101, "Alice");
        Employee e2 = new Employee(102, "Bob");
        Employee e3 = new Employee(103, "Charlie");

        HashSet<Employee> employees = new HashSet<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        // Another employee with the same ID as e1
        Employee e4 = new Employee(101, "David");
        employees.add(e4); // <-- should not be added logically, but will be added!

        // Print all employees in HashSet
        System.out.println("Employees in HashSet:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}