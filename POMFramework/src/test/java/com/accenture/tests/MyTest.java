package com.accenture.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest {
  @Test
  public void loginTest() {
	  boolean ER= true;  // ER==Expected Result & AR== Actual Result
	  boolean AR= true;
	  
	  Assert.assertEquals(ER, AR);
  }
  @Test
  public void RegTEST() {
	  boolean ER= true;
	  boolean AR= false;
	  
	  Assert.assertEquals(ER, AR);
	  
  }
}
