package BeforeTest_AfterTest_Annotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Annotations {
	
	/*
	 * @BeforeTest - methods under this annotation will be executed prior to the first test case in the TestNG file.
	 * 
	 * @AfterTest - methods under this annotation will be executed after all test cases in the TestNG file are executed.
	 * 
	 * @BeforeSuite: The annotated method will be run before all tests in this suite have run.



@AfterSuite: The annotated method will be run after all tests in this suite have run.

@BeforeTest: The annotated method will be run before any test method belonging to the classes inside the tag is run.

@AfterTest: The annotated method will be run after all the test methods belonging to the classes inside the tag have run.

@BeforeGroups: The list of groups that this configuration method will run before. This method is guaranteed to run shortly before the first test method that belongs to any of these groups is invoked.

@AfterGroups: The list of groups that this configuration method will run after. This method is guaranteed to run shortly after the last test method that belongs to any of these groups is invoked.

@BeforeClass: The annotated method will be run before the first test method in the current class is invoked.

@AfterClass: The annotated method will be run after all the test methods in the current class have been run.

@BeforeMethod: The annotated method will be run before each test method.

@AfterMethod: The annotated method will be run after each test method.

@Test: The annotated method is a part of a test case


	 */
	
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "C:\\geckodriver.exe";
    public WebDriver driver ; 
    
    @BeforeTest
    public void beforeTest() {
  	  
  	  System.out.println("launching chrome browser"); 
        System.setProperty("webdriver.chrome.driver", "/Users/Diego/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }
    
  @Test
  public void launchBrowser() {
	  
	  String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }
  
  // THE PLACEMENT OF ANNOTATIONS CAN BE INTERCHANGED WITHOUT AFFECTING THE CHRONOLOGICAL ORDER BY WHICH THEY WILL BE EXECUTED 
  
  // EXAMPLE
  
//  public String baseUrl = "http://demo.guru99.com/test/newtours/";
//  String driverPath = "C:\\geckodriver.exe";
//  public WebDriver driver ; 
//   @AfterTest                            //Jumbled
//    public void terminateBrowser(){
//        driver.close();
//    }
//   @BeforeTest                            //Jumbled
//    public void launchBrowser() {
//        System.out.println("launching firefox browser"); 
//        System.setProperty("webdriver.gecko.driver", driverPath);
//        driver = new FirefoxDriver();
//        driver.get(baseUrl);
//    }
//    @Test                                //Jumbled
//    public void verifyHomepageTitle() {
//        String expectedTitle = "Welcome: Mercury Tours";
//        String actualTitle = driver.getTitle();
//        Assert.assertEquals(actualTitle, expectedTitle);
//   }

}
