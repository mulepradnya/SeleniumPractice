package PracticePrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExcelHandlingPractice1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		//Open Browser
		WebDriver driver = new ChromeDriver ();
		
		//Open URL
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0, 300)");
		
		//Enter First name
		File file = new File ("C:\\Users\\Owner\\Desktop\\Software Testing\\TestData.xlsx");
				
		FileInputStream inputstream = new FileInputStream (file);
				
		//Create object of XSSFWorkbook class for .xlsx file
		XSSFWorkbook filename = new XSSFWorkbook (inputstream);
				
		//Read sheet inside the workbook by its name
		Sheet sheet = filename.getSheetAt(2);
		
		//Enter name
		Row namerow = sheet.getRow(0);
		Cell namecell = namerow.getCell(0);
		
		String name = namecell.toString();
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(name);
		
		//Enter last name
		Row lastnamerow = sheet.getRow(1);
		Cell lastnamecell = lastnamerow.getCell(1);
		
		String lastname = lastnamecell.toString();
		
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(lastname);
		
		//Enter email ID
		Row emailrow = sheet.getRow(2);
		Cell emailcell = emailrow.getCell(2);
		
		String emailID = emailcell.toString();
		
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys(emailID);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/h5")).click();
		
		//Click on gender button
		driver.findElement(By.xpath("//*[@id='genterWrapper']/div[2]/div[2]/label")).click();
		
		//Enter Mobile Number
		Row mobilerow = sheet.getRow(6);
		Cell mobilecell = mobilerow.getCell(1);
		
		String mobile = mobilecell.toString();
		
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys(mobile);
		
		//Select date of birth
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
		
		WebElement year = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		
		Select expected = new Select (year);
		
		expected.selectByVisibleText("1992");
		
		WebElement month = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
		
		Select expected1 = new Select (month);
		
		expected1.selectByValue("9");
		
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div[7]")).click();
				
		//Select Hobbies
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label")).click();
		
		//Enter Subjects
		WebElement subject = driver.findElement(By.xpath("//div[@class='subjects-auto-complete__control css-yk16xz-control']"));
				
		subject.click();
				
		Thread.sleep(2000);
			
		subject.sendKeys("com");
		Thread.sleep(2000);
		subject.sendKeys(Keys.ARROW_DOWN);
		subject.sendKeys(Keys.ENTER);
		
		subject.sendKeys("Hin");
		Thread.sleep(2000);
		subject.sendKeys(Keys.ENTER);
						
		subject.sendKeys("eng");
		Thread.sleep(2000);
		subject.sendKeys(Keys.ENTER);
			

	}

}
