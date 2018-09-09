package com.accenturetest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataDriven {
	WebDriver d;
	
  @Test
  public void dataExcel() throws Exception {
	  d.get("http://demowebshop.tricentis.com/");
	  FileInputStream fin = new FileInputStream("C:\\shibika\\test.xlsx");
	  XSSFWorkbook X = new XSSFWorkbook(fin);
	  XSSFSheet S = X.getSheet("Sheet1");
	  int rowcount = S.getLastRowNum();
	  for(int i=1 ; i<=rowcount ; i++)
	  {
		  String Username = S.getRow(i).getCell(0).getStringCellValue();
		  //System.out.println(Username);
		  String Password = S.getRow(i).getCell(1).getStringCellValue();
		  //System.out.println(Password);
		  
		  loginTest(Username,Password);
	  }
	  
		  try {
			d.findElement(By.linkText("Log out")).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
	  }
  
  
  @BeforeTest
  public void beforetest() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pdc2b-training.pdc2b\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	d = new ChromeDriver();
  }
  
  public void loginTest(String u,String p) {
	  
	  d.findElement(By.xpath(".//a[@href='/login']"));
	  d.findElement(By.xpath(".//input[@class='email']")).sendKeys(u);
	  d.findElement(By.xpath(".//input[@class='Password']")).sendKeys(p);
	  d.findElement(By.xpath(".//input[@class='button-1 login-button']")).click();
	  
  }
}
