package Factory.Employee;

public class EmployeeFactory {
    private static EmployeeFactory employeeFactory = new EmployeeFactory();
    private EmployeeFactory()
    {
        System.out.println("Employee Factory is created");
    }
    public static EmployeeFactory getInstance()
    {
        return employeeFactory;
    }
    public Employee createEmployeeBasedonConfiguration(EmployeeType config){
        switch(config)
        {
            case FULL_TIME -> {
                return new FullTimeEmployee();
            }
            case PART_TIME -> {
                return new PartTimeEmployee();
            }
        }
        return null;
    }
}
