package PracticePrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCertIssueInPractice {

	public static void main(String[] args) {
						
		//1. By FirefoxOptions
		FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.setAcceptInsecureCerts(true);
				
		//Open Browser
		WebDriver driver = new FirefoxDriver(firefoxOptions);
		
		//Open URL
		driver.get("https://self-signed.badssl.com/");
		
		System.out.println(driver.getTitle());
		
		//2. By ChromeOptions
		ChromeOptions option = new ChromeOptions ();
		option.setAcceptInsecureCerts(false);
		
		//Open Browser
		WebDriver driver1 = new ChromeDriver (option);
		
		//Open URL
		driver1.get("https://revoked.badssl.com/");
		
		System.out.println(driver1.getTitle());
		
	}

}
