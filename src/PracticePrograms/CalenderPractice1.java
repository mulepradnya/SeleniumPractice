package PracticePrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPractice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Open Browser
		WebDriver driver = new ChromeDriver ();
						
		//launch URL
		driver.get("https://jqueryui.com/datepicker/#date%E2%88%92range");
		driver.manage().window().maximize();
				
		WebElement frame = driver.findElement(By.xpath("//*[@id='content']/iframe"));
				
		driver.switchTo().frame(frame);
		
		Thread.sleep(2000);
		
		//Open calendar
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		//Date Selection
		List <WebElement> date = driver.findElements(By.xpath("//td[@data-month='9']"));

		
		Thread.sleep(2000);

		String Daydate = "3";
		for (WebElement day : date) {
			if(day.getText().equalsIgnoreCase(Daydate)) {
				day.click();
				break;
			}
		}
			
		
		

	}

}
