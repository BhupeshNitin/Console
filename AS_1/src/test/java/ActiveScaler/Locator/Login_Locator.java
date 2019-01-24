package ActiveScaler.Locator;

public interface Login_Locator 
{
	   // Sign Home Page
		String loc_SignInHomePage ="//*[@id='m_login']/div[1]/div/div/div/div[2]/div[3]/button";
		
		// Sign in with your existing account
		
		String loc_Email ="//*[@id='logonIdentifier']";
		String loc_Password = "//*[@id='password']";
		String loc_SignIN  = "//*[@id='next']";
		
		// Sign in Using Google
		
		String loc_GoogleButton ="//*[@id='GoogleExchange']";
		String loc_GoogleUserName = "//*[@id='identifierId']";
		String loc_UserNameNext  = "//*[@id='identifierNext']";
		String loc_GooglePassword ="//input[@name='password']";
		String loc_PasswordNext = "//*[@id='passwordNext']";
}
