package PracticePrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Browser Commands
		
		//To only launch the browser
		//parent reference WebDriver = child object ChromeDriver
		WebDriver driver = new ChromeDriver ();
						
		//To launch the URL
		driver.get("https://www.amazon.com");
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
	
		//To get current page title
		System.out.println("Title of the page is: "+driver.getTitle());
		
		System.out.println("Length of the title is: "+driver.getTitle().length()); 
		
		//To get current web page URL.
		System.out.println("Current Web Page URL - "+driver.getCurrentUrl());
		
		//To get page source command
		//System.out.println("Page Source" +driver.getPageSource());
		
		System.out.println("Total length of the Page Source is : "+driver.getPageSource().length());
		
		//getClass() - The Class object that represents the runtime class of this object.
		System.out.println("Class of Current Program - " +driver.getClass());		
		
		//To verify URL using equal method 
		System.out.println("Answer of URL Verification is "+driver.equals(driver));
		
		//To verify URL using equal method If-else
		String actualURL = "https://www.google.com";
		if (actualURL.equals(driver.getCurrentUrl()))  
		{  
		System.out.println("Pass - Correct URL launch");  
		}  
		else  
		{  
		System.out.println("Fail - incorrect URL launch");  
		} 
		
		//hashCode() - The hash code value for this list.
		System.out.println("Answer of hashCode method - " +driver.hashCode());
		
		//To minimize windows
		driver.manage().window().minimize();
		
		//To maximize windows
		driver.manage().window().maximize();
		
		//To fullscreen windows
		driver.manage().window().fullscreen();
		
		
		
		
		//Navigation Commands
		
		//Go forward to web page  
        driver.navigate().forward();
		
		//Go backward to Home Page  
        driver.navigate().back();   

        //Refresh browser  
        driver.navigate().refresh(); 
          
        // Go back to Home page  
        driver.navigate().to("https://www.amazon.com");
		
		//Close method - This method terminates the current browser window operating by WebDriver at the current time. 
		driver.close();
		
		//Quit method - This method terminates all windows operating by WebDriver.
		driver.quit();
		
	}

}
