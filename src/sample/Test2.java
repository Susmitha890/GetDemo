package sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
	@Test (priority=1)
	void setup()
	{
		System.out.println ("Opening browser");
	}

	@Test (priority=3)
	void SearchCustomer()
	{
		System.out.println ("Search Customer Test");
	}
	
	@Test (priority=2)
	void addCustomer()
	{
		System.out.println ("Add Customer Test");
		Assert.assertEquals(1, 2);
	}
	
	@Test (priority=4)
	void teardown()
	{
		System.out.println ("Closing browser");
	}
}



