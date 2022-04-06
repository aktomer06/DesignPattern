package Builder;

public class Client {
    public static void main(String[] args) {
        Student student = Student.getBuilder()
                .setAge(25)
                .setName("Avdhesh")
                .setEmail("avdhesh@gmail.com")
                .setFatherName("Ombir")
                .setMobile("1234567890")
                .build();

        System.out.println(student.getWeight());

        Employee employee = Employee.getEmployeeBuilder()
                .setName("Avdhesh")
                .setPhoneNumber("9875123456")
                .setHomeAddress("A123, Delhi")
                .setOfficeName("Intel")
                .build();
        Employee employee1 = Employee.getEmployeeBuilder()
                .setName("Tomer")
                .setPhoneNumber("9875123456")
                .setHomeAddress("A123, Delhi")
                .setOfficeName("Intel")
                .build();
        System.out.println(employee.getName());
        System.out.println(employee1.getName());
        System.out.println(employee.getName());

        Employee.EmployeeBuilder b = Employee.getEmployeeBuilder().setName("AVDDDD");
        Employee emp = b.build();
        b.setName("tomer");

    }
}
