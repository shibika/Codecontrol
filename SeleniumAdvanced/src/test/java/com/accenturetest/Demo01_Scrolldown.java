package com.accenturetest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo01_Scrolldown {
	
	WebDriver d;
	
  @Test
  public void f() throws Exception {
	  
	  d.get("https://www.timesjobs.com/candidate/register.html");
	  d.manage().window().maximize();
	  JavascriptExecutor j = (JavascriptExecutor)d;
	  j.executeScript("window.scroll(0,800)");
	  j.executeScript("alert('Hi')");

  }
  
  @BeforeTest
  public void bforetest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\pdc2b-training.pdc2b\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  d = new ChromeDriver();
  }
  
}
