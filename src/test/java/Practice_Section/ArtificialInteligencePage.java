package Practice_Section;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import Pages.Home_Page;

import resources.Base;

public class ArtificialInteligencePage extends Base {

	 public static Logger log = LogManager.getLogger(ArtificialInteligencePage.class.getName());

	@Test
	public void pageTitleVerify() throws IOException, InterruptedException {
		Home_Page page=new Home_Page(driver);
		menus(page.serviceMenu(),page.menuItem1(),"Hire Tech.us For Your Artificial Intelligence & ML - Tech.us");	
		log.info("Successfully verified ArtificialInteligence Page title");
		
}
	
}
