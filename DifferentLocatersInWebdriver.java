package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DifferentLocatersInWebdriver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D://Testing//Selenium//Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.irctc.co.in/nget/profile/user-registration");
		Thread.sleep(2000);
//		WebElement button = driver.findElement(By.xpath("//button[contains(text(),'OK')]"));
//					button.click();
//		driver.findElement(By.id("//input[@id='userName']")).sendKeys("Kiran");
//		 driver.findElement(By.id("//input[@id='usrPwd']")).sendKeys("kiran123@");
//		 driver.findElement(By.id("//input[@id='cnfUsrPwd']")).sendKeys("kiran123@");
//		 driver.findElement(By.xpath("//div[@class='col-xs-12 inputBoxPad']//parent::div//div//div//div//div//parent::span[text()='English']")).sendKeys("kiran123@");
//		 
//				 
//		 Thread.sleep(3000);
		driver.quit();
	}

}
