package com.test.amazon;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	@BeforeSuite
	public void configBSuit() {

	}
	/**
	 * @author amit ranjan
	 * it will allow to launch the browser
	 */
	@BeforeClass
	public void configBClass() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
	}
	/**
	 * @author amit ranjan
	 * opening the application
	 */
	@BeforeMethod
	public void configBMethod() {
		driver.get("https://obstaclecourse.tricentis.com/Obstacles/22505/retry");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}		
	}
	@AfterMethod
	public void configAMethod() {

	}
	@AfterClass
	public void configAClass() {
		driver.close();
	}
}
