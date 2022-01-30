package org.banklocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mr.Ravi Shankar\\Desktop\\Selenium\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cibnext.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI&ITM=nli_corp_primer_login_btn_mob");
		
		WebElement txtloginid = driver.findElement(By.id("IS_CIBRIB_LOGIN"));
		txtloginid.sendKeys("srividhya@25");
		
		
	}

}
