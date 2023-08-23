package PracticePrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;

public class CSSSelectorPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Open Browser
		WebDriver driver = new ChromeDriver ();
				
		//launch URL
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//interface variable = (interface) driver
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		
		// This  will scroll down the page by  1000 pixel vertical
		scroll.executeScript("window.scrollBy(0, 300)");
		//scroll.executeScript("window.scrollTo(0, document.body.scrollHeight)");
     		
		//Enter Name in text box = CSS Selector ---> tag#id
		driver.findElement(By.cssSelector("input#fname")).sendKeys("Pradnya Mule");
		
		//Click on submit button = CSS Selector ---> tag[attribute = value]
		driver.findElement(By.cssSelector("button[id=idOfButton]")).click();
		
		
		//Double click on box
		WebElement doubleclickalert = driver.findElement(By.xpath("//button[@id='dblClkBtn']"));
		
		Actions object = new Actions (driver);
		
		object.doubleClick(doubleclickalert).perform();
		
		Thread.sleep(1500);
		
		//Print alert		
		System.out.println(driver.switchTo().alert().getText());
		
		//Accept alert
		driver.switchTo().alert().accept();
		
		//Click on radio button
		driver.findElement(By.id("female")).click();
		
		//Click on checkbox = CSS Selector ---> tag.class
		driver.findElement(By.cssSelector("input.Automation")).click();
		
		//CSS Selector ---> tag.class[attribute=value]
		driver.findElement(By.cssSelector("input.Performance[type=checkbox]")).click();
		
		//select value from drop down
		WebElement testing= driver.findElement(By.xpath("//select[@id='testingDropdown']"));
		
		Select dropdown = new Select (testing);
		
		dropdown.selectByIndex(2);
		
		//click on button to generate alert 
		driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		//click on confirm button to generate alert
		driver.findElement(By.xpath("//button[text()='Generate Confirm Box']")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().dismiss();
		
		//Drag and Drop Image
		WebElement source = driver.findElement(By.xpath("//*[@id=\"myImage\"]"));
		
		WebElement target = driver.findElement(By.xpath("//div[@id='targetDiv']"));
		
		Actions image = new Actions (driver);
		
		Thread.sleep(3000);
		
		image.dragAndDrop(source, target).build().perform();
				
		
		
	}

}
