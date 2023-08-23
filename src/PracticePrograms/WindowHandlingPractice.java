package PracticePrograms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Open Browser
		WebDriver driver = new ChromeDriver();
		
		//Launch URL
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.manage().window().maximize();

		//Parent window open
		driver.findElement(By.id("newWindowBtn")).click();

		System.out.println("Parent window URL Name - "+driver.getCurrentUrl());
		
		Set <String> windowname = driver.getWindowHandles();
		
		System.out.println("Parent Window name - "+windowname);
		
		//Child 1 window open
		Iterator<String> object = windowname.iterator();
		
		String Parentwindow = object.next();
		String Childwindow = object.next();
		
		driver.switchTo().window(Childwindow);
		
		System.out.println("Child 1 window URL Name - "+driver.getCurrentUrl());
		
		System.out.println("Child 1 Window name - "+Childwindow);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Pradnya");
		
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Mule");
		
		driver.findElement(By.id("femalerb")).click();
		
		driver.findElement(By.xpath("//input[@id='englishchbx']")).click();
		
		driver.findElement(By.xpath("//input[@id='hindichbx']")).click();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("padmanke@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("pradnya123456");
		
		driver.findElement(By.xpath("//button[@id='registerbtn']")).click();
		
		//Child 2 window open
		driver.findElement(By.xpath("//a[@id='navigateHome']")).click();
		
		Set<String> windowName = driver.getWindowHandles();
		
		System.out.println("Basic control Child 1 Window name - "+windowName);
		
		Iterator<String> Object2 = windowName.iterator();
		
		String parentWindow1 = Object2.next();//Basic control in HTML window
		String childWindow1 = Object2.next();//Home Page
			
		driver.switchTo().window(childWindow1);
		
		System.out.println("Child 2 window URL name - "+driver.getCurrentUrl());
		
		System.out.println("Home Page Child 2 Window name - "+childWindow1);
		
		driver.switchTo().window(parentWindow1);
		
		driver.switchTo().window(Parentwindow);
		
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
	}

}
