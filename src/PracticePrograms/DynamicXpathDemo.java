package PracticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		//Open Browser
		WebDriver driver = new ChromeDriver ();
														
		//launch URL
		driver.get("https://demo.guru99.com/test/selenium-xpath.html");
		
		//By Absolute Xpath (Single Slash) - Click on Software Testing
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/ul[1]/li[1]/a")).click();
		
		driver.navigate().back();
		
		//By Relative Xpath (Double Slash) - Click on Testing
		driver.findElement(By.xpath("//div[@class='featured-box cloumnsize1']//h4[1]//b[1]")).click();
		
		//Contains () Xpath :- //*[contains (@attribute, 'Partial Value')] - Check message display at username
		WebElement User = driver.findElement(By.xpath("//*[contains(@id, 'message23')]"));
		System.out.println(User.isDisplayed());
		
		//Contains () Xpath :- //*[contains (text(), 'Value')]  - Check message display at password
		WebElement Password = driver.findElement(By.xpath("//*[contains(text(), 'Password must not be blank')]"));
		System.out.println(Password.isDisplayed());
		
		//OR Xpath :- //tagname[@attribute1='Value1' or @attribute2='Value2']
		//it is applicable if any one condition is true or maybe both
		driver.findElement(By.xpath("//input[@name='btnLogin' or @name='btnReset']")).click();
		
		//AND Xpath :- //tagname[@attribute1='Value1' and @attribute2='Value2']
		//both condition should be true
		driver.findElement(By.xpath("//input[@name = 'btnLogin' and @type = 'submit']")).click();
		
		//Starts-with Xpath :- //tagname[starts-with(@attribute,'value')]
		//For those element attribute value changes dynamically, selected value common for attribute
		WebElement Name = driver.findElement(By.xpath("//label[starts-with(@id,'message23')]"));
		System.out.println(Name.isEnabled());
		
		//Text() Function xpath :- //tagname[text()='Vale of text']
		WebElement ID = driver.findElement(By.xpath("//td[text()='UserID']"));
		System.out.println(ID.isDisplayed());
		
			
	}

}
