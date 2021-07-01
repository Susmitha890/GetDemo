package sample;

	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	public class DataProvider2 {
		
		@Test(dataProvider="LoginDataProvider", dataProviderClass=CustomData.class) // dataProvider is a keyword and dataProviderClass is a parameter
		public void loginTest(String email, String pwd) //String email and String pwd are the parameters
		{
			System.out.println (email+"  "+pwd);
		}
		
		
			
}

//When DataProvider method is present on some other class we need to add additional parameter dataProviderClass

