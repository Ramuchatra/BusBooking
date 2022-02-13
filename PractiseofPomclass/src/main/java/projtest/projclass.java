package projtest;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class projclass {
	
	private WebDriverWait wait;
		
	private Actions act ;

	private WebDriver driver;
	
	@FindBy (xpath = "//a[@id='redBus']")
	private WebElement searchForRedBus ; 
	
	@FindBy (xpath = "//input[@id='txtSource']")
	private WebElement fromCity ;
	
	@FindBy (xpath = "//li[@class='C120_slist-item C120_suggestion-active']")
	private WebElement fromCityName ;
	
	@FindBy (xpath = "(//input[@type='text'])[2]")
	private WebElement toCity ;
	
	@FindBy (xpath = "//li[text()='Vijay Nagar, ']")
	private WebElement toCityName  ;
	
	@FindBy (xpath = "//input[@id='txtOnwardCalendar']")
	private WebElement dateOfJourney  ;
	
	@FindBy (xpath = "//button[text()='Search Buses']")
	private WebElement searchForBus  ;
	
	public projclass (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		wait= new WebDriverWait(driver,3);
		act	= new Actions(driver);
		this.driver = driver;
	}
	
	public void bus ()
	{

		searchForRedBus.click();
	}
	
	public void departureCity ()
	{
	//	wait.until(ExpectedConditions.visibilityOf(fromCity));
		fromCity.sendKeys("Pune");
		fromCity.sendKeys(Keys.ARROW_DOWN);
		fromCity.sendKeys(Keys.ENTER);
	}
	
	public void departureStation ()
	{
		//wait.until(ExpectedConditions.visibilityOf(fromCityName));
		fromCityName.click();
		
		//act.moveToElement(fromCityName).build().perform();
	}
	
	public void destinationCity ()
	{
		//wait.until(ExpectedConditions.visibilityOf(toCity));
		
		toCity.sendKeys("Indore");
	}
	
	public void destinationStation ()
	{
		toCityName.click();
		//act.moveToElement(toCityName).build().perform();
	}
	
	public void journeyDate ()
	{
		dateOfJourney.sendKeys("25/02/2022");
	}
	
	public void searchBus()
	{
		searchForBus.click();
	}

	
	
}
