import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg2 {
	@BeforeClass
public void BfClass()
{
	System.out.println("Before executing any methods in the class");
}

	@Test
	public void Shopping()
	{
		System.out.println("Western wear");
	}
	@BeforeMethod
	public void bfTest()
	{
		System.out.println("i will execute before every test method in testng2 class");
	}
	@AfterMethod
	public void AfTest()
	{
		System.out.println("i will execute after every test method in testng2 class");
	}
	@AfterTest
	public void Lastexecution()
	{
		System.out.println("I will execute last");
	}
	@BeforeTest
	public void Prerequesite()
	{
		System.out.println("I will execute first");
	}
	@BeforeSuite
	public void Bfsuite()
	{
		System.out.println("I am the first");
	}
	@AfterSuite
	public void Atsuite()
	{
		System.out.println("i am the 1st from last");
	}
	@AfterClass
	public void AfClass()
	{
		System.out.println("After Executing all methods in the class");
	}
	@Test(groups= {"smoke"})
	public void MobileSignin()
	{
		System.out.println("mobile signed in success");
	}
	@Test
	public void MobileSIgnout()
	{
		System.out.println("mobile signed out success");
	}
}
