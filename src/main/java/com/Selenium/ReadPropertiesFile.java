package com.Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadPropertiesFile {
	public static void main(String[] args) throws FileNotFoundException {
		Properties prop = new Properties();
	
		FileInputStream fileip = new FileInputStream("C:\\Users\\kiran\\OneDrive\\Documents\\GitHub\\Helokiran\\Selenium\\src\\main\\java\\com\\Selenium\\config.properties");
	
	try {
		prop.load(fileip);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(prop.getProperty("browser"));
	System.out.println(prop.getProperty("Name"));
	System.out.println(prop.getProperty("gmail"));
	System.out.println(prop.getProperty("password"));
	
	boolean b=prop.isEmpty();
	System.out.println(b);
	
	
	String browsername=prop.getProperty("browser");
	
	if (browsername.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();//launch
		
	}else if (browsername.equals("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
	}
	}
	

}
