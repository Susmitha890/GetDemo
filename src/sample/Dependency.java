package sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency {
	
	@Test
	void startCar()
	{
		System.out.println ("Car Started");
		Assert.fail();
	}
	
	@Test(dependsOnMethods = {"startCar"})
	void driveCar()
	{
		System.out.println ("Car Driving");
	}
	
	@Test(dependsOnMethods = {"driveCar"})
	void stopCar()
	{
		System.out.println ("Car Stopped");
	}
	
	@Test(dependsOnMethods = { "driveCar","stopCar" }, alwaysRun=true)
	void parkCar()
	{
		System.out.println ("Car Parked");
	}

}

//alwaysRun method is used even when the dependency method fails
//alwaysRun=true
//dependsOnMethods = {"driveCar"}
//Assert.fail();
