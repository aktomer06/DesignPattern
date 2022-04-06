package Factory.Employee;

public class PartTimeEmployee extends Employee{
    PartTimeEmployee(){
        System.out.println("Part time employee is created");
    }
    @Override
    public void registerEmployee(Employee employee) {
        System.out.println("Part time employee is registered");
    }
}
