package mvnPack;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Screenshot_Demo {
	
	@Test
	public void TestLogin() throws IOException {
	
	System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://www.facebook.com/");
	
	File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshotFile, new File("screenshots\\screenshot1.jpg"));
	
	driver.findElement(By.id("u_0_m")).sendKeys("Neha");
	
	driver.findElement(By.id("u_0_o")).sendKeys("Dixit");
	
	driver.findElement(By.id("u_0_r")).sendKeys("9999799019");
	
	driver.findElement(By.id("password_step_input")).sendKeys("abc@123");
	
	WebElement date = driver.findElement(By.id("day"));
	Select selectDate = new Select(date);
	selectDate.selectByVisibleText("11");
	
	WebElement month = driver.findElement(By.id("month"));
	Select selectMonth = new Select(month);
	selectMonth.selectByVisibleText("Oct");
	
	WebElement year = driver.findElement(By.id("year"));
	Select selectYear = new Select(year);
	selectYear.selectByVisibleText("1992");
	
	driver.findElement(By.id("u_0_6")).click();
	
	driver.findElement(By.xpath("//button[@id='u_0_12']")).click();
	
  }
	
}
