package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Base;

public class Home_Page extends Base{
	
	
	@FindBy(xpath="//a[@title='Services']")
	public WebElement menulink1;
	
	@FindBy(xpath="//a[contains(text(),'How It Works')]")
	public WebElement menulink2;
	
	@FindBy(xpath="//a[contains(@title,'Clients')]")
	public WebElement menulink3;
	
	@FindBy(xpath="//a[@id='header_pricing']")
	public WebElement menulink4; 
	
	@FindBy(xpath="//a[@id='header_contact']")
	public WebElement menulink5;
	
	@FindBy(xpath="//*[@id='header_how_it_works']")
	public WebElement menuitem01;
	
	@FindBy(xpath="//*[@id='header_faqs']")
	public WebElement menuitem02;
	
	@FindBy(xpath="//span[contains(text(),'Clients')]")
	public WebElement menuitem001;
	
	@FindBy(xpath="//span[contains(text(),'Testimonials')]")
	public WebElement menuitem002;
	
	@FindBy(xpath="//span[contains(text(),'Artificial Intelligence & ML')]")
	public WebElement menuitem1;
	
	@FindBy(xpath="//span[contains(text(),'Dedicated Development Team')]")
	public WebElement menuitem2;
	
	@FindBy(xpath="//span[contains(text(),'Mobile App Development')]")
	public WebElement menuitem3;
	
	@FindBy(xpath="//span[contains(text(),'Our Services')]")
	public WebElement menuitem4;
	
	@FindBy(xpath="//span[contains(text(),'Custom Software Development')]")
	public WebElement menuitem5;
	
	@FindBy(xpath="//span[contains(text(),'Software Modernization')]")
	public WebElement menuitem6;
	
	@FindBy(xpath="//span[contains(text(),'Web & Cloud Applications')]")
	public WebElement menuitem7;
	
	public Home_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement serviceMenu()
	{
		return menulink1;
	}
	
	public WebElement menuItem1()
	{
		return menuitem1;
	}

	public WebElement menuItem2()
	{
		return menuitem2;
	}

	public WebElement menuItem3()
	{
		return menuitem3;
	}
	public WebElement menuItem4()
	{
		return menuitem4;
	}
	public WebElement menuItem5()
	{
		return menuitem5;
	}
	public WebElement menuItem6()
	{
		return menuitem6;
	}
	public WebElement menuItem7()
	{
		return menuitem7;
	}
	public WebElement howitworkMenu()
	{
		return menulink2;
	}
	public WebElement menuItem01()
	{
		return menuitem01;
	}
	public WebElement menuItem02()
	{
		return menuitem02;
	}
	public WebElement clientMenu()
	{
		return menulink3;
	}
	public WebElement menuItem001()
	{
		return menuitem001;
	}
	public WebElement menuItem002()
	{
		return menuitem002;
	}
	
	public WebElement pricingMenu()
	{
		return menulink4;
	}
	public WebElement contactMenu()
	{
		return menulink5;
	}
}
