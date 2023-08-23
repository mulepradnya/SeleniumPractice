package PracticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.lambdatest.com/selenium-playground/drag-and-drop-demo");
		
		driver.manage().window().maximize();
				
		//Drag & Drop - 1
		WebElement source = driver.findElement(By.xpath("//*[contains(text(), 'Drag me to my target')]"));
		
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions dragdrop = new Actions (driver);
		
		Thread.sleep(2000);
		
		dragdrop.dragAndDrop(source, target).build().perform();
		
		//Drag & drop - 2
		WebElement source1 = driver.findElement(By.xpath("//*[@id=\"todrag\"]/span[1]"));
		
		WebElement source2 = driver.findElement(By.xpath("//*[@id=\"todrag\"]/span[2]"));
		
		WebElement target1 = driver.findElement(By.xpath("//*[@id=\"mydropzone\"]"));
		
		Actions dragdrop1 = new Actions (driver);
		
		Thread.sleep(2000);
		
		dragdrop1.dragAndDrop(source1, target1).build().perform();
		
		Thread.sleep(2000);
		
		dragdrop1.dragAndDrop(source2, target1).build().perform();
		
		//driver.close();
			
		WebDriver driver1 = new ChromeDriver ();
		
		driver1.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		
		
		
		
		
		
		
		

	}

}
