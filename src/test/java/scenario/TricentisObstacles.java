package scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.test.amazon.BaseClass;

public class TricentisObstacles extends BaseClass {

	@Test
	public void obstacle1() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Click me!']")).click();
		Thread.sleep(4000);
	    driver.findElement(By.xpath("//button[@class = 'confirm']")).click();		
	    Thread.sleep(4000);
	}

}
