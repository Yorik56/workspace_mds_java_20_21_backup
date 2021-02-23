package fr.mds.inheritence.model;

public class CollegeStudent extends Student {
	private String major;
	private int year;
	
	public CollegeStudent(){
		super();
	}
	
	public CollegeStudent(String name, int age, String gender, String studentid, double gradePointAverage, int year,String major ) {
		super(name, age, gender, studentid, gradePointAverage);
		this.major = major;
		this.year = year;
	}

	public CollegeStudent(String major, int year, String studentid, double gradePointAverage) {
		super(studentid, gradePointAverage);
		this.major = major;
		this.year = year;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "CollegeStudent [major=" + major + ", year=" + year + " "+ super.toString() +  "]";
	}
	
	
}
