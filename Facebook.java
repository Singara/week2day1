package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//===============================
		// step 1: Download the set path
		WebDriverManager.chromedriver().setup();
		// step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		// step 3:Load the URL http://en-gb.facebook.com
		driver.get("http://en-gb.facebook.com/");
		// step 4: Maximize the window
		driver.manage().window().maximize();
		// step 5: Add the implicit wait
		Thread.sleep(5000);
		// step 6: click the New Account Button
		driver.findElement(By.xpath("//a[@data-testid=\"open -registration-form-button\"]"));
		Thread.sleep(4000);
		// step 7:Enter the first name
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Singa");
		// step 8:Enter the last name
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("S");
		// step 9:Enter the mobile Number
		driver.findElement(By.xpath("//input[@name=\"reg-email_\"]")).sendKeys("8667225921");
		// step 10:Enter the password
		driver.findElement(By.xpath("//input[@name=\"reg_passwd_\"]")).sendKeys("password@2");
		// step 11: Handle all three drop Downs
		// DropDown1 Day
		WebElement day = driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));
		Select dayobj = new Select(day);
		dayobj.selectByIndex(25);
		//DropDown2 Month
		WebElement Month = driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
		Select Monthobj = new Select(Month);
		Monthobj.selectByIndex(5);
		//DropDown3
		WebElement year = driver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));
		Select yearobj = new Select(year);
		yearobj.selectByIndex(1995);
		
		// step 12: Select the radio button "male"
		// (  A normal click will do for this step)
		// Alternate xpath ://input[@name="Sex"][1]
		driver.findElement(By.xpath("//lable[text()=\"male\"]/following-sibling::input")).click();
		
		
		
		
		
		
				
		
		
	
		
	}

}
