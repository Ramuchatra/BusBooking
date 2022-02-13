package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

import Base.Browser;

import projtest.RedBusHeader;
import projtest.RydePage;
import projtest.projclass;

public class RedtestNG extends Browser {
	
	private WebDriver driver;
	private int testID;
	private projclass redBusTicket;
	private RydePage rydebyflight;
	
	
	@BeforeTest
	@Parameters("browser")
	public void beforetest(String browser)
		{
		
		if (browser.equalsIgnoreCase("chrome"))
		{
			driver= Chrome();
		}
	
		if (browser.equalsIgnoreCase("edge"))
		{
			driver=Edge();
		}
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		}


	@BeforeClass
	
		public void beforeClass1() {
		
		 redBusTicket= new projclass(driver);
		 rydebyflight=new RydePage(driver);
		
		
			
	}
		
	@BeforeMethod
	
		public void beforeMethod1 () {
		driver.get("https://www.redbus.in/");
	

	}
		
	@Test
	
	
	
	public void  test1() {
	
		testID = 101;
		
		
		redBusTicket.bus();
		redBusTicket.departureCity();
		redBusTicket.departureStation();
		redBusTicket.destinationCity();
		redBusTicket.destinationStation();
		redBusTicket.journeyDate();
		redBusTicket.searchBus();
		
}
	
	@Test

	public void  test2() {
		testID = 102;
		
		
		rydebyflight.rydeBooking();
	}
	
	
	@AfterMethod
	
	public void afterMethod1() {
	System.out.println("working");	
	}
	
	@AfterClass
	
	public void afterClass1() {
		redBusTicket=null;
		rydebyflight=null;
    
		}
	
	
	@AfterTest
	 public void aftertest1()
	 {
		driver.close();
		driver= null;
		System.gc();
	 }
	
	
	

}

