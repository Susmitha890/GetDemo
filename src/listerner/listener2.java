package listerner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

public class listener2 implements ITestListener
{
	public void onStart (ITestContext arg)
	{
		System.out.println("Starts Test Execution......" +arg.getName());
	}
	
	public void onFinish (ITestContext arg)
	{
		System.out.println("Finish Test Execution......" +arg.getName());
	}
	
	public void onTestStart (ITestContext arg0)
	{
		System.out.println("Starts test......" +arg0.getName());
	}
	
	public void onTestSkipped (ITestContext arg0)
	{
		System.out.println("Skipped Test......" +arg0.getName());
	}
	public void onTestSuccess (ITestContext arg0)
	{
		System.out.println("Passed Test......" +arg0.getName());
	}
	public void onTestFailure (ITestContext arg0)
	{
		System.out.println("Failed Test......" +arg0.getName());
	}
	
	//Not so very much important
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0)
	{
		
	}
	
}
