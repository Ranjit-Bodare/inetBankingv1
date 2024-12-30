package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	
public String baseURL="https://demo.guru99.com/V1/index.php";
public String username="mngr581374";
public String passward="ytYtuta";
public static WebDriver driver;

@BeforeClass
public void setup() {
	System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\ranji\\OneDrive\\Desktop\\Automation work\\inetBankingv1\\Drivers\\chromedriver.exe");
}

}
