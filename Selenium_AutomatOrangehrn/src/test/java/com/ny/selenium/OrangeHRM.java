package com.ny.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args)throws InterruptedException{	
	
		
		System.setProperty("webdriver.chrome.driver",".//driver/chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		
		Driver.get("https://opensource-demo.orangehrmlive.com");
		Driver.manage().window().maximize();
		Thread.sleep(3000);
		Driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	
		Thread.sleep(3000);
		Driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(3000);
		
		Driver.findElement(By.xpath("//button[@type='usernamesubmit']")).click();
		Driver.manage().deleteAllCookies();
		
		
		//Driver.close();//all browser support driver.close()as well as driver.quit
	//	Driver.quit();//IE browser dose not support "driver.quit()"
	//	Driver.manage().window().maximize();
	}
	}
	


