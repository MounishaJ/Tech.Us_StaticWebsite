package Practice_Section;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Home_Page;
import resources.Base;

public class Al_MLPage extends Base {
	
	Home_Page page=new Home_Page(driver);
	
	@BeforeTest
	public void Initialize() throws IOException
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("Url"));
		
	}
	@Test
	public void initialize() throws IOException, InterruptedException {
		Actions action=new Actions(driver);
		WebElement menuoption=page.Service_Menu();
		action.moveToElement(menuoption).perform();
		WebElement option1=page.MenuItem1();
		option1.click();
		Thread.sleep(3000);	
		String page_Title=driver.getTitle();
		Assert.assertEquals(page_Title, "Hire Tech.us For Your Artificial Intelligence & ML - Tech.us");
		System.out.println("verified title AI & MLPage");
}
	
@AfterTest
public void teardown()
{
	driver.close();
}
	
}
