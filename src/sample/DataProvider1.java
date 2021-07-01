package sample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	
	@Test(dataProvider="LoginDataProvider") // dataProvider is a keyword
	public void loginTest(String email, String pwd) //String email and String pwd are the parameters
	{
		System.out.println (email+"  "+pwd);
	}
	
	@DataProvider(name="LoginDataProvider")
	public Object[][] getData() //getData is a method name       
	{
		Object[][] data = {{"abc@gmail.com", "abc"}, {"xyz@gmail.com", "xyz"}, {"def@gmail.com", "def"}};
		return data;
		
	}

}
