package PracticeSelenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		WebElement loginbtn = driver.findElement(By.id("email"));  //id locator
		
		loginbtn.sendKeys("Mohith");  //sendkeys 
		
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS); //implicit 
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.alertIsPresent());  //explicit
		
		//Thread.sleep(10000);
		
		WebElement Password = driver.findElement(By.name("pass"));
		
		Password.sendKeys("Kumar");
		
//		WebElement Button = driver.findElement(By.xpath("//button[text()='Log in']")); 
//		
//		Button.click();
		
//		
//		driver.findElement(By.linkText("https://www.facebook.com/recover/initiate/?ars=facebook_login&cancel_lara_pswd=0"));
//		
//		driver.findElement(By.partialLinkText("https://www.facebook.com"));
		
		
		
		

	}
	

}
