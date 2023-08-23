package PracticePrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUpPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Open Browser
		WebDriver driver = new ChromeDriver ();
		
		//Open URL
		driver.get("https://admin:admin@practice.expandtesting.com/basic-auth");
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
	}

}
