package org.windowhandle;

import java.awt.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mr.Ravi Shankar\\Desktop\\Selenium\\Browser\\chromedriver_1.exe");
			WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2uS5ZX _2Dfasx']"));
		//close.click();
		
		WebElement productsrc = driver.findElement(By.xpath("//input[@name='q']"));
        productsrc.sendKeys("Redmi note 7");
        
        WebElement srcbtn = driver.findElement(By.xpath("//button[@type='submit']"));
        srcbtn.click();
        
        WebElement Productone = driver.findElement(By.xpath("//div[text()='Redmi Note 7 (Sapphire Blue, 64 GB)']"));
        Productone.click();
       
        String id1 = driver.getWindowHandle();
        System.out.println(id1);
        
        Set<String> allid1 = driver.getWindowHandles();
        System.out.println(allid1);
        
        java.util.List<String> li = new ArrayList<String>();
        li.addAll(allid1);
        
        driver.switchTo().window(li.get(1));
        
        WebElement pin = driver.findElement(By.id("pincodeInputId"));
        pin.sendKeys("600045");
        
        WebElement che = driver.findElement(By.xpath("//span[text()='check']"));
        che.click();
        
        WebElement addtocart = driver.findElement(By.xpath("//button[text()='ADD TO THE CART']"));
        addtocart.click();
        
        
        
        
	}
   
}
