package com.cisc181.core;

import java.util.ArrayList;
import java.util.Date;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.Date;

public class Student_Test extends Course {
	public static void main(String[] args) {
		ArrayList<Course> list = new ArrayList<Course>();
		Course record1 = new Course(755123, "Chemistry", 97);
		list.add(record1);
		Course record2 = new Course(677342, "Computer Science", 43);
		list.add(record2);
		Course record3 = new Course(344567, "History", 87);
		list.addAll(record3);
	}
}

public class Student_Test extends Semester {
	public static void main(String[] args) {
		ArrayList<Semester> list = new ArrayList<Semester>();
		Semester fall = new Semester(998876, 2013 - 9 - 1, 2013 - 12 - 15);
		list.add(fall);
		Semester spring = new Semester(77665544, 2014 - 1 - 25, 2014 - 5 - 30);
		list.addAll(spring);

	}
}

public class Student_Test extends Section {
	public static void main(String[] args) {
		ArrayList<Section> list = new ArrayList<Section>();
		Section section1 = new Section(755123, 998876, 0987567, 5);
		list.add(section1);
		Section section2 = new Section(677342, 998876, 0987567, 5);
		list.add(section2);
		Section section3 = new Section(344567, 998876, 0987567, 5);
		list.add(section3);
		Section section4 = new Section(755123, 77665544, 345654, 12);
		list.add(section4);
		Section section5 = new Section(677342, 77665544, 345654, 12);
		list.add(section5);
		Section section6 = new Section(344567, 77665544, 345654, 12);
		list.add(section6);
	}
}

public class Student_Test extends Student {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		Student student1 = new Student("Jamie", "Lynn", "McKeon", 1995 - 5 - 18, "Actuarial Science",
				"452 Manhattan Street", "7187556124", "jamiemck@udel.edu");
		list.add(student1);
		Student student2 = new Student("Dana", "Lynn", "McMahon", 1996 - 8 - 12, "History", "56 Love Street",
				"2345556788", "danalynn@gmail.com");
		list.add(student2);
		Student student3 = new Student("Bob", "Billy", "Marley", 1994 - 9 - 8, "Agriculture", "42 Prospect Street",
				"9887665432", "bobmarley@gmail.com");
		list.add(student3);
		Student student4 = new Student("Nicole", "Marie", "Smith", 1992 - 4 - 10, "Math", "1 Scholar Road",
				"4445667002", "nsmith@gmail.com");
		list.add(student4);
		Student student5 = new Student("Nicholas", "William", "Cage", 1993 - 10 - 8, "Health", "66 Main Street",
				"8776544567", "ncage@aol.com");
		list.add(student5);
		Student student6 = new Student("Alex", "Nicole", "White", 1990 - 7 - 10, "Sports Management",
				"7 South College Avenue", "9987678899", "anwhite@udel.edu");
		list.add(student6);
		Student student7 = new Student("Will", "Joseph", "Black", 1992 - 4 - 8, "Biology", "88 Main Street",
				"9678557658", "black@udel.edu");
		list.add(student7);
		Student student8 = new Student("Brooke", "Lynn", "Whiteside", 1990 - 9 - 11, "Education", "99 Jacob Street",
				"8876657789", "bkwhiteside@aol.com");
		list.add(student8);
		Student student9 = new Student("Joseph", "Robert", "McKeon", 1997 - 11 - 12, "Accounting",
				"45 North Chapel Street", "7187665432", "joemckeon@udel.edu");
		list.add(student9);
		Student student10 = new Student("Hailey", "Brigitte", "McNeil", 1993 - 7 - 11, "Chemistry", "11 Spruce Lane",
				"9678856578", "bmcneil@aol.com");
		list.add(student10);
	}

}

	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
