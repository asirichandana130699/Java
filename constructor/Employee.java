package constructor;

public class Employee extends Organization{

    String employeeName;
    public Employee(String employeeName) {
        super("CIS");
        this.employeeName = employeeName;
    }

    public Employee(String employeeName, String organizationName) {
        super(organizationName);
        this.employeeName = employeeName;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Siri Chandana");
        System.out.println(employee.organizationName + ", " + employee.employeeName);
        employee = new Employee("Siri Chandana", "CIS Tech");
        System.out.println(employee.organizationName + ", " + employee.employeeName);
    }
}
