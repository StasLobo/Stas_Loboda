package com.loboda.usermanagement;

import java.util.Calendar;
import java.util.Date;

import junit.framework.TestCase;


public class UserTest extends TestCase {

	private User user;
	private Date dateOfBirth;
	
	protected void setUp() throws Exception {
		super.setUp();
		user = new User();
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(1998, Calendar.MAY, 26);
		dateOfBirth = calendar.getTime(); 
	}

	
	public void testGetFullName() {
		user.setFirstName("Stas");
		user.setLastName("Loboda");
		assertEquals("Loboda, Stas", user.getFullName());
	}
	
	public void testGetAge() {
		user.setDateOfBirth(dateOfBirth);
		assertEquals(2017 - 1998, user.getAge());
	}
}

