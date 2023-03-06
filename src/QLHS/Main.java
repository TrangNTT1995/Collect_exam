package QLHS;

public class Main {
    public static void main(String[] args) {
        School school = new School("10A");
        // Add students
        school.addStudent(new Student("Nguyen Van A", 20, "Hanoi"));
        school.addStudent(new Student("Tran Thi B", 23, "Da Nang"));
        school.addStudent(new Student("Pham Van C", 20, "Hue"));
        school.addStudent(new Student("Le Thi D", 23, "Da Nang"));
        // Display all students
        school.displayStudents();
        // Display students aged 20
        school.displayStudentsByAge(20);
        // Display number of students aged 23 and from Da Nang
        school.displayStudentsByAgeAndHometown(23, "Da Nang");
    }
}