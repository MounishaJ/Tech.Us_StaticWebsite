package Practice_Section;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pages.Home_Page;
import resources.Base;

public class HowItWorksPage extends Base{
	 public static Logger log = LogManager.getLogger(ArtificialInteligencePage.class.getName());
	// @BeforeSuite
	 public void beforetest() throws IOException
	 {
		 initializedriver();
	 }
	@Test
	public void pageTitleVerify() throws IOException, Exception{
		Home_Page page=new Home_Page(driver);
		menus(page.howitworkMenu(),page.menuItem01(),"How It Works - Tech.us");
		log.info("Successfully verified HowItWorks Page title");
}
	//@AfterSuite
	public void afterTest()
	{
		teardown();
	}
}

