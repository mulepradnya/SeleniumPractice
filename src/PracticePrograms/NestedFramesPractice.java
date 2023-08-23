package PracticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFramesPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Open Browser
		WebDriver driver = new ChromeDriver ();
		
		//Open URL
		driver.get("https://demoqa.com/nestedframes");
		
		//WebElement parentframe = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		
		//driver.switchTo().frame(parentframe);
		
		//System.out.println("Parent Frame Text is "+parentframe.getText());
		
		WebElement childframe = driver.findElement(By.xpath("/html/body/iframe"));
		
		driver.switchTo().frame(childframe);
		
		System.out.println("Child Frame Text is "+childframe.getText());
		
		
		
		
		
		
		
		
		
	}

}
