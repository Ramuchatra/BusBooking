package projtest;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RydePage {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	@FindBy (xpath=("//a[text()='Ryde '] "))
	private WebElement rydeFlight;
	
	@FindBy (xpath=("(//div[text()='Airport Transfers'])[1]"))
	private WebElement flightBoard;
	
	@FindBy (xpath=("//object[@class='Bk0St1vF8dHt6obq7lwo']"))
	private WebElement flightFrame;
	
	@FindBy (xpath=("//div[@class='select-selected']"))
	private WebElement pickUpCity;
	
	@FindBy (xpath=("//div[text()='Pune']"))
	private WebElement pickUpCityStation;
	
	@FindBy (xpath=("//input[@id='locationTextFieldLocal']"))
	private WebElement destination;
	
	@FindBy (xpath=("(//div[@class='inputboxcontainerinactive'])[4]"))
	private WebElement dateOfFly;
	
	@FindBy (xpath=("(//button[@type='button'])[38]"))
	private WebElement dateOfjurney;
	
	@FindBy (xpath=("//span[text()='OK']"))
	private WebElement clickOnOk;
	
	@FindBy (xpath=("//input[@id='numberOfPax']"))
	private WebElement noOfPassanger;
	
	@FindBy (xpath=("//div[text()='PROCEED']"))
	private WebElement proccedFurther;
	
	@FindBy (xpath=("(//div[@class='slick-slide slick-active slick-current'])[2]"))
	private WebElement carFromRedBus;
	
	public RydePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		wait = new WebDriverWait (driver, 20);
	}
	
	public void rydeBooking()  {
	
		wait.until(ExpectedConditions.visibilityOf(rydeFlight));
		
		rydeFlight.click();
		
		flightBoard.click();
		flightFrame.click();
		driver.switchTo().frame(flightFrame);
		pickUpCity.click();
		pickUpCityStation.click();
		wait.until(ExpectedConditions.visibilityOf(destination));
		destination.sendKeys("Indore");
		destination.sendKeys(Keys.ARROW_DOWN);
      	wait.until(ExpectedConditions.visibilityOf(destination));
		destination.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOf(dateOfFly));
		dateOfFly.click();
		wait.until(ExpectedConditions.visibilityOf(dateOfjurney));
		dateOfjurney.click();
		clickOnOk.click();
		noOfPassanger.sendKeys("2");
		wait.until(ExpectedConditions.visibilityOf(proccedFurther));
		proccedFurther.click();
		//carFromRedBus.click();
		
	}
	

}
