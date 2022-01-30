package org.test.b;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mr.Ravi Shankar\\Desktop\\Selenium\\Browser\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	WebElement txtusername = driver.findElement(By.name("email"));
	txtusername.sendKeys("srivijay25@gmail.com");
	
	WebElement txtpass = driver.findElement(By.name("pass"));
	txtpass.sendKeys("6383951226");
	
	WebElement btnlogin = driver.findElement(By.name("login"));
	btnlogin.click();
	
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println("currentUrl");
	
	driver.quit();
	
	
	
	}

}
