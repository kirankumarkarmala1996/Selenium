package com.Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ElementUtlities {
	static WebDriver driver;
	public WebElement getElemet(By locater) {
		 return driver.findElement(locater);
	}
	
	public boolean isdiaplay(By locater) {
		 return getElemet(locater).isDisplayed();
		}
	
	public boolean isEnable(By locater) {
	return	getElemet(locater).isEnabled();
	}
	
	public void clickOnCheckBox(By locater) {
		getElemet(locater).click();
	}
	
	public void doubleClickOnElement(By locater ,WebDriver driver) {
		
		Actions act = new Actions(driver);
		act.doubleClick();
		
	}
	
	public static void main(String[] args) {
		
	}

}
