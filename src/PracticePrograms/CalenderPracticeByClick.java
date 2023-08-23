package PracticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPracticeByClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Open Browser
		WebDriver driver = new ChromeDriver ();
				
		//launch URL
		driver.get("https://jqueryui.com/datepicker/#date%E2%88%92range");
		//driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.xpath("//*[@id='content']/iframe"));
		
		driver.switchTo().frame(frame);
		
		//Open calendar
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		Thread.sleep(2000);
		
		//Select date
		driver.findElement(By.xpath("//a[@title='Next']")).click();//August
		driver.findElement(By.xpath("//a[@title='Next']")).click();//September
		driver.findElement(By.xpath("//a[@title='Next']")).click();//October
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@data-date = '3']")).click();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
