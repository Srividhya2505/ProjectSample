package org.bank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcLocator {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mr.Ravi Shankar\\Desktop\\Selenium\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
	    WebElement txtcustomerid = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		txtcustomerid.sendKeys("58497622");
		
	}

}
