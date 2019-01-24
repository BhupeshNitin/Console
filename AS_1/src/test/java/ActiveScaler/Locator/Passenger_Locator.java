package ActiveScaler.Locator;

public interface Passenger_Locator 
{
	// Passenger home page
	String loc_PassengerHomePage ="//*[@id='m_header_menu']/ul/li[3]/a/span[2]";
	
	// Passenger Search and Add
	String loc_PassengerSearchtextbox ="//*[@id='hoverable-rows']/div/div/div/div/div[1]/div/div/div[1]/div/input";
	String loc_PassengerSearchbutton = "//*[@id='hoverable-rows']/div/div/div/div[1]/div/div/div[2]/button";
	String loc_AddPassenger = "//*[@id=\"hoverable-rows\"]/div/div/div/div[2]/div/span/i";
	
	// Create Student
	
	String loc_Student ="//*[@value='student']";
	String loc_StudentName = "//*[@name='name']";
	String loc_School = "//*[@name='partner']";
	String loc_GradeCode = ".//*[@name='gradeCode']";
	String loc_TeacherInformation = "//*[@name='teacherInfodoors']";
	String loc_Email = "//*[@name='email']";
	String loc_nextbutton ="/html/body/ngb-modal-window/div/div/div[2]/form/form-wizard/div/div[3]/button[2]";
	
	// Create Employee
	
	String loc_Employee ="//*[@value='employee']";
	String loc_EmployeeName = "//*[@name='name']";
	String loc_EmployeeEmail = "//*[@name='email']";
	String loc_Employer = "//*[@name='partner']";
	String loc_EmployerCode= "//*[@name='employeeCode']";
	String loc_OtherInformation = "//*[@name='otherInfo']";
	String loc_Empnextbutton ="/html/body/ngb-modal-window/div/div/div[2]/form/form-wizard/div/div[3]/button[2]";
	
	
}
