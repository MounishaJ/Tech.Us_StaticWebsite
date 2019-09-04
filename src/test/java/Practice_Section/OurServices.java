package Practice_Section;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import resources.Base;

public class OurServices extends Base{
	@Test
	public void initialize() throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get(prop.getProperty("Url"));
		
		Actions action=new Actions(driver);
		WebElement menuoption=driver.findElement(By.xpath("//a[@title='Services']"));
		action.moveToElement(menuoption).perform();
		WebElement option1=driver.findElement(By.xpath("//span[contains(text(),'Our Services')]"));
		option1.click();
		Thread.sleep(3000);	
		String page_Title=driver.getTitle();
		Assert.assertEquals(page_Title, "Service Offerings - Tech.us");
		System.out.println("Verified page title Our services pages");

}
}
