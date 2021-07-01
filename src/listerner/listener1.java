package listerner;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listerner.listener2.class)
public class listener1 {
	
	@Test
	void test1()
	{
		System.out.println("This is test1");
		Assert.assertEquals("A", "A");
	}
	
	@Test
	void test2()
	{
		System.out.println("This is test2");
		Assert.assertEquals("A", "B");
	}
	
	void test3()
	{
		System.out.println("This is test3");
		throw new SkipException("This is skip exception");
	}
	

}
