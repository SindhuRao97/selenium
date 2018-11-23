package Scripts;

import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.input;
import POM.Enter_Time_Track;
import POM.LoginActitime;

public class Users extends BaseTest {
	  @Test(groups= {"home"})
		public void test3() throws InterruptedException {
		  LoginActitime ob1=new LoginActitime(driver);
			ob1.setusername(input.getdata(excel, "sheet1", 0, 1));
			ob1.setpassword(input.getdata(excel, "sheet1", 1, 1));
			ob1.clicklogin();
			ob1.titlewait("actiTIME - Enter Time-Track");
	       
	        Enter_Time_Track ob2=new Enter_Time_Track(driver);
	        ob2.clickusers();
	        ob2.clicklogout();


		}

}
