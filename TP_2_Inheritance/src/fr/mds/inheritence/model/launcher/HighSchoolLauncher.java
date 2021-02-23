package fr.mds.inheritence.model.launcher;

import fr.mds.inheritence.model.CollegeStudent;
import fr.mds.inheritence.model.Person;
import fr.mds.inheritence.model.Student;
import fr.mds.inheritence.model.Teacher;

public class HighSchoolLauncher {
	public static void main(String[] args) {
		Person myPerson = new Person("Coach John", 27, "M");
		System.out.println(myPerson);
		
		Student myStudent = new Student("Lynn Brooke", 16, "F", "HS17864", 3.5);
		System.out.println(myStudent);
		
		Teacher myTeacher = new Teacher("Chuck Norris", 34, "M", "Computeur Science", 50000);
		System.out.println(myTeacher);
		
		CollegeStudent myCollegeStudent = new CollegeStudent("Franklin Jr", 18, "F", "UCB486", 4.0, 1, "English");
		System.out.println(myCollegeStudent);
		
	}
}
