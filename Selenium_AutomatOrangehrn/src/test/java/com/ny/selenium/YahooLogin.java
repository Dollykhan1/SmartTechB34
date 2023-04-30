package com.ny.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YahooLogin {

	public static void main(String[] args) throws InterruptedException {
	/*Test case: Login functionality:
		Step 1:Open the yahoo.com browser
		Step 2:Click the signing button
		Step 3:Enter valid user name
		Step 4:Click next button
		Step 5:Open Enter valid password
		Step 6:Click next button
		*/
//WebDriverManager.chromedriver().setup();	
System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
 WebDriver driver = new ChromeDriver();
driver.get("https://www.yahoo.com/");
driver.navigate().to("https://www.yahoo.com/"); 
driver.manage().window().maximize();
driver.manage().window().fullscreen();
driver.findElement(By.xpath("//a[@class='_yb_1u3fi']")).click();

driver.findElement(By.xpath("//input[@type='text']")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("dollykusa@yahoo.com");
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@type='submit']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("batch34/");
driver.findElement(By.xpath("//button[@id='login-signin']"));

	}

}
