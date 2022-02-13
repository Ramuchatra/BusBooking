package projtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedBusHeader 
{
	private WebDriver driver ;
	

   
   @FindBy (xpath="(//a[@class='D121_product_nav_a'])[2]")
   private WebElement ryde;
   
   @FindBy (xpath="(//a[@class='D121_product_nav_a'])[3]")
   private WebElement redRail;
   
   @FindBy (xpath="(//a[@class='D121_product_nav_a'])[4]")
   private WebElement rPool;
   
   public RedBusHeader(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
	   this.driver = driver;
   }
   
     
     public void rydeBook() {
    	 ryde.click();
  	    }
     
     public void redRailBook() {
    	 redRail.click();
  	    }
     
     public void cabBook() {
    	 rPool.click();
  	    }
}


