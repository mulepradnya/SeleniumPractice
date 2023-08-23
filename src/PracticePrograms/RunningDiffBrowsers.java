package PracticePrograms;

import org.openqa.selenium.WebDriver;  

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

import org.openqa.selenium.safari.SafariDriver;


public class RunningDiffBrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To launch Chrome Browser
		// WebDriver Interface = ChromeDriver Class
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.close();
		
		//To launch FireFox Browser  
		WebDriver driver1 = new FirefoxDriver();  
		driver1.get("https://www.amazon.com");
		driver1.close();
		
		//To launch Internet Explorer Browser 
		WebDriver driver2 =new InternetExplorerDriver();  
		driver2.get("http://www.google.com");
		driver2.close();
		
		//To launch Safari Browser
		 WebDriver driver3 = new SafariDriver();  
		driver3.get("https://www.myntra.com");
		
		
		
	}

}
