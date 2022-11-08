package com.MouseOverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
	public WebDriver driver;
	public WebElement element;
	static Actions act;

	public ActionsClass(WebDriver driver, WebElement element) {
		super();
		this.driver = driver;
		this.element = element;
	}

	public void actions(String sourceelement, String targetelement) {
		new Actions(driver);
		act.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable")))
				.release().build().perform();
	}
	
	public void frames() {
		driver.switchTo();
	}

}
