package PracticePrograms;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

public class SignInRegiLocatorsProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//To only launch the browser
		//parent reference WebDriver = child object ChromeDriver
		WebDriver driver = new ChromeDriver ();
						
		//To launch the URL
		driver.get("https://phptravels.org/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.manage().window().maximize();
		
		//Enter Email Address
		driver.findElement(By.id("inputEmail")).sendKeys("goodluck12345@gmail.com");
		
		//Enter Password
		driver.findElement(By.name("password")).sendKeys("Hello@12345678*");
		
		//Click on I'm not a robot
		//driver.findElement(By.id("recaptcha-anchor-label")).click();
		//driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
		
		//Click on Remember Me
		driver.findElement(By.className("form-check-input")).click();
				
		//Click on Login Button
		driver.findElement(By.xpath("//button[@id='login']")).click();
		
		driver.navigate().back();
		
		//Click on Create account
		//driver.findElement(By.xpath("//a[@class='small font-weight-bold']")).click();
		driver.findElement(By.linkText("Create account")).click();
		
		driver.manage().window().maximize();
		
		//Enter First name
		driver.findElement(By.xpath("//input[@id='inputFirstName']")).sendKeys("Pradnya");
		
		//Enter Last Name
		driver.findElement(By.xpath("//input[@id='inputLastName']")).sendKeys("Mule");
		
		//Enter Email ID
		driver.findElement(By.xpath("//input[@id='inputEmail']")).sendKeys("goodluck12345@gmail.com");
		
		//Enter Dial Code by Dynamic Drop Down
		driver.findElement(By.xpath("//*[@id=\"containerNewUserSignup\"]/div[1]/div/div/div[4]/div/div/div/div")).click();
		
		List<WebElement> countrynames = driver.findElements(By.xpath("//*[@id=\"containerNewUserSignup\"]/div[1]/div/div/div[4]/div/div/div/ul/li[102]/span[1]"));
		
		String getname = "India (भारत)";
		
		for (WebElement name : countrynames){
			System.out.println(name.getText());
			if(name.getText().equalsIgnoreCase(getname)) {
				name.click();
				break;
			}
		}
			
		//Enter phone Number
		driver.findElement(By.xpath("//input[@id='inputPhone']")).sendKeys("9867543610");
		
		//Enter Company Name
		driver.findElement(By.xpath("//input[@id='inputCompanyName']")).sendKeys("ANP CORP");
		
		//Enter Street Address
		driver.findElement(By.xpath("//input[@id='inputAddress1']")).sendKeys("Sr. no. 109, ANP ONE");
		
		//Enter Street Address 2
		driver.findElement(By.xpath("//input[@id='inputAddress2']")).sendKeys("Balewadi High St, near Cummins, Baner");
		
		//Enter City Name
		driver.findElement(By.xpath("//input[@id='inputCity']")).sendKeys("Baner, Pune");
		
		//Enter state Name
		driver.findElement(By.xpath("//input[@id='stateinput']")).sendKeys("Maharashtra");
		
		//Enter Postcode number
		driver.findElement(By.xpath("//input[@id='inputPostcode']")).sendKeys("411045");
		
		//Select Country by static drop down
		WebElement Staticdropdown = driver.findElement(By.xpath("//select[@id='inputCountry']"));
		
		Select country = new Select(Staticdropdown);
		
		country.selectByValue("IN");
		
		//Enter Additional Information Mobile Number
		driver.findElement(By.xpath("//input[@id='customfield2']")).sendKeys("9376865565");
		
		//Enter Password account security
		driver.findElement(By.xpath("//input[@id='inputNewPassword1']")).sendKeys("Hello@12345678*");
		
		//Enter confirm password 
		driver.findElement(By.xpath("//input[@id='inputNewPassword2']")).sendKeys("Hello@12345678*");
		
		//Click on Generate Password Button
		driver.findElement(By.xpath("//button[contains(text(), 'Generate Password')]")).click();
		
		//Set <String> object = driver.getWindowHandles();
		
		//Iterator<String> i = object.iterator();
		
		//String parentwindow = i.next();
		//String childwindow = i.next();
		
		//driver.switchTo().window(childwindow);
		
		//driver.close();
		
		//driver.switchTo().window(parentwindow);
		
		//Click on Close Button	
		driver.findElement(By.xpath("(//form[@id='frmGeneratePassword']//button)[4]")).click();
				
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
				
		driver.findElement(By.xpath("//*[@id=\"modalGeneratePassword\"]/div/div/div[1]/button/span")).click();
				
		System.out.println("Hello");
		
		
	}

}
