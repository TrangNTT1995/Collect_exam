package StudentManagerment;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Student {
    private int studentCode;
    private String name;
    private DateTimeFormatter birthday;
    private int admissionYear;
    private double entranceScore;
    private List<AcademicResult> academicResults;

    public Student(int studentCode, String name, DateTimeFormatter birthday, int admissionYear, double entranceScore, List<AcademicResult> academicResult) {
        this.studentCode = studentCode;
        this.name = name;
        this.birthday = birthday;
        this.admissionYear = admissionYear;
        this.entranceScore = entranceScore;
        this.academicResults = academicResult;

    }


    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DateTimeFormatter getBirthday() {
        return birthday;
    }

    public void setBirthday(DateTimeFormatter birthday) {
        this.birthday = birthday;
    }

    public int getAdmissionYear() {
        return admissionYear;
    }

    public void setAdmissionYear(int admissionYear) {
        this.admissionYear = admissionYear;
    }

    public double getEntranceScore() {
        return entranceScore;
    }

    public void setEntranceScore(double entranceScore) {
        this.entranceScore = entranceScore;
    }

    public void displayInfo() {
        System.out.println("Student info:");
        System.out.println("Student Code:" + studentCode);
        System.out.println("Full name:" + name);
        System.out.println("Entrance year:" + admissionYear);
        System.out.println("Entrance score:" + entranceScore);
    }

    public double getAverageScore() {
        int numSemesterName = 0;
        double totalGPA = 0;
        for (AcademicResult academicResult : academicResults) {
            totalGPA += academicResult.getGpa();
            numSemesterName++;
        }
        System.out.println("This is average score: " + totalGPA/numSemesterName);
        return totalGPA/numSemesterName;
    }
}
