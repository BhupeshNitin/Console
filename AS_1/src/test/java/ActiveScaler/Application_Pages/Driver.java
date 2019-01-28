package ActiveScaler.Application_Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ActiveScaler.Locator.Driver_Locator;

public class Driver implements Driver_Locator
{
	WebDriver driver;
	Properties ps;
	public Driver(WebDriver driver, Properties ps)
	{
		this.driver=driver;
		this.ps=ps;
	}
	
	public void driver_page_verification() throws Exception
	{
		
		driver.findElement(By.xpath(loc_DriverHomePage)).click();
		Thread.sleep(2000);
	//	WebDriverWait wait = new WebDriverWait(driver, 20);
	//	WebElement add=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loc_AddDriver)));
		//add.click();
	//	driver.findElement(By.xpath(loc_AddDriver));
	}
	public void add_drivercreation() throws Throwable
	{
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement add =wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loc_AddDriver)));
		add.click();
		Thread.sleep(2000);
		String driver_window = driver.getWindowHandle();
		System.out.println(driver_window);
		driver.switchTo().window(driver_window);
		driver.findElement(By.name(loc_DriverName)).sendKeys("Auto_Driver");
	}

}
