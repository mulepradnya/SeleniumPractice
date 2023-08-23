package PracticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropDownPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Open Browser
		WebDriver driver = new ChromeDriver ();
												
		//launch URL
		driver.get("https://www.flipkart.com/");
		
		WebElement Enter = driver.findElement(By.xpath("//input[@type='text']"));
		
		Enter.click();
		
		Enter.sendKeys("mob");
		
		Thread.sleep(2000);
		
		Enter.sendKeys(Keys.ARROW_DOWN);
		
		Enter.sendKeys(Keys.ARROW_DOWN);
		
		Enter.sendKeys(Keys.ENTER);
		
		driver.close();
		
		//Open Browser
		WebDriver driver1 = new ChromeDriver ();
														
		//launch URL
		driver1.get("https://www.yahoo.com/");
		
		WebElement search = driver1.findElement(By.xpath("//input[@id='ybar-sbq']"));
		
		search.click();
		
		search.sendKeys("fac");
		
		Thread.sleep(2000);
		
		search.sendKeys(Keys.ARROW_DOWN);
		
		search.sendKeys(Keys.ARROW_DOWN);
		
		search.sendKeys(Keys.ARROW_DOWN);
		
		search.sendKeys(Keys.ARROW_DOWN);
		
		Thread.sleep(2000);
		
		search.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		driver1.close();
		
		
		

	}

}
