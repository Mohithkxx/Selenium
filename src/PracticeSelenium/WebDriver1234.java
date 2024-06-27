package PracticeSelenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class WebDriver1234 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
//		WebDriver Firefox = new FirefoxDriver();
//		
//		WebDriver Edge = new EdgeDriver();
		
	
		// Launching the Url
		
		driver.get("https://www.google.co.in/");
		
		//get title
		
		System.out.println(driver.getTitle());
		
		//Get current title
		
		System.out.println(driver.getCurrentUrl());
		
		//get page source
		
		//System.out.println(driver.getPageSource());
		
		//driver.quit();    //whole browser
		
		//driver.close();  //particular tab
		
		
		//navigation commands
		
		//String URL
		
		driver.navigate().to("https://www.facebook.com/login/");
		
		//Back
		
		driver.navigate().back();
		
		//forward
		
		driver.navigate().forward();
		
		//refresh
		
		driver.navigate().refresh();
		
		//manage commands
		
		driver.manage().window().maximize();
		
		//driver.manage().window().minimize();
		
		System.out.println(driver.manage().window().getSize());
		
		
		
		
		
		
		
	}

}
