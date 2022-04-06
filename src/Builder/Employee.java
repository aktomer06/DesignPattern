package Builder;

import java.security.InvalidParameterException;

public class Employee {
    private String name;
    private String phoneNumber;
    private String homeAddress;
    private String officeName;
    public static EmployeeBuilder getEmployeeBuilder(){
        return new EmployeeBuilder();
    }
    private Employee()
    {
        System.out.println("Calling Employee constructor");
    }
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public String getOfficeName() {
        return officeName;
    }

    public static class EmployeeBuilder{
        private Employee employee = new Employee();

        public EmployeeBuilder setName(String name)
        {
            employee.name = name;
            return this;
        }
        public EmployeeBuilder setPhoneNumber(String phoneNumber)
        {
            employee.phoneNumber = phoneNumber;
            return this;
        }
        public EmployeeBuilder setHomeAddress(String homeAddress)
        {
            employee.homeAddress = homeAddress;
            return this;
        }
        public EmployeeBuilder setOfficeName(String officeName)
        {
            employee.officeName = officeName;
            return this;
        }
        public Employee build(){
            if(employee.name.length() < 5)
            {
                throw new InvalidParameterException();
            }
            if(employee.phoneNumber.length() < 10)
            {
                throw new InvalidParameterException();
            }
            return employee;
        }
    }
}
