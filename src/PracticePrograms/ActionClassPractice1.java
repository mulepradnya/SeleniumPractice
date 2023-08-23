package PracticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassPractice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Open Browser
		WebDriver driver = new ChromeDriver();
		
		//Open URL
		driver.get("https://demoqa.com/buttons");
		
		//Double click
		WebElement doubleclick = driver.findElement(By.id("doubleClickBtn"));
		
		Actions click = new Actions (driver);
		
		click.doubleClick(doubleclick).perform();
		
		Thread.sleep(2000);
		
		//Right click
		WebElement rightclick = driver.findElement(By.id("rightClickBtn"));
		
		click.contextClick(rightclick).perform();
		
		Thread.sleep(2000);
	
		driver.close();
		
		Thread.sleep(2000);
	
		//Open new browser
		WebDriver driver1 = new ChromeDriver();
		
		//Open new URL
		driver1.get("https://demoqa.com/menu/");
		
		driver1.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//Mouse hover action
		Actions mousehover = new Actions (driver1);
		
		WebElement item1 = driver1.findElement(By.xpath("//a[text()='Main Item 1']")); 
				
		mousehover.moveToElement(item1).perform();
		
		Thread.sleep(2000);
		
		WebElement item2 = driver1.findElement(By.xpath("//a[text()='Main Item 2']"));
		
		mousehover.moveToElement(item2).perform();
		
		Thread.sleep(2000);
		
		WebElement item3 = driver1.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
		
		mousehover.moveToElement(item3).perform();
		
		driver1.close();

	}

}
