package PracticePrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class IncognitoModePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 FirefoxOptions options = new FirefoxOptions();
	     options.addArguments("-private");
	    	     
	     //Open Browser
	     WebDriver driver = new FirefoxDriver(options);
					
	     //Open URL
	     driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	     
	     System.out.println(driver.getTitle());

	}

}
