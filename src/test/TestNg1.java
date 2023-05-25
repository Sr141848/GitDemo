package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg1 {
	
	
	
	@Test(groups= {"smoke"})
	public void Demo()
	{
		System.out.println("hello world");
	}
	
	@Test
	public void Demo1()
	{
		System.out.println("hi");
	}
	@Test
	public void Demo2()
	{
		System.out.println("System is running fast");
		Assert.assertTrue(false);
	}
	
}

