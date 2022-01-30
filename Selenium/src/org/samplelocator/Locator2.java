package org.samplelocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mr.Ravi Shankar\\Desktop\\Selenium\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
//----------------USING ONE WAY---------------------
		//WebElement txtbutton = driver.findElement(By.name("q"));
		//txtbutton.sendKeys("Greens Technology");
//----------------USING ANOTHER WAY-----------------
		
		WebElement txtbutton = driver.findElement(By.xpath("//input[@name='q']"));
		txtbutton.sendKeys("Greens Technology");
		
		driver.quit();
		
		
	}

}
