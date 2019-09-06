package Practice_Section;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import resources.Base;

public class HomePage extends Base{
	 public static Logger log = LogManager.getLogger(ArtificialInteligencePage.class.getName());

	@Test
	public void pageTitleVerify() throws InterruptedException {
		
		String page_Title=driver.getTitle();
		Thread.sleep(2000);
		Assert.assertEquals(page_Title, "Hire Tech Experts For Your Software Projects - Tech.us");
		log.info("Successfully verified Home Page title");
	}
}