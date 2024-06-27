package PracticeSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownAndScreenShot {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.tagName("select"));
		
		Select s = new Select(dropdown);
		
		s.selectByIndex(1);  // with index 
		
//		s.selectByValue("ARG"); // by value
		
		//s.selectByVisibleText("Brazil"); // with visible text
		
		//Select s1 = new Select(dropdown);
		
		//s1.deselectByIndex(1);
		
		//s.deselectByIndex(1);
		
		
		
		//ScreenShot 
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File scrn = ts.getScreenshotAs(OutputType.FILE);
		File pathFile = new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumIntegration\\screen\\image.png");
	    FileUtils.copyFile(scrn, pathFile);
		
		
	}

}
