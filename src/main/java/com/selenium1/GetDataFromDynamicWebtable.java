package com.selenium1;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetDataFromDynamicWebtable {
	public static  WebDriver driver;
	
	public void dataFromDynamicWebTable(WebElement element,String value) {
		String beforeXpath="";
		String afterXpath ="";
		
		for(int i=0;i<=value.length();i++) {
			List<WebElement>tableValues=driver.findElements(By.xpath(beforeXpath+value+afterXpath));
			String dataText=tableValues.get(i).getText();
			System.out.println(dataText);
		
			assertEquals("abcd", dataText);
			
			if(dataText.contains("abcd")) {
//				driver.findElement(By.xpath(tagname["+i+"]remaining ))
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/");
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		List< WebElement> allHeaders=driver.findElements(By.id("//table[contains(@id,'cus')]//th"));
		
	System.out.println(allHeaders.size());
		
		for(WebElement ele:allHeaders) {
			String text=ele.getText();
			System.out.println(text);
		}
		
		
		
	}
	

}
