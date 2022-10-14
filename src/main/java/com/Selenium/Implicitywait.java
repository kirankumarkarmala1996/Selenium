package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implicitywait{
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(25,TimeUnit.SECONDS);
		driver.get(" https://www.google.com/");
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(2000);
		
		driver.navigate().back();
		driver.navigate().to("https://www.flipkart.com/");


		
		
	}

}
