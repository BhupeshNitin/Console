package ActiveScaler.Locator;

public interface Vehicles_Locator
{
	String loc_VehiclesPage ="//*[@id=\"m_header_menu\"]/ul/li[5]/a/span[2]";
	String loc_VehiclesSearchtextbox ="//*[@id=\"hoverable-rows\"]/div/div/div/div[1]/div/div/div[1]/div/input";
	String loc_VehiclesSearchbutton = "//*[@id=\"hoverable-rows\"]/div/div/div/div[1]/div/div/div[2]/button";
	String loc_AddVehicles = "//*[@id=\"hoverable-rows\"]/div/div/div/div[2]/div/span/i";
	
	// Create Vehicles Basic Info
	
	String loc_ModelName = "//*[@name= 'model']";
	String loc_Type = "//*[@name= 'type']";
	String loc_LicencePlateNumber = ".//*[@name='licencePlateNumber']";
	String loc_Doors = "//*[@name='doors']";
	String loc_ModelYear = "//*[@name='modelYear']";
	String loc_nextbutton ="/html/body/ngb-modal-window/div/div/div[2]/form/div/form-wizard/div/div[3]/button[2]";
}
