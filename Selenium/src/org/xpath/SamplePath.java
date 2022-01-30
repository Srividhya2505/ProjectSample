package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SamplePath {
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mr.Ravi Shankar\\Desktop\\Selenium\\Browser\\chromedriver_1.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	   WebElement crtpage = driver.findElement(By.xpath("//a[text()='Create a Page']"));
	   //crtpage.click(); 
	   
	   String text = crtpage.getText();
	   System.out.println(text);
	}

}
