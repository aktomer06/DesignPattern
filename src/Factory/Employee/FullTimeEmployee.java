package Factory.Employee;

public class FullTimeEmployee extends Employee{
    public FullTimeEmployee(){
        System.out.println("Full time employee is created");
    }
    @Override
    public void registerEmployee(Employee employee) {
        System.out.println("Full time Employee is registered");
    }
}
