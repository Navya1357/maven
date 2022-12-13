package SampleTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

 
public class SampleLogin {

     @Test
public void startBrowser()
{
        String driverExecutablepath = "C:\\Navya\\Selenium\\Drivers\\chromedriver.exe";
        System.setProperty("Webdriver.edge.driver", driverExecutablepath);
       WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://opensource-demo.orangehrmlive.com/");
      Assert.assertTrue(driver.getCurrentUrl().contains("opensource-demo"),"URL Match");
}

 

}