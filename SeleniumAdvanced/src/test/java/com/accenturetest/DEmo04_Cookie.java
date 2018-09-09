package com.accenturetest;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DEmo04_Cookie {
	
	WebDriver d;
	
  @Test
  public void f() throws Exception {
	  
	  d.get("http://demowebshop.tricentis.com/");
	  d.manage().window().maximize();
	  Cookie c = new Cookie("User","Tricentis"); // user is propert and Tricentis is method
	  d.manage().addCookie(c);
	  Set<Cookie> cookiesDetails = d.manage().getCookies();// as getcookies has retrurn type as Set Cookie, hence writtenas Set in starting
	  for(Cookie s:cookiesDetails)
	  {
		  System.out.println(s.getExpiry());
		  System.out.println(s.getName());
		  System.out.println(s.getDomain());
	  }
  }
  
  @BeforeTest
  public void bforetest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\pdc2b-training.pdc2b\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  d = new ChromeDriver();
  }
  
}
