package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BasePage;

public class LoginActitime extends BasePage {
	@FindBy(id="username")
	private WebElement username;
	@FindBy(name="pwd")
	private WebElement password;
	@FindBy(id="loginButton")
	private WebElement login;
	
	public LoginActitime(WebDriver driver) 
	{   super(driver);
		PageFactory.initElements(driver, this);
	}
	public void setusername( String un)
	{
		this.username.sendKeys(un);
	}
	public void setpassword( String pw)
	{
		this.password.sendKeys(pw);
	}
	public void clicklogin( )
	{
		this.login.click();
	}

}
