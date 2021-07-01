package sample;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups= {"sanity"})
	void test1()
	{
		System.out.println ("This is test1");
	}
	
	@Test(groups= {"regression"})
	void test2()
	{
		System.out.println ("This is test2");
	}
	
	@Test(groups= {"regression"})
	void test3()
	{
		System.out.println ("This is test3");
	}
	
	@Test(groups= {"regression"})
	void test4()
	{
		System.out.println ("This is test4");
	}
	
	@Test(groups= {"sanity", "regression"})
	void test5()
	{
		System.out.println ("This is test5");
	}

}

//(groups= {"regression"})
//(groups= {"sanity", "regression"})


// <run>
//<include name = "sanity"/>
//<include name = "regression"/>
//</run>


//<run>
//<exclude name = "sanity"/>
//</run>

//<run>
//<include name = "regression"/>
//<exclude name = "sanity"/>
//</run>
