package PracticePrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Open browser
		WebDriver driver = new ChromeDriver ();
		
		//Open URL
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		driver.manage().window().maximize();
		
		//1. Compute the number of Rows and Columns in a web table
		
		//Number of rows
		List<WebElement> rownumber = driver.findElements(By.xpath("//*[@id=\"countries\"]/tbody/tr"));
		int rowcount = rownumber.size();
		System.out.println("No. of rows in this table: "+rowcount);
		
		//Number of columns
		List<WebElement> columnnumber=driver.findElements(By.xpath("//*[@id=\"countries\"]/tbody/tr[1]/td"));
		int columncount = columnnumber.size();
		System.out.println("No of Columns in this table: "+columncount);
		
		//2. Find cell value for specific row & column of the webtable
		// or Locating an element in a web table in Selenium
				
		//Find the 78th row of a table
		WebElement expectedvalue = driver.findElement(By.xpath("//table[@id=\"countries\"]/tbody/tr[78]"));
		System.out.println("The 78th row text of the web table: "+expectedvalue.getText());
		
		//Find the 2nd cell of the 78th row and print the value
		WebElement expectedvalue1 = driver.findElement(By.xpath("//table[@id=\"countries\"]/tbody/tr[78]/td[2]"));
		System.out.println("The 2nd cell of the 78th row text in the web table is "+expectedvalue1.getText());
		
		//Find the 187th row of a table
		WebElement value = driver.findElement(By.xpath("//table[@id=\"countries\"]/tbody/tr[188]"));
		System.out.println("The 187th row text of the web table: "+value.getText());
		
		//Find the 2nd cell of the 187th row and print the value
		WebElement value1 = driver.findElement(By.xpath("//table[@id=\"countries\"]/tbody/tr[188]/td[2]"));
		System.out.println("The 2nd cell of the 187th row text in the web table is "+value1.getText());
		
		driver.close();
	}

}
