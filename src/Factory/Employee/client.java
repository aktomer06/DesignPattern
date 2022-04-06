package Factory.Employee;

public class client {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getInstance().createEmployeeBasedonConfiguration(EmployeeType.FULL_TIME);

        Employee employee1 = EmployeeFactory.getInstance().createEmployeeBasedonConfiguration(EmployeeType.PART_TIME);
    }
}
