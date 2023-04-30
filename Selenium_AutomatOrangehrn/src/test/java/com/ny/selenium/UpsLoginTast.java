package com.ny.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpsLoginTast {
public static void main(String[] args) throws InterruptedException{
      //How to open a browser
	System.setProperty("webdriver.chrome.driver",".//driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.ups.com/login");
	driver.manage().window().maximize();
	driver.manage().window();
	Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='userID']")).sendKeys("qualityassurancebatch34");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("bangladesh");
	driver.findElement(By.xpath("(//button[@type='submit']")).click();
	driver.manage().deleteAllCookies();
	// driver.close();
	driver.manage().window();
	
	
	//Test Case-Login functionality check:
/*step  1: Open the automation exerclse.com page
 * step 3: Enter valid user name
 * Step 5: Enter valid password
 * Step 6: click login button 

 */	
}

}
