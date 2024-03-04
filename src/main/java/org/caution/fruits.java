package org.caution;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Ignore;

public class fruits {
	@Test
	public void Orange() {
		System.out.println("Test Case 1");
	}

	@Test
	public void Onion() {
		System.out.println("Test Case3");
	}

	@Before
	public void date() {
		System.out.println("Execute the Date");
	}

	@After
	public void Busineslogic() {
		System.out.println("Execute the logic");
	}

	@BeforeClass
	public static void launchbrowser() {
		System.out.println("launch Browser");
	}

	
	@Test
	public void Banana() {
		System.out.println("Test case2");
	}
	@AfterClass
	public static void endlaunch() {
		System.out.println("End launch");
	}
@Ignore
	@Test
	public void Tragen() {
		System.out.println("teat case 4");
	}

}
