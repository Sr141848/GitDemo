import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testng3 {
	
	@Parameters({"URL","APIkey/Username"})
	@Test
	public void Logincarloan(String urlname, String key)
	{
		System.out.println("mobilelogin");//Appium
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@Test(enabled=false)
	public void Login1carloan()
	{
		System.out.println("weblogin");//selenium
	}
	
	@Test(groups= {"smoke"})
	public void Login2carloan()
	{
		System.out.println("Applicationlogin");//restAPi
	}
	@Test(dataProvider="getData")
	public void carloan3(String username, String password)
	{
		System.out.println("API login");
		System.out.println(username);
		System.out.println(password);
	}
	@Test(dependsOnMethods= {"mobilelogout"})
	public void mobileLogin()
	{
		System.out.println("Mobile login successfull");
	}
	
	@Test(timeOut=4000)
	public void mobilelogout()
	{
		System.out.println("Mobile logout Successfull");
	}
	@DataProvider
	public Object[][] getData()
	{
		//1st combination username password - good credit history
		//2nd username password - no credit history
		//3rd fraudlent credit history
		//1st set
		Object[][] data = new Object[3][2];
		data[0][0]="firstsetusername";
		data[0][1]="firstpassword";
		//coloumns in the row are nothing but values for that particular combination(row)
		//2nd set
		data[1][0]="secondusername";
		data[1][1]="secondpassword";
		//3rd set
		data[2][0]="thridusername";
		data[2][1]="thirdpassword";
		return data;
		
		
		
		
		
		
		
		
		
		
	}
	
}
