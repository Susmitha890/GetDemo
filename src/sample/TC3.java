package sample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TC3 {
	@BeforeClass
	void beforeClass()
	{ System.out.println ("This is the before class"); }
	
	@BeforeMethod
	void beforeMethod()
	{ System.out.println ("This is the before method");}
	
	@AfterMethod
	void afterMethod()
	{ System.out.println ("This is the after method");}
	
	@AfterClass
	void afterClass()
	{ System.out.println ("This is the after class");}
	
	@Test
	void test3()
	{ System.out.println ("This is Test3");}
	
	@Test
	void test4()
	{ System.out.println ("This is Test4");}
	
	@BeforeSuite
	void beforeSuite()
	{ System.out.println ("This is before the suite");}
	
	@AfterSuite
	void afterSuite()
	{ System.out.println ("This is after the suite");}
	
	
}


