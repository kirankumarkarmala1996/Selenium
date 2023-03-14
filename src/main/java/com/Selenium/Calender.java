package com.Selenium;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {
	public static WebDriver driver;

	private static By Login = By.xpath("//input[@value='Login']");
	private static By calendermonth = By.name("slctMonth");
	private static By calenderyear = By.name("slctYear");

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		driver.get(
				"https://classic.freecrm.com/index.cfm?CFID=95888&CFTOKEN=60986621&jsessionid=b630eda7fa06ccde9ab36e705e6e626e625d");

		driver.findElement(By.name("username")).sendKeys("karmala");
		driver.findElement(By.name("password")).sendKeys("Admin1");
//		driver.findElement(By.xpath("//input[@value='Login']")).click();
		doClick(Login);

//		td[normalize-space()='2']
		// *[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]

		selectDate("6-December-2018");

	}

	public static void getWebelement(By locater) {
		driver.findElement(locater);
	}

	public static void doClick(By locater) {
		driver.findElement(locater).click();
	}

	public static void selectDate(String date) {
		String dateArr[] = date.split("-");
		String day = dateArr[0];
		String month = dateArr[1];
		String year = dateArr[2];

		driver.switchTo().frame("mainpanel");

		Select select = new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(month);

		Select select1 = new Select(driver.findElement(By.name("slctYear")));
		select1.selectByVisibleText(year);

		String Beforexpath = "//*[@id=\"crmcalendar\"]/table/tbody/tr[2]/td/table/tbody/tr[";
		String afterxpath = "]/td[";

		final int totalWeakDays = 7;
		String dayvalue =  null;

		boolean flag = false;
		for (int rowNUM = 1; rowNUM <= 6; rowNUM++) {
			for (int colNUM = 1; colNUM <= totalWeakDays; colNUM++) {
				try {
					 dayvalue = driver.findElement(By.xpath(Beforexpath + rowNUM + afterxpath + colNUM + "]"))
							.getText();
				} catch (NoSuchElementException e) {
					System.out.println("enter a correct date valaue");

				flag =false;
				break;
				}
//				System.out.println("dayvalue"+dayvalue);

//				when the value is not equal to the day, it will come out of the if condition and 
//				it will terminate the loop and it will also terminate the inner loop if condition

//				"so when I want to terminate the loop means when I select the specific value  
//				then flag will  become true after  that i will break the loop

				if (dayvalue.equals(day)) {
					driver.findElement(By.xpath(Beforexpath + rowNUM + afterxpath + colNUM + "]")).click();
					flag = true;
					break;

				}
			}

//			if we write the  use break directly it will directly terminate the loop and it will come out of the loop
			if (flag) {
				break;
			}
		}

	}

}
