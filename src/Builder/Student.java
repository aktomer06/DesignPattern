package Builder;

import java.security.InvalidParameterException;

public class Student {
    private String name; //name should be at least 5 characters
    private String mobile;// at least 10 digits
    private String email; //length should be at least 8 characters
    private String grade;
    private String address;
    private Integer age;
    private Integer weight;
    private Integer height;
    private String fatherName;
    private Student()
    {
        System.out.println("Calling Student constructor");
    }
    public static StudentBuilder getBuilder()
    {
        return new StudentBuilder();
    }
    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getGrade() {
        return grade;
    }

    public String getAddress() {
        return address;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getWeight() {
        return weight;
    }

    public Integer getHeight() {
        return height;
    }

    public String getFatherName() {
        return fatherName;
    }
//public static StudentBuilder

    public static class StudentBuilder{
        Student student = new Student();
//        public String getName() {
//            return name;
//        }

        public StudentBuilder setName(String name) {
            student.name = name;
            return this;
        }

//        public StudentBuilder getMobile() {
//            return mobile;
//        }

        public StudentBuilder setMobile(String mobile) {
            student.mobile = mobile;
            return this;
        }

//        public String getEmail() {
//            return email;
//        }

        public StudentBuilder setEmail(String email) {
            student.email = email;
            return this;
        }

//        public String getGrade() {
//            return grade;
//        }

        public StudentBuilder setGrade(String grade) {
            student.grade = grade;
            return this;
        }

//        public String getAddress() {
//            return address;
//        }

        public StudentBuilder setAddress(String address) {
            student.address = address;
            return this;
        }

//        public Integer getAge() {
//            return age;
//        }

        public StudentBuilder setAge(Integer age) {
            student.age = age;
            return this;
        }

//        public Integer getWeight() {
//            return weight;
//        }

        public StudentBuilder setWeight(Integer weight) {
            student.weight = weight;
            return this;
        }

//        public Integer getHeight() {
//            return height;
//        }

        public StudentBuilder setHeight(Integer height) {
            student.height = height;
            return this;
        }

//        public String getFatherName() {
//            return fatherName;
//        }

        public StudentBuilder setFatherName(String fatherName) {
            student.fatherName = fatherName;
            return this;
        }
        public Student build()
        {
            if(student.name.length() < 5)
            {
                throw new InvalidParameterException();
            }
            if(student.mobile.length() < 10)
            {
                throw new InvalidParameterException();
            }
            return clone(student);
        }
        private Student clone(Student student)
        {
            Student newStudent = new Student();
            newStudent.name = student.name;
            newStudent.address = student.address;
            newStudent.age = student.age;
            newStudent.email = student.email;
            newStudent.fatherName = student.fatherName;
            newStudent.grade = student.grade;
            return newStudent;
        }
    }
}
