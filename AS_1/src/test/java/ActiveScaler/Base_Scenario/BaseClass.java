package ActiveScaler.Base_Scenario;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import ActiveScaler.Application_Pages.Driver;
import ActiveScaler.Application_Pages.Passenger;
import ActiveScaler.Application_Pages.login;
public class BaseClass
{
	public WebDriver driver;
	public Properties ps;
	public login ln;
	public Driver tagsi_driver;
	public Passenger passeng;
	
	
	@BeforeSuite
	@Parameters("cofig_file")
	public void set_up(@Optional("src/test/java/ActiveScaler/utiles/org.properties")String congif_file) throws FileNotFoundException 
	{
		ps = new Properties();
		 InputStream input = new FileInputStream(congif_file);
        try {
			ps.load(input);
		} catch (IOException e) 
        {
			e.printStackTrace();
			System.out.println(e);
		}
        
	
	}
	@BeforeClass
	public void base_test() throws Exception
	{
		String browsertype = ps.getProperty("browser").trim();
		switch (browsertype)
		{
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\nitin.thalia\\Downloads\\software\\chromedriver.exe");	
		     driver = new ChromeDriver();
			break;
			
		case "Firefox" :
		System.setProperty("webdriver.gecko.driver","C:\\Users\\nitin.thalia\\Downloads\\software\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  break;
		  
		default:
		System.out.println("Invalid browser");			
			break;
		}
	     driver.get(ps.getProperty("URL"));
         driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );	
		 ln = new login(driver, ps);
		 tagsi_driver = new Driver(driver, ps);
	}
	

		
	/*@AfterClass
	public void close()
	{
		driver.quit();
	}
*/
	
	
}
