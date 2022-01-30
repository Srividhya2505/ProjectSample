package org.test1;

import org.base.BaseClass;
import org.openqa.selenium.support.pagefactory.*;



public class Sample extends BaseClass {

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

	
}
	

}
