package ActiveScaler.utiles;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot
{
	public static void take_screenshot(WebDriver driver,String path)
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
           try 
           {
        	   
			FileHandler.copy(scrFile, new File(path));
		} 
           catch (IOException e) 
           {
			e.printStackTrace();
			System.out.println(e);
		}	
     }

}
