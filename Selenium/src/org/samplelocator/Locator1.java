package org.samplelocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mr.Ravi Shankar\\Desktop\\Selenium\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		WebElement txtbuttonsrc = driver.findElement(By.xpath("//input[@id='src']"));
		txtbuttonsrc.sendKeys("chennai");
		
		WebElement txtbuttondest = driver.findElement(By.xpath("//input[@id='dest']"));
	    txtbuttondest.sendKeys("Kerala");
		
		//String currentUrl = driver.getCurrentUrl();
		//System.out.println(currentUrl);
		
		//driver.quit();
		
		
	}

}
