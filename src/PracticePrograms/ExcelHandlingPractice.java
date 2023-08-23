package PracticePrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelHandlingPractice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Open Browser
		WebDriver driver = new ChromeDriver ();
						
		//Open URL
		driver.get("https://practicetestautomation.com/practice-test-login/");
				
		driver.manage().window().maximize();
		
		//Enter First name
		File file = new File ("C:\\Users\\Owner\\Desktop\\Software Testing\\TestData.xlsx");
						
		FileInputStream inputstream = new FileInputStream (file);
				
		//Create object of XSSFWorkbook class for .xlsx file
		XSSFWorkbook filename = new XSSFWorkbook (inputstream);
				
		//Read sheet inside the workbook by its name
		Sheet sheet = filename.getSheetAt(1);
		
		Row usernamerow = sheet.getRow(5);
		Cell usernamecell = usernamerow.getCell(2);
		
		Row passwordrow = sheet.getRow(3);
		Cell passwordcell = passwordrow.getCell(6);
		
		String username = usernamecell.toString();
		
		String password = passwordcell.toString();
				
		//Enter username
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		
		//Enter password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		
		//Click on Submit button
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		//1. Verify button Log out is displayed on the new page
		
		WebElement logout = driver.findElement(By.xpath("//a[text() = 'Log out']"));
		
		System.out.println("On the new page log out button showing is "+logout.isDisplayed());
		
		//2. Verify new page URL contains practicetestautomation.com/logged-in-successfully/
		
		String expectedURL = "https://practicetestautomation.com/logged-in-successfully/";
		
		System.out.println("Verified new page URL contains Expected URL is "+driver.getCurrentUrl().equals(expectedURL));
		
		
		if (expectedURL.equals(driver.getCurrentUrl()))  
		{  
		System.out.println("Pass - Correct URL launch as expected");  
		}  
		else  
		{  
		System.out.println("Fail - incorrect URL launch");  
		}
				
		//3. Verify new page contains expected text ('Congratulations' or 'successfully logged in')
		
		String expectedText = "'Congratulations'";
		
		String expectedText1 = "'successfully logged in'";
		
		WebElement actualText = driver.findElement(By.xpath("//strong[text() = 'Congratulations student. You successfully logged in!']"));
		
		if (expectedText.equals(actualText) || (expectedText1.equals(actualText)) ) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
	}

}
