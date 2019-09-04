package Practice_Section;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import resources.Base;

public class ClientsPage extends Base {
	@Test
	public void initialize() throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get(prop.getProperty("Url"));
		
		Actions action=new Actions(driver);
		WebElement menuoption=driver.findElement(By.xpath("//a[contains(@title,'Clients')]"));
		action.moveToElement(menuoption).perform();
		WebElement option1=driver.findElement(By.xpath(" //span[contains(text(),'Clients')]"));
		option1.click();
		Thread.sleep(3000);	
		String page_Title=driver.getTitle();
		Assert.assertEquals(page_Title, "1,350+ Successful Projects and Counting...");
		System.out.println("verified title Clients page");


}//span[contains(text(),'Testimonials')]
}