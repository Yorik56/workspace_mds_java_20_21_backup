package fr.mds.inheritence.model;

public class Student extends Person {
	 protected String studentid;
	 protected double gradePointAverage;
	 
	 
	 public Student() {
		 super();
	 }
	 

	public Student(String name, int age, String gender, String studentid, double gradePointAverage) {
		super(name, age, gender);
		this.studentid = studentid;
		this.gradePointAverage = gradePointAverage;
	}
	
	public Student( String studentid, double gradePointAverage) {
		super();
		this.studentid = studentid;
		this.gradePointAverage = gradePointAverage;
	}
	



	public String getStudentid() {
		return studentid;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}

	public double getGradePointAverage() {
		return gradePointAverage;
	}

	public void setGradePointAverage(double gradePointAverage) {
		this.gradePointAverage = gradePointAverage;
	}
	 
	public String toString() {
		return "name: " + name + " age: " + age + " studentid: " + studentid + " gradePointAverage: " + gradePointAverage;
	}
	 
	 
}
