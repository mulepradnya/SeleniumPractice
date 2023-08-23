package PracticePrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ApplicatonFormPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To only launch the browser
		WebDriver driver = new ChromeDriver ();
		
		//To launch the URL
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		//Enter First name
		driver.findElement(By.name("firstname")).sendKeys("Pradnya");
		
		//Enter Last name
		driver.findElement(By.name("lastname")).sendKeys("Mule");
		
		//Click on Gender button
		driver.findElement(By.id("sex-1")).click();
		
		//Click on Years of Experience
		driver.findElement(By.id("exp-6")).click();
		
		//Enter Date
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("12-07-2023");
		
		//Enter Profession
		driver.findElement(By.xpath("//input[@id='profession-1']")).click();
		
		//Enter Automation tools
		driver.findElement(By.xpath("//input[@id='tool-2']")).click();
		
		//Select Continents
		WebElement continents = driver.findElement(By.xpath("//select[@id='continents']"));
		
		Select C = new Select (continents);
		C.selectByVisibleText("North America");
		
		//Select Selenium Commands
		WebElement Commands = driver.findElement(By.xpath("//select[@id='selenium_commands']"));
		
		Select text = new Select (Commands);
		text.selectByIndex(2);
		
				

	}

}
