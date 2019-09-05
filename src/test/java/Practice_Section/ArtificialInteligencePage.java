package Practice_Section;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Home_Page;
import resources.Base;

public class ArtificialInteligencePage extends Base {

	//Home_Page page;

	@Test
	public void pageTitleVerify() throws IOException, InterruptedException {
		Home_Page page=new Home_Page(driver);
		menus(page.serviceMenu(),page.menuItem1(),"Hire Tech.us For Your Artificial Intelligence & ML - Tech.us");	
		
		
}
	
}
