package com.selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowser {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
//		System.setProperties("");

		// headless browser
		ChromeOptions option = new ChromeOptions();
//		window size
		option.addArguments("window-size=1400,800");
		option.addArguments("headless");
		WebDriver driver = new ChromeDriver(option);

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());

//		driver.findElement(By.xpath("")).sendKeys("Testingabc@gmail.com");
//		driver.findElement(By.xpath("")).sendKeys("Testing@123");
//		driver.findElement(By.xpath(null)).click();
	}
}
