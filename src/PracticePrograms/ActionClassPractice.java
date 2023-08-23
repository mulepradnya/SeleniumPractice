package PracticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Open Browser
		WebDriver driver = new ChromeDriver ();
		
		//Open URL
		driver.get("https://www.browserstack.com/");
		
		driver.manage().window().maximize();
		
		WebElement RightClick = driver.findElement(By.id("signupModalButton"));
		
		//Create Action class object
		Actions Click = new Actions (driver);
		
		//Right click on element using contextClick method.
		Click.contextClick(RightClick).perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-secondary btn-lg col-md-3']")).click();
				
		driver.findElement(By.xpath("//button[@id='tingle-modal__close']")).click();
		
		Thread.sleep(3000);
		
		WebElement MouseHover = driver.findElement(By.xpath("//a[@class='product-cards-wrapper--click--hoverclick product-card-percy']"));
		
		Click.moveToElement(MouseHover).build().perform();
		
		Thread.sleep(3000);
				
		WebElement DoubleClick = driver.findElement(By.xpath("//a[@class='product-cards-wrapper--click--hoverclick product-card-live']"));
		
		Click.moveToElement(DoubleClick).perform();
		
		//Double click on element using doubleClick method
		Click.doubleClick(DoubleClick).perform();
		
		driver.close();
			

	}

}
