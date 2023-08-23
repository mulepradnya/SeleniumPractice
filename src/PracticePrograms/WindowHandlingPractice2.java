package PracticePrograms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Open Browser
		WebDriver driver = new ChromeDriver ();
		
		//Open URL
		driver.get("https://practice.expandtesting.com/windows");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set <String> window = driver.getWindowHandles();
		
		Iterator <String> child = window.iterator();
		
		String parent1 = child.next();
		String child1 = child.next();
		
		driver.switchTo().window(child1);
		
		System.out.println("Child Window URL Name - "+driver.getCurrentUrl());
		
		System.out.println("Child window name - "+child);
		
		driver.quit();
		
		//Open Browser
		WebDriver driver1 = new ChromeDriver ();
				
		//Open URL
		driver1.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");
		
		driver1.findElement(By.xpath("//*[@id=\"__next\"]/section[3]/div/div/div[2]/div/input")).sendKeys("https://www.google.com/");
		
		driver1.findElement(By.xpath("//a[text()='  Open URL ']")).click();
		
		Set <String> openurl = driver1.getWindowHandles();
		
		Iterator <String> object = openurl.iterator();
		
		String parent = object.next();
		String childwindow = object.next();
		
		driver1.switchTo().window(childwindow);
		
		System.out.println("Child window URL "+driver1.getCurrentUrl());
				
		driver1.quit();
		
	}

}
