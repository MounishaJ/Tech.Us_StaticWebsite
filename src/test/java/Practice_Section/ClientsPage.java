package Practice_Section;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import Pages.Home_Page;
import resources.Base;

public class ClientsPage extends Base {
	 public static Logger log = LogManager.getLogger(ArtificialInteligencePage.class.getName());
	@Test
	public void pageTitleVerify() throws IOException, InterruptedException {
		Home_Page page=new Home_Page(driver);
		menus(page.clientMenu(),page.menuItem001(),"1,350+ Successful Projects and Counting...");	
		log.info("Successfully verified clients Page title");


}}