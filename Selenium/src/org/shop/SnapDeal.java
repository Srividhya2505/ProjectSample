package org.shop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SnapDeal {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Mr.Ravi Shankar\\Desktop\\Selenium\\Browser\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.snapdeal.com/login");
		
		WebElement txtusername = driver.findElement(By.name("username"));
		txtusername.sendKeys("Srivijay2505@gmail.com");
		
		
	}
}
