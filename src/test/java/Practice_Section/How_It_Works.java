package Practice_Section;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import resources.Base;

public class How_It_Works extends Base{
	@Test
	public void initialize() throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get(prop.getProperty("Url"));
		
		Actions action=new Actions(driver);
		WebElement menuoption=driver.findElement(By.xpath("//a[contains(text(),'How It Works')]"));
		action.moveToElement(menuoption).perform();
		WebElement option1=driver.findElement(By.xpath("//*[@id=\"header_how_it_works\"]"));
		option1.click();
		Thread.sleep(3000);	
		String page_Title=driver.getTitle();
		Assert.assertEquals(page_Title, "How It Works - Tech.us");
		System.out.println("verified totle how it works page");

}
}

