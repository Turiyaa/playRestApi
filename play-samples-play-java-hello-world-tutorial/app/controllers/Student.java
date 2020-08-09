package controllers;

public class Student {
	private int id;
	private String firstName;
	private String lastName;
	private String major;

	public Student() {

	}
	public Student(int studentId, String fn, String ln, String m) {
		this.id = studentId;
		this.firstName = fn;
		this.lastName = ln;
		this.major = m;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

}
