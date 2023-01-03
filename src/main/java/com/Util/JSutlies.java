package com.Util;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSutlies {
	static WebDriver driver;

	public void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);

		String bgcolor = element.getCssValue("backgroundcolor");

		for (int i = 0; i <= 10; i++) {
			changeColor("rgb(0,200,0)", element, driver);
			changeColor(bgcolor, element, driver);
		}
	}

	public void changeColor(String color, WebElement element, WebDriver driver) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundcolor='" + color + "'", element);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//to draw broder using JS
	public void drawbroder(WebDriver driver, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("argument[0].style.broder='3px solid green'", element);
	}

	// alert message
	public void generateAlertMessage(WebDriver driver, String message) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('" + message + "')");

	}

	// JS click
	public void clickElementByJS(WebDriver driver, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);

	}

	// refresh the page by selenium
//  	driver.navigate().refresh();

	// to refresh the page using JS
	public void refreshBrowserByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
	}

	// to get title
	public String toGetTitleByJS(WebDriver driver, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title;").toString();
		return title;

	}

	// to get page text
	public String getPageInnerText(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String pagetext = js.executeScript("return document.documentElement.innerText;").toString();
		return pagetext;
	}

//	to scroll the bottom of the page
	public void scrollDownPage(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

	}

	// scroll to view
	public void scrollIntoView(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	

	public static void main(String[] args) {

	}

}
