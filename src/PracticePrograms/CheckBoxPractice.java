package PracticePrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Open Browser
		WebDriver driver = new ChromeDriver ();
						
		//launch URL
		driver.get("https://demo.guru99.com/test/radio.html");
		
		//Click on single check box
		WebElement checkbox = driver.findElement(By.id("vfb-6-0"));
		checkbox.click();
		
		Thread.sleep(2500);
		
		//Click on multiple check box
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (int i=0; i<checkboxes.size(); i++) {
			checkboxes.get(i).click();
		}
		
		Thread.sleep(2500);
		
		//Click on multiple radio button
		List<WebElement> Radiobutton = driver.findElements(By.xpath("//input[@type='radio']"));
		
		for (int j=0; j<Radiobutton.size(); j++) {
			Radiobutton.get(j).click();
		}
		
		driver.close();
		
		//Open New Browser
		WebDriver driver1 = new ChromeDriver ();

		//launch New URL
		driver1.get("https://the-internet.herokuapp.com/checkboxes");
		
		//Check box Methods
		WebElement checkbox1 = driver1.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
		
		System.out.println("Checkbox1 is Displayed " +checkbox1.isDisplayed());
		System.out.println("Checkbox1 is Enabled " +checkbox1.isEnabled());
		System.out.println("Checkbox1 is Selected " +checkbox1.isSelected());
		
		WebElement checkbox2 = driver1.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
		
		System.out.println("Checkbox2 is Displayed " +checkbox2.isDisplayed());
		System.out.println("Checkbox2 is Enabled " +checkbox2.isEnabled());
		System.out.println("Checkbox2 is Selected " +checkbox2.isSelected());
		
		//Check that checkbox is selected, if not selected then select
		if (!checkbox1.isSelected()) {
			checkbox1.click();
		}
		
		if (!checkbox2.isSelected()) {
			checkbox2.click();
		}
		
		//Check that checkbox is selected or not if not selected then select if selected print that.
		if (checkbox1.isSelected()==false) {
			checkbox1.click();
			System.out.println("Checkbox1 is Now Selected");
		} else {
			System.out.println("Checkbox1 is already Selected");
		}
		
		if (checkbox2.isSelected()==false) {
			checkbox2.click();
			System.out.println("Checkbox2 is Now Selected");
		} else {
			System.out.println("Checkbox2 is already Selected");
		}
		
		driver1.close();
		
		//Open New Browser
		WebDriver driver2 = new ChromeDriver ();

		//launch New URL
		driver2.get("https://www.lambdatest.com/selenium-playground/checkbox-demo");
		
		WebElement DisabledCheckbox = driver2.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[2]/div[2]/div[3]/input"));
		
		System.out.println("Check box is Disabled " +DisabledCheckbox.isDisplayed());
		System.out.println("Check box is Enabled " +DisabledCheckbox.isEnabled());
		
		
	}

}
