package StudentManagerment;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    	// add data
        ArrayList<Student> students = new ArrayList<Student>();
         List<AcademicResult> resultListBao = new ArrayList<AcademicResult>();
		 List<AcademicResult> resultListTrang = new ArrayList<AcademicResult>();
		 List<AcademicResult> resultListYen = new ArrayList<AcademicResult>();
		 List<AcademicResult> resultListHTrang = new ArrayList<AcademicResult>();
		 resultListTrang.add(new AcademicResult("Năm 1",9.0));
		 resultListTrang.add(new AcademicResult("Năm 2",7.5));
		 resultListBao.add(new AcademicResult("Năm 1",7.5));
		 resultListBao.add(new AcademicResult("Năm 2",6.0));
		 resultListYen.add(new AcademicResult("Năm 1", 6.7));
		 resultListYen.add(new AcademicResult("Năm 2", 5.0));
		 resultListHTrang.add(new AcademicResult("Năm 1", 7.1));
		 resultListHTrang.add(new AcademicResult("Năm 2", 6.8));
		 
        RegularStudent regularStudent1 = new RegularStudent(01, "Trần Hoàng Bão", DateTimeFormatter.ofPattern("02/09/1997"), 2015, 27.5,resultListBao);
        students.add(regularStudent1);
        RegularStudent regularStudent2 = new RegularStudent(02, "Nguyễn Thanh Trang", DateTimeFormatter.ofPattern("19/09/1995"), 2017, 21.5, resultListTrang);
        students.add(regularStudent2);
        PartTimeStudent partTimeStudent1 = new PartTimeStudent(03, "Võ Phi Yến", DateTimeFormatter.ofPattern("20/12/1997"), 2015, 18.5, "Thăng Bình",resultListYen);
       students.add(partTimeStudent1);
       PartTimeStudent partTimeStudent2 = new PartTimeStudent(04, "Võ Hà Trang", DateTimeFormatter.ofPattern("01/01/1994"), 2013, 15.7, "Quy Nhơn", resultListHTrang);
       students.add(partTimeStudent2);
        StudentManagement studentManagement = new StudentManagement();
        
        Department departmentTechnology = new Department("Department Technology",students);
        
        //check type of student
       studentManagement.checkTypeStudent(regularStudent1);
       studentManagement.checkTypeStudent(partTimeStudent1);
       //Average score of student
       regularStudent1.getAverageScore();
       partTimeStudent2.getAverageScore();
       //COUNT sinh viên chính quy của khoa
       studentManagement.countRegularStudent(departmentTechnology);
       // Tìm sinh viên bằng Location
        studentManagement.getStudentByLocation(students, "Quảng Nam");
        // Tìm sinh viên có điểm cao nhất 
        studentManagement.getStudentsWithHighestEntranceScores(departmentTechnology);
        //Sort sinh viên
        studentManagement.sortStudentByYear(students);
        //Tính tổng học sinh theo year
        studentManagement.amountStudentByYear(students);


    }
}