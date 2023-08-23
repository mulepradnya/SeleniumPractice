package PracticePrograms;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAndFramePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Open Browser
		WebDriver driver = new ChromeDriver ();
		
		//Open URl
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#Open%20New%20Window");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.manage().window().maximize();
		
		//Open New Tab
		driver.findElement(By.linkText("Click Here")).click();
		
		Set <String> tabname = driver.getWindowHandles();
		
		Iterator <String> object = tabname.iterator();
		
		String parenttab = object.next();
		String childtab = object.next();
		
		driver.switchTo().window(childtab);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Open New Window
		driver.findElement(By.xpath("//*[@id='Open New Window']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"post-2632\"]/div[2]/div/div/div[2]/a")).click();
		
		Set <String> windowname = driver.getWindowHandles();
		
		Iterator <String> object1 = windowname.iterator();
		
		String parentwindow = object1.next();
		String childwindow = object1.next();
				
		driver.switchTo().window(childwindow);
		
		//Open Iframe window
		driver.findElement(By.cssSelector("li#iFrame")).click();
		
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"post-2632\"]/div[2]/div/div/div[3]/p/iframe"));
		
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//input[@id=\"s\"]")).sendKeys("https://www.google.com/");
		
		driver.findElement(By.xpath("//*[@id=\"subheader\"]/div/div/div[1]/form/button")).click();
		
		System.out.println("Test Done Properly");
		
		//driver.close();
		

	}

}
