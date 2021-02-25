package uni.pu.fmi.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import uni.pu.fmi.Student;

public class InsertService {

	 public static String insert(String subject, String name, String grade) {

		 
		 List<Student> students = getStudents();
		 
		 if(name == null) {
			 return "Моля, въведете име на ученик!";
		 }
		 
		 if(grade == null) {
			 return "Моля, въведете оценка!";
		 }
		 
		 int wrongGrade = Integer.parseInt(grade);
		 
		 if(wrongGrade < 2 || wrongGrade > 6) {
			 return "Моля, въведете оценка от 2 до 6!";
		 }
		 
		 if(subject == null) {
			 return "Моля, въведете предмет!";
		 }
		 
		 
		boolean studentExists = students.stream().anyMatch(student->(student.getName().equals(name)));
		return studentExists? "Успешно добавихте оценката!":"Невалидни данни!";
	}
	 
	 public static List<Student> getStudents(){
		 Student student = new Student();
		 student.setName("Maria");
		 ArrayList<Student> students = new  ArrayList<Student> ();
		 students.add(student);
		 return students; 
	 }

}
