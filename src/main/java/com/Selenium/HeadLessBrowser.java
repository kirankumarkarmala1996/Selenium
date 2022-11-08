package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowser {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

// by Using htmlUnitDriver it will not launch the browser
//	with out launch browser it will execute the test cases.

//This is one way to execute the head less browser
//	WebDriver driver = new HtmlUnitDriver();

//This is second way execute the headless browser
//	ChromeOptions chop= new ChromeOptions();
//	chop.addArguments("headless");
//	WebDriver driver = new ChromeDriver(chop);

//	This is the third way to execute the headless browser
		ChromeOptions chop = new ChromeOptions();
		chop.addArguments("headless");

		DesiredCapabilities dcp = new DesiredCapabilities();
		
		dcp.setCapability(ChromeOptions.CAPABILITY, chop);
		chop.merge(dcp);

		ChromeDriver driver = new ChromeDriver(chop);

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(45,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		String title = driver.getTitle();
		System.out.println(title);

	}
}
