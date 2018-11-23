package Scripts;

import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.input;
import POM.LoginActitime;

public class login extends BaseTest {
	
	@Test(groups= {"login"})
	public void loginscript()
	{
		LoginActitime ob1=new LoginActitime(driver);
		ob1.setusername(input.getdata(excel, "sheet1", 0, 1));
		ob1.setpassword(input.getdata(excel, "sheet1", 1, 1));
		ob1.clicklogin();
		ob1.titlewait("actiTIME - Enter Time-Track");
	}

}
