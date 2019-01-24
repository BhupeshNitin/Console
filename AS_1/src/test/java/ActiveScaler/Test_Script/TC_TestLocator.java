package ActiveScaler.Test_Script;

import org.testng.Assert;
import org.testng.annotations.Test;
import ActiveScaler.Base_Scenario.BaseClass;


public class TC_TestLocator extends BaseClass 

{
	@Test(priority=1)
	public void login() 
	{	
	//	ln.existing_account(ps.getProperty("Username"), ps.getProperty("Password"));
		try {
			ln.Google_Login(ps.getProperty("Username"), ps.getProperty("Password"));
		} 
		catch (Exception e) 
		{
		  System.out.println(e);
		}
	}
	@Test(priority=2)
	public void Driver_Creat() throws Throwable
	{	
	tagsi_driver.driver_page_verification();
	Thread.sleep(300);
	}

}
