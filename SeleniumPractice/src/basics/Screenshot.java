package basics;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Screenshot  {

                WebDriver driver;

                public void takeScreenShot(String str) throws Exception{

                                  SimpleDateFormat df=new SimpleDateFormat("yyyy_MMM_dd hh_mm_ss");

                                  Date d=new Date();

                                  String time=df.format(d);

                                  System.out.println(time);
                                  File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                                  FileUtils.copyFile(f, new File("G:\\Appium_workspace\\SeleniumPractice\\ScrennShots\\"+str+time+".png"));

                                 //File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

                                 // FileUtils.copyFile(f, new File("C:\\Users\\ssowjan1\\Desktop\\old laptop data\\eclipse-jee-oxygen-2-win32-x86_64\\eclipse\\javaprograms\\grabs\\"+str+time+".png"));        

                }

               

  @Test

  public void f() throws Exception {

                  driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div[2]/section/div/div/ul/li/a")).click();

                  driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div[2]/div/div/div/div[1]/section/ul/li[1]/button")).click();

                                //takeScreenShot("");

                                driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div[2]/div/div/div/div[1]/section/ul/li[2]/button")).click();

                                takeScreenShot("IMACLIENT");

                                 

  }

  @BeforeTest

  public void beforeTest() {

                  System.setProperty("webdriver.chrome.driver", "F:\\Java Softwares\\Drivers\\chromedriver.exe");

                                driver=new ChromeDriver();

                                driver.manage().window().maximize();

                                driver.get("https://www.optum.com");

                                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);        

                                //driver.findElement(By.className("fsrCloseBtn"));

                               

                                                               

  }

 

  @AfterTest

  public void afterTest() {

  }

 

}