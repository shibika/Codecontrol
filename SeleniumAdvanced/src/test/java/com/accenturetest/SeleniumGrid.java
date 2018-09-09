package com.accenturetest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SeleniumGrid {
	
	RemoteWebDriver d;
	
  @Test
  public void f() {
	  d.get("https://www.google.com");
  }
  
  @BeforeTest
  public void setup() throws Exception {
	 
	  //System.setProperty("webdriver.chrome.driver", "C:\\Users\\pdc2b-training.pdc2b\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  //d = new ChromeDriver();
	  
	  DesiredCapabilities dc= new DesiredCapabilities();
	  dc.setBrowserName("chrome");
	  dc.setPlatform(Platform.WINDOWS);
	  RemoteWebDriver d = new RemoteWebDriver(new URL("http://10.243.204.236:4343/wd/hub"),dc); //this is ipaddress of other machine and port also of thta machine where node is running. on this machine , hub shud not run as hub is running on my machine
	  
  }
}