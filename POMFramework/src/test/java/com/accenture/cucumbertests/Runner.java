package com.accenture.cucumbertests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) // run with cucumber
@CucumberOptions(features="C:\\shibika\\gitrepos\\POMFramework\\src\\test\\java\\com\\accenture\\cucumbertests\\LoginTest.feature")
// given path for LoginTest.feature file (right click and Properties).. and this feature we need to execute

public class Runner {

	
}
