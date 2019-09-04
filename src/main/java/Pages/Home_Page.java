package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import resources.Base;

public class Home_Page extends Base{
	
	
	@FindBy(xpath="//a[@title='Services']")
	public WebElement linktext;
	
	@FindBy(xpath="//span[contains(text(),'Artificial Intelligence & ML')]")
	public WebElement menuitem1;
	
	
	
	
	
	
	
	public Home_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}
	public WebElement Service_Menu()
	{
		return linktext;
	}
public WebElement MenuItem1()
{
	return menuitem1;
}
}
