package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigations {
	public static WebDriver driver;

	public WebElement getWebElement(By Locater) {
		WebElement ele = driver.findElement(Locater);
		return ele;
	}

	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public  static WebElement sendKeysElements(By Locater, String username, String Password) {
		WebElement element = driver.findElement(Locater);
							element.sendKeys(username,Password);
							
				return element;
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");// it will use to wait until page will load & it will go for next action
//		String pagetitle = driver.getTitle();
////		System.out.println(pagetitle);
//
//		if (pagetitle.equals("Amazon.com. Spend less. Smile more.")) {
//			System.out.println(pagetitle);
//		} else {
//			System.out.println("page title is wrong");
//		}

		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com/");// it won't to wait until page will load just it will navigate
														// to another page

		driver.navigate().back();// amazon

		Thread.sleep(2000);
		driver.navigate().forward();// google

//		driver.navigate().refresh();
//		int num = driver.navigate().hashCode();
//		driver.navigate().notify();
//		driver.navigate().wait();
//		driver.navigate().wait(2000);
//		driver.navigate().wait(2000, 25);
//		driver.navigate().to("");// String url
//		driver.navigate().toString();

//		using webelement we can send the value
		WebElement elements = driver.findElement(By.cssSelector(""));
		elements.sendKeys("");

//		using By Locater
		By xpathvalue = By.xpath("");

		Navigations.sendKeysElements(xpathvalue, null, null);
		
	}
}
