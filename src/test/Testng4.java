package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testng4 {

	@Parameters({"URL"})
	@Test
	public void personalloan(String uname)
	{
		System.out.println("applied for personal loan");
		System.out.println(uname);
	}
	@Test
	public void PL1()
	{
		System.out.println("personal loan is success");
	}
	@Test
	public void PL2()
	{
		System.out.println("personal loan payment fulfilled");
	}
}
