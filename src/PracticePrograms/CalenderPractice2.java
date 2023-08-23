package PracticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPractice2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Open Browser
		WebDriver driver = new ChromeDriver ();
								
		//launch URL
		driver.get("https://www.redbus.in/railways");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='home_date_wrap']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/section[1]/div[2]/div[3]/div/div/div/div/div[3]/span[5]/div[4]/span")).click();
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
