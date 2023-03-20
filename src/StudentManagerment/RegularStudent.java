package StudentManagerment;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class RegularStudent extends Student {


    public RegularStudent(int studentCode, String name, DateTimeFormatter birthday, int admissionYear, double entranceScore, List<AcademicResult> academicResult) {
        super(studentCode, name, birthday, admissionYear, entranceScore, academicResult);
    }


}

