package Builder;

public class Client {
    public static void main(String[] args) {
        Student student = Student.getBuilder()
                .setAge(25)
                .setName("Simon")
                .setEmail("motu@gmail.com")
                .setFatherName("ABC")
                .setMobile("1234567890")
                .build();

        System.out.println(student.getWeight());

        Employee employee = Employee.getEmployeeBuilder()
                .setName("Harry")
                .setPhoneNumber("9875123456")
                .setHomeAddress("A123, Delhi")
                .setOfficeName("ABC")
                .build();
        Employee employee1 = Employee.getEmployeeBuilder()
                .setName("XYZZZ")
                .setPhoneNumber("9875123456")
                .setHomeAddress("A123, Delhi")
                .setOfficeName("ABC")
                .build();
        System.out.println(employee.getName());
        System.out.println(employee1.getName());
        System.out.println(employee.getName());

//        Employee.EmployeeBuilder b = Employee.getEmployeeBuilder().setName("ABCDEF");
//        Employee emp = b.build();
//        b.setName("Raj");

        StudentNew studentNew = StudentNew.getStudentBuilder()
                .setAge(20)
                .setFirstName("Joy")
                .setLastName("Mark")
                .setEmailAddress("abc@xyz")
                .build();
        System.out.println(studentNew.getFirstName());

        StudentNew studentNew1 = StudentNew.getStudentBuilder()
                .setFirstName("Harry")
                .build();
        System.out.println("Email " + studentNew1.getEmailAddress());
        System.out.println("First name of student2 " + studentNew1.getFirstName());

        System.out.println("First name of student1 " + studentNew.getFirstName());

        StudentNew.StudentBuilder studentBuilder = StudentNew.getStudentBuilder();

        StudentNew studentNew2 = studentBuilder
        .setFirstName("Harry")
                .setLastName("Tom")
                .build();
        System.out.println(studentNew2.getFirstName());

        StudentNew studentNew3 = studentBuilder
                .build();
        System.out.println(studentNew3.getFirstName());

    }
}
