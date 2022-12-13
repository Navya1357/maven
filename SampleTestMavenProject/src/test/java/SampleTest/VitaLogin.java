package SampleTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VitaLogin {
	@Test
	public void login () throws InterruptedException
	{	
	System.setProperty("webdriver.chrome.driver", "C:\\Navya\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://vita.westus2.cloudapp.azure.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div/div[1]/div/ng-component/div[1]/form/div[1]/input")).sendKeys("admin");		
	driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div/div[1]/div/ng-component/div[1]/form/div[2]/input")).sendKeys("123qwe");
	driver.findElement(By.xpath("/html/body/app-root/ng-component/div/div/div[1]/div/ng-component/div[1]/form/div[4]")).click();
    Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/app-root/ng-component/div/default-layout/div/div/div[2]/div[1]/div/div[3]/div/div[2]/div/user-menu/div/div[1]/span[1]/span[2]\r\n")).click();
	driver.findElement(By.xpath("/html/body/app-root/ng-component/div/default-layout/div/div/div[2]/div[1]/div/div[3]/div/div[2]/div/user-menu/div/div[2]/div[11]/a")).click();

	}
}