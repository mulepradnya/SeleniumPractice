package PracticePrograms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Open Browser
		WebDriver driver = new ChromeDriver ();
		
		//Open URL
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.manage().window().maximize();
		
		//Parent Tab open
		driver.findElement(By.id("newTabBtn")).click();
		
		System.out.println("Parent Tab URL - "+driver.getCurrentUrl());
		
		//Child Tab Open
		Set <String> Tab = driver.getWindowHandles();
		
		Iterator <String> object = Tab.iterator();
		
		String Parenttab = object.next();
		
		String Childtab = object.next();
		
		driver.switchTo().window(Childtab);
		
		System.out.println("Child Tab URL - "+driver.getCurrentUrl());
		
		//Child Tab Alert accept
		
		driver.findElement(By.id("alertBox")).click();
		
		Thread.sleep(2000);
		
		System.out.println("Alert Box Message - "+driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		//Child tab Confirm box accept
		
		driver.findElement(By.id("confirmBox")).click();
		
		Thread.sleep(2000);
		
		System.out.println("Confirm Box Message - "+driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		//Child Tab Prompt box accept
		
		driver.findElement(By.id("promptBox")).click();
		
		Thread.sleep(2000);
		
		System.out.println("Prompt Box Message - "+driver.switchTo().alert().getText());
		
		driver.switchTo().alert().sendKeys("Pradnya Mule");
		
		driver.switchTo().alert().accept();
		
		driver.switchTo().window(Parenttab);
		
		System.out.println(driver.getCurrentUrl());
		
		
	}

}
