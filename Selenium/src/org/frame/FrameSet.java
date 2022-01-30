package org.frame;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameSet {
	



public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mr.Ravi Shankar\\Desktop\\Selenium\\Browser\\chromedriver_1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames");
		
	    List<WebElement> frames= driver.findElements(By.tagName("iframe"));
	    System.out.println(frames.size());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("frame1");
		
		WebElement fra = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(fra);
		WebElement name = driver.findElement(By.xpath("//b[@id='topic']//following::input"));
		name.sendKeys("srividhya");
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		WebElement drp = driver.findElement(By.id("animals"));
		Select s = new Select(drp);
		s.selectByVisibleText("Avatar");
        driver.switchTo().defaultContent();
        
        driver.switchTo().frame("frame1");
        driver.switchTo().frame("frame3");
        WebElement check = driver.findElement(By.xpath("//input[@id='a']"));
        check.click();
        
        driver.switchTo().parentFrame();
        name.sendKeys("V");
        
    
		
		
		
		

	    

}
}
	  
