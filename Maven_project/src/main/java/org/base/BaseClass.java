package org.base;

import java.util.concurrent.TimeUnit;

import org.base.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.test1.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	public static WebDriver launchBrowser(String browsername) {
		
		switch (browsername) {
		case "Chrome" :
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		break;
			
        case "Firefox" :
        	WebDriverManager.firefoxdriver().setup();
        	driver = new FirefoxDriver();
        break;
        
        case "Edge" :
        	WebDriverManager.edgedriver().setup();
        	driver = new EdgeDriver();
		break;

		default:
			System.err.println("Invalid broswer Name");
			break;
		}
		return driver;
	}
	
	public static void launchUrl(String url) {
		driver.get(url);
	}
	public static void implicitWait(long sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	
	}
	public static void main(String[] args) {
		launchBrowser("Chrome");
		launchUrl("https://www.facebook.com/");
		implicitWait(10);
		
		LoginPage l = new LoginPage();
		
		sendkeys(l.getTxtUsername(),"Sri");
		sendkeys(l.getTxtpassword(),"638395");
		 
		driver.navigate().refresh();
		sendkeys(l.getTxtUsername(),"vidhya");
		btnclick(l.getbtnlogin());
	

}
