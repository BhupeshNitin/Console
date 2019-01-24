package ActiveScaler.Application_Pages;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


import ActiveScaler.Locator.Login_Locator;

public class login implements Login_Locator
{	 
	
	WebDriver driver;
	Properties ps;
	public login(WebDriver driver, Properties ps)
	{
		this.driver=driver;
		this.ps=ps;
	}
	public void Google_Login(String username, String password)throws Exception
	{
		driver.findElement(By.xpath(loc_SignInHomePage)).click();
		driver.findElement(By.xpath(loc_GoogleButton)).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).sendKeys(username,Keys.ENTER);
		Thread.sleep(20);
		 driver.findElement(By.name("password")).sendKeys(password,Keys.ENTER);
		 Thread.sleep(30);
			
	}
	
	public void existing_account(String username,String email)
	{
		driver.findElement(By.xpath(loc_SignInHomePage)).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(loc_Email)).sendKeys(username);
		driver.findElement(By.xpath(loc_Password)).sendKeys(email);
		driver.findElement(By.xpath(loc_SignIN)).click();
	}
	
}
