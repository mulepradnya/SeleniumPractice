package PracticePrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Open Browser
		WebDriver driver = new ChromeDriver ();
		
		//Open URL
		driver.get("https://the-internet.herokuapp.com/tables");
		
		driver.manage().window().maximize();
		
		//1. Compute the number of Rows and Columns in a web table
		
		//Number of rows
		List<WebElement> rownumber = driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr"));
		int rowdata = rownumber.size();
		System.out.println("Numbers of row is "+rowdata);
		
		//Number of columns
		List<WebElement> columnnumber = driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr[1]/td"));
		int coldata = columnnumber.size();
		System.out.println("Numbers of column is "+coldata);
		
		//2. Print Content Of The Web Table In Selenium
		/*
		for (WebElement tabledata:driver.findElements(By.tagName("tr"))) {
			System.out.println(tabledata.getText());
		}
		*/
		
		System.out.println("Table complete data");
		
		String firstpart = "//table[@id='table1']/tbody/tr[";
		String secondpart = "]/td[";
		String thirdpart = "]";
		
		for (int i=1; i<=rowdata; i++) {
			
			for(int j=1; j<=coldata; j++) {
				
				String finalpart = firstpart+i+secondpart+j+thirdpart;
				
				//System.out.println(finalpart);
				
				String text = driver.findElement(By.xpath(finalpart)).getText();
				
				System.out.print(text + " | ");
			}
			System.out.println();
		}
		
		//3. Find cell value for specific row & column of the webtable
		WebElement emailID = driver.findElement(By.xpath("//table[@id=\"table1\"]/tbody/tr[3]/td[5]"));
		
		System.out.println("Required Email ID is : "+emailID.getText());
		
		//4. Read Data In Rows To Handle Table In Selenium
		
		System.out.println("Column 1 Table data");
		
		String firstpart1 = "//table[@id='table1']/tbody/tr[";
		String secondpart1 = "]/td[1]";
		
		for (int i=1; i<=rowdata; i++) {
			
			String finalpart = firstpart1+i+secondpart1;
				
			String text1 = driver.findElement(By.xpath(finalpart)).getText();
			
			System.out.println(text1);
				
		}
		
		System.out.println("Column 3 Table data");
		
		String firstpart2 = "//table[@id='table1']/tbody/tr[";
		String secondpart2 = "]/td[3]";
		
		for (int i=1; i<=rowdata; i++) {
			
			String finalpart = firstpart2+i+secondpart2;
				
			String text2 = driver.findElement(By.xpath(finalpart)).getText();
			
			System.out.println(text2);
				
		}
		
	}

}
