package com.accenturetest;

import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class Demo01_Action {
	
	WebDriver d;
	
  @Test
  public void demotest() {
  
	  d.get("http://demowebshop.tricentis.com/");
	  //Create actions class object and give d as a instance to Actions
	  Actions a = new Actions(d);
	  //for right click contextClick is used
	  //a.contextClick().build().perform();
	  WebElement email = d.findElement(By.id("Email"));
	  a.moveToElement(email).keyDown(email,Keys.SHIFT).sendKeys("SHIBIKA");
	   
  }
  
  @Test(enabled=false)
  public void robotest() throws Exception {
	  
	  Robot r = new Robot();
	  //For Pressing key
	  r.keyPress(KeyEvent.VK_WINDOWS);
	  //For releasing key
	  r.keyRelease(KeyEvent.VK_WINDOWS);
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\pdc2b-training.pdc2b\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  d = new ChromeDriver();
  }

}
