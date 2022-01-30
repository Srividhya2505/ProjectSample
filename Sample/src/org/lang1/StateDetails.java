package org.lang1;
import org.lang.*;

public class StateDetails {
	
	private void southIndia() {
		// TODO Auto-generated method stub
    System.out.println("South India is Chennai");
	}
    private void northIndia() {
		// TODO Auto-generated method stub
    System.out.println("North Chennai is Delhi");
	}
    public static void main(String[] args) {
	StateDetails s = new StateDetails();
	s.southIndia();
	s.northIndia();
	
	LanguageInfo L = new LanguageInfo();
	L.tamilLanguage();
	L.englishLanguage();
	L.hindiLanguage();
	}
}
