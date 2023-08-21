package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EntryAd {
	WebDriver driver;
	
	@FindBy(css = "a[href='/entry_ad']")
	WebElement linkEntryAd;
	
	@FindBy(css = "div[class='modal-footer']")
	WebElement linkClose;
	
	@FindBy(css = "a[id='restart-ad']")
	WebElement linkClickHere;
	
	
	
	public EntryAd(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void click_linkEntryAd() {
		linkEntryAd.click();
	}
	
	public void click_linkClose() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		    WebElement adPopup = wait.until(ExpectedConditions.visibilityOf(linkClose));
		    adPopup.click();
		} 
		
		catch (Exception e) {
		    e.printStackTrace();
		}
	}
	
	
	public void gettext_linkClickHere() {
		linkClickHere.click();
	}
	
	
	
	
	

}
