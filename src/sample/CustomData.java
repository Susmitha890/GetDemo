package sample;

import org.testng.annotations.DataProvider;

public class CustomData {
	
	@DataProvider(name="LoginDataProvider")
	public Object[][] getData() //getData is a method name       
	{
		Object[][] data = {{"abc@gmail.com", "abc"}, {"xyz@gmail.com", "xyz"}, {"def@gmail.com", "def"}, {"hig@gmail.com", "hig"}, {"rstuv@gmail.com", "rstuv"}};
		return data;
	}

}
