package PracticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Open Browser
		WebDriver driver = new ChromeDriver ();
												
		//launch URL
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		
		Thread.sleep(6000);
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().sendKeys("Pradnya Mule");
		
		driver.switchTo().alert().accept();
		
		driver.close();
		
		WebDriver driver1 = new ChromeDriver ();
		
		driver1.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver1.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Thread.sleep(2000);
		
		System.out.println(driver1.switchTo().alert().getText());
		
		driver1.switchTo().alert().accept();
				
		driver1.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		Thread.sleep(2000);
		
		System.out.println(driver1.switchTo().alert().getText());
		
		driver1.switchTo().alert().dismiss();
		
		driver1.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Thread.sleep(2000);
		
		System.out.println(driver1.switchTo().alert().getText());
		
		driver1.switchTo().alert().sendKeys("Pradnya Mule");
		
		Thread.sleep(2000);
		
		driver1.switchTo().alert().accept();
		
				
		}

}
