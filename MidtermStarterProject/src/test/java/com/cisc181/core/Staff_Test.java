package com.cisc181.core;

import java.util.ArrayList;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test extends Staff {
	public static void main(String[] args) {
		ArrayList<Staff> list = new ArrayList<Staff>();
		Staff test1 = new Staff("Jamie", "Lynn", "McKeon", 1990 - 18 - 05, "452 Manhattan Street", "7186666123",
				"jamiemckeon@udel.edu", "MWF 2-4", 3, 100, 000, 2012 - 01 - 09, "Math Professor");
		list.add(test1);
		Staff test2 = new Staff("Scott", "Robert", "White", 1960 - 05 - 11, "50 North Street", "9876543211",
				"scottrob@aol.com", "Tuesday 3-6", 10, 120, 000, 1990 - 01 - 09, "Chemistry Professor");
		list.add(test2);
		Staff test3 = new Staff("Hannah", "Jessica", "Smith", 1950 - 06 - 10, "33 Rose Lane", "9987563455",
				"hanjess@gmail.com", "Monday 4-7", 2, 170, 000, 1985 - 01 - 09, "Finance Professor");
		list.add(test3);

		// invalid phone number
		Staff test4 = new Staff("Bruce", "Jeffrey", "Smith", 1945 - 11 - 04, "5 Spring Street", "90887655283",
				"brucesmith@aol.com", "MWF 5-7", 23, 90, 000, 1980 - 01 - 09, "Art Professor");
		list.add(test4);

		// invalid DOB
		Staff test5 = new Staff("Hillary", "Marie", "Hanes", 1982 - 13 - 13, "68 Lovett Street", "9665554321",
				"hhanes@udel.edu", "Fri 12-2", 1, 250, 000, 2004 - 01 - 09, "Biology Professor");
		list.addAll(test5);
	}
/*
	@Test
	public void Theaveragesalary() {
		MyUnit myUnit = new MyUnit();
		int expectedAnswer = 146,000;
		int receivedAnswer = myUnit.getTheaveragesalary();
		assertArrayEquals(expectedanswer, receivedAnswer);
				
		fail("Not the correct salary");
	}

}*/
