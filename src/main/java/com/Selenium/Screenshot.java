package com.Selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);

		driver.get("https://jqueryui.com/droppable/");

		driver.switchTo().frame(0);

		Actions act = new Actions(driver);
		act.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable")))
				.release().build().perform();

		// Convert web driver object to TakeScreenshot (is interface)
		TakesScreenshot scrShot = ((TakesScreenshot) driver);// top casting the driver class into take screenshot
																// interface
//		TakeScreenshot file store in a File class
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
//		now copy the screenshot to desire location using copy file method
		FileUtils.copyFile(SrcFile, new File("C:\\Users\\kiran\\OneDrive\\Documents\\GitHub\\Helokiran\\Selenium/draganddrop.png"));

//						or else we can write like this

//	File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		
//	FileUtils.copyFile(SrcFile, new File("C:\\Users\\kiran\\OneDrive\\Documents\\GitHub\\Helokiran\\Selenium/draganddrop.png"));

	}

}
