package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSelenium {
public static void main(String[] args) {
	// To build a reltionship between selenium and driven file
	// To open a chrome browser
	ChromeDriver driver = new ChromeDriver();
	// To lead url to the browser
	driver.get("http://leaftaps.com/opentaps/control/main");
	// To maximize the browser
	driver.manage().window().maximize();
	// Trying to find the element
    WebElement elementUsername = driver.findElement(By.id("username"));
	elementUsername.sendKeys("Democsr");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSumit")).click();
	driver.findElement(By.partialLinkText("CRM/SFA")).click();
	// To close browser
	driver.close();
	
	
	
	
	
	
}
		
	}


