package Generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class getscrshot {
	public static void getphoto(WebDriver driver,String name)
	{
		TakesScreenshot t=(TakesScreenshot)driver;
		File source = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./PHOTO/photo=/"+name+".png");
		try {
			FileUtils.copyFile(source, dest);
		} catch (IOException e) {
			
		}
	}

}
