package ActiveScaler.Locator;

public interface Driver_Locator
{
	   // Driver home page
		String loc_DriverHomePage ="//*[@id='m_header_menu']/ul/li[2]/a/span[2]";
		
		// Driver Search and Add
		String loc_DriverSearchtextbox ="//*[@id='hoverable-rows']/div/div/div/div/div[1]/div/div/div[1]/div/input";
		String loc_DriverSearchbutton = "//*[@id='hoverable-rows']/div/div/div/div/div[1]/div/div/div[2]/button";
		
		// Add Driver
		String loc_AddDriver = "//div";
		
		// Driver Basic Info
		
    	String loc_DriverName = "//*[@name='name']";
		String loc_DriverEmail = "//*[@name='email]";
		String loc_DriverContactNumber = ".//*[@name='phone']";
		String loc_DriverAge = ".//*[@name='age']";
		String loc_DriverGender = ".//*[@name='gender']";
		String loc_DriverLicensee = ".//*[@name='drivingLicience']";
			
		// Driver Address Info
		
		String loc_DriverStreeAddress ="//*[@value='employee']";
		String loc_DriverCity = "//*[@name='city']";
		String loc_DriverState = "//*[@name='state']";
		String loc_DriverZipCode = "//*[@name='zipCode']";
		
		// Driver Notes
		
		String loc_DriverNotes ="//*[@value='notes']";
		
		// Driver Saves
		
		String loc_DriverSave ="/html/body/ngb-modal-window/div/div/div[2]/div/div/form/form-wizard/div/div[2]/wizard-step[4]/div/div/div[2]/button";
		
				
	
}
