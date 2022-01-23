package scenario;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.test.amazon.BaseClass;

public class PrintTrendingDeals extends BaseClass {
	
	@Test()
	public void test1() {
		List<WebElement> lst = driver.findElements(By.xpath("//h2[text()='Trending deals']/parent::div/following-sibling::div/div//span[@class='a-price-whole']"));
		for(WebElement ele : lst) {
			System.out.println(ele.getText());
		}
	}
}
