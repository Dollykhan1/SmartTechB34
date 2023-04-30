package com.ny.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LonginTest {

	public static void main(String[] args) {
	
	
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationexercise.com/login");
		driver.manage().window().maximize();


		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("tanvirpatwary16@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Tester01");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
   
		// driver.close();
		// driver.quit();

	}
}
