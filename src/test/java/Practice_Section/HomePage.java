package Practice_Section;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import resources.Base;

public class HomePage extends Base{
	

	@Test
	public void pageTitleVerify() {
		
		String page_Title=driver.getTitle();
		Assert.assertEquals(page_Title, "Hire Tech Experts For Your Software Projects - Tech.us");
		System.out.println("verified title Homepage");
	}
}