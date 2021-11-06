package com.MavenGitJenkins1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NewTest {
	
  WebDriver driver;
  
  @Test
  public void googleLaunchTest() {
	  driver.get("https://www.google.com/");
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
