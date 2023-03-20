package StudentManagerment;

import java.util.*;

public class StudentManagement {
    public boolean checkTypeStudent(Student student) {
        if (student instanceof RegularStudent) {
            System.out.println("This is regular student: " + student.getName());
            return true;
        }
        System.out.println("This is part time student: " + student.getName());
        return false;
    }
    public int countRegularStudent(Department department){
        int countRegularStudent = 0;
        for(Student student : department.getStudents()){
            if (student instanceof RegularStudent){
                countRegularStudent ++;
            }
        }
        System.out.println("Total regular student is: " + countRegularStudent);
        return countRegularStudent;
    }
        public Map<String, Student> getStudentsWithHighestEntranceScores(Department department) {
            Map<String, Student> result = new HashMap<>();
                double maxEntranceScore = Double.MIN_VALUE;
                Student highestEntranceScoreStudent = null;
                for (Student student : department.getStudents()) {
                    if (student.getEntranceScore() > maxEntranceScore) {
                        maxEntranceScore = student.getEntranceScore();
                        highestEntranceScoreStudent = student;
                    }
                }
                result.put(department.getName(), highestEntranceScoreStudent);
            System.out.println("Highest scoce: " + result);
            return result;
        }

    
        public void getStudentByLocation(List <Student> studentList, String location){
            System.out.println("List of student is part time in:" + location);
            int countStudentByLocation = 0;
            for (Student student : studentList) {
                if (student instanceof RegularStudent) {
                    continue;
                } else if (student instanceof PartTimeStudent
                        && ((PartTimeStudent) student).getTrainingLocation() == location) {
                    student.displayInfo();
                    countStudentByLocation ++;
                }
            }
            if (countStudentByLocation == 0) {
                System.out.println("There are no students in " + location);
            }

        }

        public void sortStudentByYear(List<Student> studentList){
            System.out.println("List student order by year:");
            Collections.sort(studentList, new Comparator<Student>() {
                @Override
                public int compare(Student S1, Student S2) {
                    return S2.getAdmissionYear() - S1.getAdmissionYear();
                }
            });
            studentList.forEach(student -> student.displayInfo());

        }
 
        public void amountStudentByYear(List<Student> studentList){
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            for (int i = 0; i < studentList.size(); i++) {
                map.put(studentList.get(i).getAdmissionYear(), 0);
            }
            studentList.forEach((student) -> {
                map.keySet().forEach((value) -> {
                    if (value == student.getAdmissionYear()) {
                        map.put(student.getAdmissionYear(), map.get(student.getAdmissionYear()) + 1);
                    }
                });
            });
            System.out.println("List amount Student By Year : " + map);
        }
        }




