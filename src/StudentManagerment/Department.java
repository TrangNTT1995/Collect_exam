package StudentManagerment;

import java.util.List;
import java.util.Map;

public class Department {
    private String name;
    private List<Student> students;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
//    public void addRegularStudent(RegularStudent student1){
//        students.add(student1);
//    }
//    public void addPartTimeStudent(PartTimeStudent student2) {
//    	students.add(student2);
//    }
    
    public void addStudent(Student std) {
    	students.add(std);
    }
	public Department(String name, List<Student> students) {
		super();
		this.name = name;
		this.students = students;
	}

    }

