package QLHS;

import java.util.ArrayList;

class School {
    String className;
    ArrayList<Student> students;
    public School(String className) {
        this.className = className;
        this.students = new ArrayList<Student>();
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public void displayStudents() {
        System.out.println("Class " + className + " students:");
        for (Student student : students) {
            System.out.println("Name: " + student.name + ", Age: " + student.age + ", Hometown: " + student.hometown);
        }
    }
    public void displayStudentsByAge(int age) {
        System.out.println("Class " + className + " students aged " + age + ":");
        for (Student student : students) {
            if (student.age == age) {
                System.out.println("Name: " + student.name + ", Age: " + student.age + ", Hometown: " + student.hometown);
            }
        }
    }
    public void displayStudentsByAgeAndHometown(int age, String hometown) {
        int count = 0;
        for (Student student : students) {
            if (student.age == age && student.hometown.equals(hometown)) {
                count++;
            }
        }
        System.out.println("Number of Class " + className + " students aged " + age + " and from " + hometown + ": " + count);
    }
}