package ActiveScaler.Test_Script;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ActiveScaler.Base_Scenario.BaseClass;
import ActiveScaler.utiles.ReadExcel;

public class Demo extends BaseClass
{
	@Test(enabled=false,dataProvider="Data_test")
	public void test_register(String username,String email)
	{
		ln.test_git(username, email);
	//	System.out.println(username);
	//	System.out.println(email);
	}
	@DataProvider(name="Data_test")
	public Object[][] datatest() throws Exception
	{
		String filepath="C:\\Users\\nitin.thalia\\Desktop\\test_data.xlsx";
	    String Sheetname="sheet1";
		Object[][] data=ReadExcel.getdata(filepath,Sheetname);
		return data;
		
	}
}
