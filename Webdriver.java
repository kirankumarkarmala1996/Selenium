package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver {
	public static void main(String[] args) {
//		for firefox browser
		// System.setProperty("webdriver.gecko.driver",
		// "D://Testing//Selenium//Drivers//geckodriver.exe");

// To launch in chrome browser	
		// setup the chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launch the browser
		driver.manage().window().maximize();// maximize the browser
		driver.get("https://www.google.com/");// send the url
		String currentpagetitle = driver.getTitle();
//		validation point
		if (currentpagetitle.equals("Google")) {
			System.out.println(currentpagetitle);

		} else {
			System.out.println("the current page title is wrong");
		}

		String url = driver.getCurrentUrl();
		System.out.println(url);
		String dr = driver.getPageSource();
//		System.out.println(dr);
		Object dri = driver.getClass();
		System.out.println(dri);
		

	List<WebElement>allLinks=driver.findElements(By.tagName("a"));
	for(WebElement elm:allLinks) {
		System.out.println(elm.getText()+" "+elm.getAttribute("href"));
	}
	System.out.println("==================================");
	
	
//	driver.close();// it will close the current browser
	driver.quit();
	


	}

}
