package com.Selenium;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollingTable {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.get("https://www.geeksforgeeks.org/data-types-in-java/?ref=lbp");

		WebElement from_drop_down = driver.findElement(By.xpath("(//div[text()='Variables & DataTypes in Java'])[2]"));

		from_drop_down.click();

//		JavascriptExecutor  js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)", "");

		WebElement element = driver.findElement(By.xpath("(//table[@cellpadding='0'])[1]"));
		js.executeScript("arguments[0]. scrollIntoView();", element);
		
		
		

	}

}
