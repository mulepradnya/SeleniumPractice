package PracticePrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessWindowPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxOptions options=new FirefoxOptions();
		options.addArguments("--headless");
				
		//Open Browser
		WebDriver driver = new FirefoxDriver (options);
		
		//Open URL
		driver.get("https://www.browserstack.com/");
		
		System.out.println(driver.getTitle());
		
	}

}
