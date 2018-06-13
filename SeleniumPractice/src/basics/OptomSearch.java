package basics;

import org.testng.annotations.Test;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class OptomSearch {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"search\"]")).click();
	  driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("optum");
	  System.out.println("optum entered");
	  driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div[3]/div[2]/form/div/button/span[1]")).click();
	  System.out.println("clicked on search button");
	  Thread.sleep(5000);
	 /*
		  driver.findElement(By.xpath("/html/body/div[3]/div[5]/div/span/span[text()=\"No Thank You\"]")).click();
	 String alertmsg=driver.findElement(By.partialLinkText("No, th")).getText();
		//System.out.println(alertmsg);
	if(alertmsg.contains("No, thanks")) {
		
		
	}*/
	 
	/*if(driver.findElement(By.xpath("//div[@class='fsrFloatingMid']/div/a[@class='fsrCloseBtn']")).isEnabled());
	{
		driver.findElement(By.xpath("//div[@class='fsrFloatingMid']/div/a[@class='fsrCloseBtn']")).click();
	}*/
	  System.out.println("Alert accepted");  
	  System.out.println("------------------------------------------------------------------");
	  String results=driver.findElement(By.xpath("//span[@class=\"some\"]")).getText();
	  System.out.println(results);
	  System.out.println("------------------------------------------------------------------");
	 // String str=driver.findElement(By.xpath("//ul[@class='results unstyled']/li[1]/h2/a")).getText();
	 // System.out.println(str);
	  List<WebElement> searchItems=driver.findElements(By.className("results__item"));
	  System.out.println(searchItems.size());
	  //String resultoutput=searchItems.get(1).getText();
	 // System.out.println(resultoutput);
	  int count=1;
		while(count<=100) {  
	 for(int i=0;i<searchItems.size();i++) {
		
		 
		 System.out.println(searchItems.get(i).getText());
	 }
	 
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript("window.scrollBy(0,1300)");

			  
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//div[@id='pagination']/ul/li[3]/a[@class='pg-next-link']")).click();
	  Thread.sleep(4000);
       count++;
		}
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "G:\\Appium_workspace\\SeleniumPractice\\chromedriver.exe");

      driver=new ChromeDriver();

      driver.manage().window().maximize();

      driver.get("https://www.optum.com");

      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);    
  }

}
