package PracticePrograms;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenShotPractice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Open Browser
		WebDriver driver = new ChromeDriver ();
						
		//launch URL
		driver.get("https://demoqa.com/");
				
		driver.manage().window().maximize();
		
		//Screenshot of viewable part of page
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshot, new File("C:\\Users\\Owner\\Desktop\\Software Testing\\ScreenShot\\Screenshot01.png"));
		
		//Screenshot of full screen full page
		Screenshot screen = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
       
		ImageIO.write(screen.getImage(),"png",new File("C:\\Users\\Owner\\Desktop\\Software Testing\\ScreenShot\\Screenshot02.png"));
				
		//Screenshot of particular element of page
		WebDriver driver1 = new ChromeDriver ();
		
		driver1.get("https://demoqa.com/menu#");
		
		WebElement Screen = driver1.findElement(By.xpath("//a[text()='Main Item 1']"));
		
		File screenshotFile1 = Screen.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshotFile1 , new File("C:\\Users\\Owner\\Desktop\\Software Testing\\ScreenShot\\Screenshot03.png"));
		
		//Screenshot of particular portion/section of page
		WebDriver driver2 = new ChromeDriver ();
		
		driver2.get("https://demoqa.com/");
		
		driver2.manage().window().maximize();
		
		WebElement Section = driver2.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]"));
		
		File screenshotFile2 = Section.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshotFile2 , new File("C:\\Users\\Owner\\Desktop\\Software Testing\\ScreenShot\\Screenshot04.png"));
		
		}

}
