package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import projtest.RedBusHeader;
import projtest.RydePage;
import projtest.projclass;

public class RedBusProject {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		
		
		projclass redBusTicket= new projclass(driver);
		redBusTicket.bus();
		redBusTicket.departureCity();
		redBusTicket.departureStation();
		redBusTicket.destinationCity();
		redBusTicket.destinationStation();
		redBusTicket.journeyDate();
		redBusTicket.searchBus();
		
		
		RydePage ryde=new RydePage(driver);
		ryde.rydeBooking();
		
		RedBusHeader redbusheaderline=new RedBusHeader(driver);
		redbusheaderline.redRailBook();
		
	}

}
