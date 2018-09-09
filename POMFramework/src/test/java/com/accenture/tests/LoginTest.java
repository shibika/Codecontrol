package com.accenture.tests;

import org.testng.annotations.Test;

import com.accenture.pages.HomePage;
import com.accenture.pages.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

public class LoginTest {
	
	WebDriver driver;
	HomePage h ; 
	LoginPage l;
	
  @Test
  public void logintest() {
	  driver.get("http://demowebshop.tricentis.com/");
	  h.clickLogin();
	  l.enterLoginData("shibika", "hjhjhj");
  }
 
  @BeforeTest
  public void beforetest() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pdc2b-training.pdc2b\\Desktop\\Selenium\\chrome driver\\chromedriver.exe");
	driver = new ChromeDriver();
	
	h= PageFactory.initElements(driver, HomePage.class);
	l= PageFactory.initElements(driver, LoginPage.class);
  }

}
