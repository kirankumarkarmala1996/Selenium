package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandelFileUpload {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/file");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
//		to upload the files
		driver.findElement(By.id("avatar")).sendKeys("C:\\Users\\kiran\\OneDrive\\Desktop");
		
		
		
	}
	
	

}
