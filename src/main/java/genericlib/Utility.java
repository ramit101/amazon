package genericlib;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {
	
	public static WebDriver driver;

	public void wbWait() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.visibilityOfAllElements(null))
	}
	
	/*generic method to handle popup*/
	
	public void alertPopup() {
		Alert al = driver.switchTo().alert();
		 
		//al.getText()
	}
}
