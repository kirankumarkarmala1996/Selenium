package com.Base;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	
	
	public static void webdrivermanager() {
		WebDriverManager.chromedriver().setup();
	}

}
