package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderahandleByJS {
	public static WebDriver driver;

	private static By Login = By.xpath("//input[@value='Login']");
	private static By calendermonth = By.name("slctMonth");
	private static By calenderyear = By.name("slctYear");

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		driver.get(
				"https://classic.freecrm.com/index.cfm?CFID=95888&CFTOKEN=60986621&jsessionid=b630eda7fa06ccde9ab36e705e6e626e625d");

		driver.findElement(By.name("username")).sendKeys("karmala");
		driver.findElement(By.name("password")).sendKeys("Admin1");
//		driver.findElement(By.xpath("//input[@value='Login']")).click();
		doClick(Login);


//		  ((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value','28/02')", newElement);

	}

	public static void getWebelement(By locater) {
		driver.findElement(locater);
	}

	public static void doClick(By locater) {
		driver.findElement(locater).click();
	}
}
