package com.naukri.profile;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class UpdateProfileTest 
{

	@Test
	public void naukritest() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PERENNIAL-QA\\Desktop\\Gaurav\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		WebDriverWait wait1 = new WebDriverWait(driver,20);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='head']")));
		String username = "gaurav.burhade77@gmail.com";
		String pswd = "Lmessi@10";
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(pswd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Verify Profile
		WebDriverWait wait2 = new WebDriverWait(driver,30);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='user-name roboto-bold-text']")));
		driver.findElement(By.xpath("//div[@class='user-name roboto-bold-text']")).click();
		
        WebDriverWait wait3 = new WebDriverWait(driver,30);
        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//em[text()='Edit']")));
        driver.findElement(By.xpath("//input[@id='attachCV']")).sendKeys("C:\\Users\\PERENNIAL-QA\\Downloads\\Gaurav_Updated_Resume.doc");
        //upload.sendKeys("C:\\Users\\PERENNIAL-QA\\Downloads\\Gaurav_Updated_Resume.doc");
	    

		System.out.println("Success");
	  //  driver.close();

	}

}
	