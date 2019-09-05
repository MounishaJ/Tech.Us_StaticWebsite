package Practice_Section;

import java.io.IOException;
import org.testng.annotations.Test;

import Pages.Home_Page;
import resources.Base;

public class HowItWorksPage extends Base{
	
	@Test
	public void pageTitleVerify() throws IOException, Exception{
		Home_Page page=new Home_Page(driver);
		menus(page.howitworkMenu(),page.menuItem01(),"How It Works - Tech.us");
		
}
}

