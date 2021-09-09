package First_TestNG;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTestNGFile {
	
	// Source: https://www.guru99.com/all-about-testng-and-selenium.html
	
	/*
	 * Test: Find title and check if title is correct
	 * 
	 * Notice: 
	 * 
	 * 	- 	TestNG does not require you to have a main() method.
	 * 	- 	Methods need not be static.
	 * 	- 	We used the @Test annotation. @Test is used to tell that the method under it is a test case. 
	 * 		In this case, we have set the verifyHomepageTitle() method to be our test case, so we placed an ‘@Test’ annotation above it.
	 * 
	 * 	-	Since we use annotations in TestNG, we needed to import the package org.testng.annotations.*.
	 *  - 	We used the Assert class. The Assert class is used to conduct verification operations in TestNG.
	 *  	To use it, we need to import the org.testng.Assert package.
	 *  
	 *  CHECKING GENERATED HTML REPORT
	 *  
	 *  1)	 After running our FirstTestNGFile that we created in the previous section, 
	 *  	right-click the project name (FirstTestNGProject) in the Project Explorer window then click on the “Refresh” option.
	 *  
	 *  2) 	Notice that a “test-output” folder was created. Expand it and look for an index.html file. 
	 *  	This HTML file is a report of the results of the most recent test run.
	 *  
	 *  3) 	Double-click on that index.html file to open it within Eclipse’s built-in web browser. 
	 *  	You can refresh this page any time after you rerun your test by simply pressing F5 just like in ordinary web browsers.
	 *  
	 *  PARAMETERS
	 *  
	 *  If you want your methods to be executed in different order, use the parameter "priority"
	 *  (Parameters are keywords that modify the annotation's function.)
	 *  
	 *  	- Parameters require you to assign a value to them. You do.this by placing a “=” next to them, and then followed by the value.
	 *  	- Parameters are enclosed in a pair of parentheses which are placed right after the annotation like the code snippet shown below.
	 *  
	 *  MULTIPLE PARAMETERS 
	 *  
	 *  Aside from “priority,” @Test has another parameter called “alwaysRun” which can only be set to either “true” or “false.”
	 *  
	 *  	- To use two or more parameters in a single annotation, separate them with a comma
	 *  
	 *  EXAMPLE @HomerSimpson (priority = donuts, alwaysRun = towardsBeer)
	 */
	
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	
	String driverPath = "/Users/Diego/Downloads/chromedriver";
	
	public WebDriver driver;
	
  @Test
  public void verifyHomepageTitle() {	
	  
	  System.out.println("launching chrome browser");
	  
	  System.setProperty("webdriver.chrome.driver", driverPath);
	  
	  driver = new ChromeDriver();
	  
	  driver.get(baseUrl);
	  
	  String expectedTitle = "Welcome: Mercury Tours";
	  
	  String actualTitle = driver.getTitle();
	  
	  assertEquals(expectedTitle, actualTitle);
	  
	  driver.quit();
  }
  
  /*
   * CONCLUSION: (after viewing annotations)
   * 
   * - TestNG is a testing framework that is capable of making Selenium tests easier to understand and of generating reports that are easy to understand.
   * - The main advantages of TestNG over JUnit are the following.
   * - Annotations are easier to use and understand.
   * - Test cases can be grouped more easily.
   * - TestNG allows us to create parallel tests. OJO -> https://www.guru99.com/parallel-testing.html
   * 
   * - The Console window in Eclipse generates a text-based result while the TestNG window is more useful 
   * 	because it gives us a graphical output of the test result plus other meaningful details such as:
   * 		Runtimes of each method.
   * 		The chronological order by which methods were executed
   * 
   * - TestNG is capable of generating HTML-based reports.
   * - Annotations can use parameters just like the usual Java TestNG methods.
   * - TestNG Dataprovider is a way to pass parameters into the test function which passes different values in test cases in a single execution.
   * 
   */
}
