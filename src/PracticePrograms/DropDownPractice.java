package PracticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Open Browser
		WebDriver driver = new ChromeDriver ();
								
		//launch URL
		driver.get("https://www.lambdatest.com/selenium-playground/select-dropdown-demo");
		
		//Select Option
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='select-demo']"));
		
		Select drop = new Select (dropdown);
		Thread.sleep(2000);
		drop.selectByValue("Monday");
		
		//Select Multi Options
		WebElement MultiSelect = driver.findElement(By.id("multi-select"));
		
		Select Multi = new Select (MultiSelect);
		System.out.println("Answer of multiple method "+Multi.isMultiple());//Return Boolean Value - True
		
		Multi.selectByIndex(2);
		Thread.sleep(2000);
		Multi.selectByValue("Texas");
		Thread.sleep(2000);
		Multi.selectByVisibleText("California");
		
		Thread.sleep(2000);
		driver.close();
		
		//Open New Browser
		WebDriver driver1 = new ChromeDriver ();
										
		//Launch New URL
		driver1.get("https://www.lambdatest.com/selenium-playground/jquery-dropdown-search-demo");
		
		driver1.manage().window().maximize();
		
		//Drop Down with Search
		WebElement country = driver1.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[1]/div[2]/span/span[1]/span"));
		
		country.click();
		
		/*
		List<WebElement> selectcountry = driver1.findElements(By.xpath("/html/body/span/span/span[1]/input"));
		
		for (WebElement selection : selectcountry)
		{
			System.out.println(selection.getText());
			if (selection.getText().equalsIgnoreCase("India")) {
				selection.click();
			}
		}
		*/
				
		country.sendKeys(Keys.ARROW_DOWN);
		country.sendKeys(Keys.ARROW_DOWN);
		country.sendKeys(Keys.ARROW_DOWN);
		country.sendKeys(Keys.ARROW_DOWN);
		country.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		country.sendKeys(Keys.ENTER);
		
		//Select Multiple Values with search
		WebElement state = driver1.findElement(By.xpath("//input[@class='select2-search__field']"));
		
		state.click();
		
		state.sendKeys("cal");
		Thread.sleep(2000);
		state.sendKeys(Keys.ENTER);
		
		state.sendKeys("Tex");
		Thread.sleep(2000);
		state.sendKeys(Keys.ENTER);
		
		state.sendKeys("new");
		Thread.sleep(2000);
		state.sendKeys(Keys.ARROW_DOWN);
		state.sendKeys(Keys.ENTER);
		
		state.sendKeys("new");
		Thread.sleep(2000);
		state.sendKeys(Keys.ARROW_DOWN);
		state.sendKeys(Keys.ARROW_DOWN);
		state.sendKeys(Keys.ARROW_DOWN);
		state.sendKeys(Keys.ENTER);
		
		//Drop-down with Category related options
		WebElement file = driver1.findElement(By.xpath("//select[@id='files']"));
		
		Select selectfile = new Select (file);
		
		selectfile.selectByVisibleText("Python");
		Thread.sleep(2000);
		selectfile.selectByIndex(4);
		
		//Drop Down with Disabled values
		WebElement country1 = driver1.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div[2]/span"));
		
		country1.click();
		
		country1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		country1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		country1.sendKeys(Keys.ENTER);
		
		driver1.close();
	}

}
