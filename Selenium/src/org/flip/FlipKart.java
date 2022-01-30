package org.flip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mr.Ravi Shankar\\Desktop\\Selenium\\Browser\\chromedriver_1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		WebElement productsrc = driver.findElement(By.xpath("//input[@name='q']"));
		productsrc.sendKeys("Realme 8s 5G");
		
		WebElement srcbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		srcbtn.click();
		
		WebElement productone = driver.findElement(By.xpath("//div[text()='realme 8s 5G (Universe Purple, 128 GB)']"));
	    productone.click();
		
		//WebElement pincode = driver.findElement(By.xpath("//input[@id = 'pincodeInputId']"));
		//pincode.sendKeys("600045");

		//WebElement btn = driver.findElement(By.xpath("//button[@class ='_2KpZ6l _2U9uOA _3v1-ww']]"));
		//btn.click();
	    
	    
}
}