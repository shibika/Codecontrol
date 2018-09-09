package com.accenture.cucumbertests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	WebDriver driver;
	

@Given("^When I am on the Tricentis login page$")
public void when_I_am_on_the_Tricentis_login_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\pdc2b-training.pdc2b\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();
	
	//throw new PendingException();
}

@When("^I give abc and xyz$")
public void i_give_abc_and_xyz() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	System.out.println("Enter username and password");
    //throw new PendingException();
}

@When("^I click on login button$")
public void i_click_on_login_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("CLICK LOGIN BUTTON");
    //throw new PendingException();
}

@Then("^I should be able to login$")
public void i_should_be_able_to_login() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("login");
    //throw new PendingException();
}


}
