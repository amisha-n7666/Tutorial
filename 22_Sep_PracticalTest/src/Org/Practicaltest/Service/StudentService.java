package Org.Practicaltest.Service;
import java.util.TreeSet;

import Org.Practicaltest.Dao.StudentDAO;
import Org.Practicaltest.model.Student;


public class StudentService {
	public static void addStudent(Student student) {
		StudentDAO.addStudent(student);

	}

	public static TreeSet<Student> displayStudent() {
		return StudentDAO.displayStudent();
	}


}
