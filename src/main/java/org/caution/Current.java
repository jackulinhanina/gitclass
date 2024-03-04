package org.caution;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Current {

	@Test
	private void tc1() {
		System.out.println("test case1");
	}
	@BeforeMethod
	private void startdate() {
		System.out.println("test case starting date and time");

	}

	@Test
	private void tc4() {
		System.out.println("test case4");
	}

	@Test
	private void tc2() {
		System.out.println("test case2");
	}
	@AfterMethod
	private void enddate() {
	System.out.println("test case end date");

	}

	@Test
	private void tc6() {
		System.out.println("test case6");
	}




@BeforeClass

private void launchTheUrl() 
{
	System.out.println("launch browser");
}
@AfterClass
private void CloseTheBroeswer()
{
	System.out.println("Browser close");
}
}






