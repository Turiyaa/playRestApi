package controllers;
import java.util.ArrayList;

public class DummyData {
	static ArrayList<Student> list = new ArrayList<Student>();

	public ArrayList<Student> createData(){
		list.add(new Student(0, "John", "Smith", "com sci"));
		list.add(new Student(1, "Mark", "Reed", "Maths"));
		list.add(new Student(2, "David", "Reed", "Sociology"));
		return list;
	}

	public Student getStudentById(int id) {
		for(Student student: list) {
			if(id == student.getId()) {
				return student;
			}
		}
		return null;
	}
}
