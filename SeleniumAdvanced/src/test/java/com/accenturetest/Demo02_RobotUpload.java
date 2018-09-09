package com.accenturetest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo02_RobotUpload {
	
	WebDriver d;
	
  @BeforeTest
  public void bforetest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\pdc2b-training.pdc2b\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  d = new ChromeDriver();
  }
 
  @Test
  public void RobotUpload() throws Exception {
  
	  d.get("https://www.timesjobs.com/candidate/register.html");
	  d.findElement(By.id("resumeFile_basic")).click();
	  
 
	  Robot r = new Robot();
	  setClipboarddata("C:\\shibika\\shibikanotepad.txt");
	  Thread.sleep(1000);
	  
	  r.keyPress(KeyEvent.VK_CONTROL);
	  r.keyPress(KeyEvent.VK_V);
	  
	  r.keyRelease(KeyEvent.VK_CONTROL);
	  r.keyRelease(KeyEvent.VK_V);
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);
	  
  }
  public void setClipboarddata(String s) {
	  StringSelection s1 = new StringSelection(s);
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);
  }
}
