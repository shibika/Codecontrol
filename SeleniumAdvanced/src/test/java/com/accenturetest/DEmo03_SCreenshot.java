package com.accenturetest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DEmo03_SCreenshot {
	
	WebDriver d;
	
  @Test
  public void f() throws Exception {
	  
	  d.get("https://www.timesjobs.com/candidate/register.html");
	  TakesScreenshot t = (TakesScreenshot)d;
	  File f = t.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(f, new File("C:\\Screenshots\\myscreenshot.jpg"));

  }
  
  @BeforeTest
  public void bforetest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\pdc2b-training.pdc2b\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  d = new ChromeDriver();
  }
  
}
