package Org.Practicaltest.View;
import java.util.Scanner;
import java.util.TreeSet;

import Org.Practicaltest.model.Student;
import Org.Practicaltest.Service.StudentService;

public class StudentView {
	static Scanner sc = new Scanner(System.in);
	  public static boolean addStudent() {
		  System.out.println("Enter the number of students you have to add");
		  int x = sc.nextInt();
		  for(int i=0; i<x; i++) {
		  System.out.println("Enter Student Name : ");
		  String name = sc.next();
		  System.out.println("Enter Student ID : ");
		  int id = sc.nextInt();

		  Student student = new Student(name, id);

		  StudentService.addStudent(student);
		  }

		  return true;
	}
	  public static TreeSet<Student> displayStudent() {
		  return StudentService.displayStudent();
	  }

}
