package com.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementAndElements {

	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");

		// it will returns only one element
		// if the element is not present  in DOM Property at that time it will throws the no such element exception

//		WebElement tags_a=driver.findElement(By.tagName("a"));

		// it will returns list of webElements
		// if there is no element in DOM,It will returns the empty list,it doesn't throws any exceptions
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());

//		Navigations na = new Navigations();
//		na.getWebElement(null);
//		na.sendKeysElements(null, null, null);
//		na.getTitle();
		
		
		

		driver.quit();

	}

}
