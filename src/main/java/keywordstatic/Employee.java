package keywordstatic;

public class Employee {
    static int employeeId = 2;

    public static int getEmployeeId() {
        return employeeId;
    }

    public static void main(String[] args) {
        System.out.println(getEmployeeId());
        System.out.println(Employee.employeeId);
    }
}
