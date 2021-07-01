package sample;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1 {
	
	@BeforeMethod
	void beforeMethod()
	{
		System.out.println ("This is the before method");
	}
	
	@Test
	void test1()
	{
		System.out.println ("This is Test1");
	}
	
	@Test
	void test2()
	{
		System.out.println ("This is Test2");
	}
	
	@AfterMethod
	void afterMethod()
	{
		System.out.println ("This is the after method");
	}

}
