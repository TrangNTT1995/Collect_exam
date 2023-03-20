package StudentManagerment;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class PartTimeStudent extends Student {
    private String trainingLocation;

    public PartTimeStudent(int studentCode, String name, DateTimeFormatter birthday, int admissionYear, double entranceScore, String trainingLocation, List<AcademicResult> academicResult) {
        super(studentCode, name, birthday, admissionYear, entranceScore, academicResult);
        this.trainingLocation = trainingLocation;
    }

    public String getTrainingLocation() {
        return trainingLocation;
    }

    public void setTrainingLocation(String trainingLocation) {
        this.trainingLocation = trainingLocation;
    }



}
