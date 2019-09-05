package Practice_Section;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Home_Page;
import resources.Base;

public class SoftwareDevPage extends Base {
	
	@Test
	public void pageTitleVerify() throws IOException, InterruptedException {
		Home_Page page=new Home_Page(driver);
		menus(page.serviceMenu(),page.menuItem5(),"Hire Tech.us For Your Custom Software Development Projects - Tech.us");
		}
}
