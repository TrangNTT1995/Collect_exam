package StudentManagerment;

public class AcademicResult {
    private String semesterName;
    private double gpa;

    public AcademicResult(String semesterName, double gpa) {
        this.semesterName = semesterName;
        this.gpa = gpa;
    }

    public String getSemesterName() {
        return semesterName;
    }

    public double getGpa() {
        return gpa;
    }

}
