package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BasePage;


public class Enter_Time_Track extends BasePage{
	@FindBy(id="logoutLink")
	private WebElement logout;
	@FindBy(xpath="//a[contains(@class,'users')]")
	private WebElement users;
	

	public Enter_Time_Track(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	public void clicklogout()
	{   this.elementvisibility(this.logout);
		this.logout.click();
	}
	public void clickusers()
	{
		this.elementvisibility(this.users);
		this.users.click();
		
		
	}
	

}
