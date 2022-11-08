package com.Selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandelsPopUp {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("");

		Set<String> window = driver.getWindowHandles();
		
		Iterator<String> it = window.iterator();
		String parentwindow = it.next();
		System.out.println(parentwindow);
		System.out.println("parent window title"+driver.getTitle());
		
		String childwindow = it.next();
		System.out.println(childwindow);
		System.out.println("child window title"+driver.getTitle());

		
//		driver.switchTo().window(childwindow);
		driver.switchTo().window(parentwindow);
		
		driver.close();
//		driver.quit();it will close the both the title of the windows
		
		driver.switchTo().window(childwindow);
	}

}
