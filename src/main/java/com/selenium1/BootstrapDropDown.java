package com.selenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.webkitURL;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDropDown {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
//	url:"https://www.jquery-az.com/turn-a-bootstrap-dropdown-into-multi-select-button-by-jquery-dropdown-checkboxes/"
	driver.get("https://www.jquery-az.com/jquery/demo.php?ex=152.0_1");
	
	
	
}
public boolean selectCheckbox(WebDriver driver) {
	List<WebElement>list=driver.findElements(By.xpath(""));
	list.size();
	try {
	for(int i=0;i<list.size();i++) {
		if(list.get(i).isSelected()){
			
			return true;
		}else {
			return false;
		}
		
	}
	for(int i=0;i<list.size();i++) {
		if(list.get(i).getText() != null){	
		}else {
			return false;
		}
	}
	}catch (Exception e) {
		// TODO: handle exception
	}
	return true;
}
}
