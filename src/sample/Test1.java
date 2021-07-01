package sample;

import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	void setup()
	{
		System.out.println ("Method 1");
	}

	@Test
	void login()
	{
		System.out.println ("Method 2");
	}
	
	@Test
	void teardown()
	{
		System.out.println ("Method 3");
	}
}
