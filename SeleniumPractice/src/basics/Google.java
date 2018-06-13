package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Google {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\Java Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://selenium4testing.com/hms");
		driver.findElement(By.name("username")).sendKeys("user1");
		driver.findElement(By.name("password")).sendKeys("user1");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Registration")).click();
		driver.findElement(By.linkText("Permanent Registration")).click();
		Thread.sleep(2000);
		new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Insurance");
		driver.findElement(By.name("image")).sendKeys("H:\\Photes\\share_it pics\\IMG_20170812_132936.jpg");
		System.out.println("it is a git repo");
        
	}

}
