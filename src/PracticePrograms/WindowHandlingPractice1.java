package PracticePrograms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Open Browser
		WebDriver driver = new ChromeDriver ();
		
		//Open URL
		driver.get("https://demoqa.com/browser-windows");
		
		driver.manage().window().maximize();
		
		//Open New Tab
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		
		Set <String> tabname = driver.getWindowHandles();
		
		Iterator <String> object = tabname.iterator();
		
		driver.switchTo().window(object.next());
		
		System.out.println("Child Tab URL Name - "+driver.getCurrentUrl());
		
		System.out.println("Child Tab name - "+tabname);
		
		//Open New Window
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		
		Set <String> Windowname = driver.getWindowHandles();
		
		Iterator <String> object1 = Windowname.iterator();
		
		driver.switchTo().window(object1.next());
		
		System.out.println("Child Window URL Name - "+driver.getCurrentUrl());
		
		System.out.println("Child Window name - "+Windowname);
		
		//Open new window message
		driver.findElement(By.xpath("//button[@id='messageWindowButton']")).click();
		
		Set <String> windowname = driver.getWindowHandles();
		
		Iterator <String> object2 = windowname.iterator();
		
		driver.switchTo().window(object2.next());
		
		driver.close();
	}

}
