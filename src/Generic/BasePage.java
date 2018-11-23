package Generic;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage {
	public WebDriver driver;
	public BasePage(WebDriver driver) 
	{
		this.driver=driver;
		
		}
	
	
	
	public void titlewait(String title)
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		try
		{
			wait.until(ExpectedConditions.titleIs(title));
			Reporter.log("title matching", true);
			}
		catch(Exception e)
		{
			
			Reporter.log("title not matching", true);
			Assert.fail();
			}
		
		
	}
	public void elementvisibility( WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("element displayed", true);
			}
		catch(Exception e)
		{
			
			Reporter.log("element not displayed", true);
			Assert.fail();
			}
		
		
	}

}
