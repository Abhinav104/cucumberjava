package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BasicAuth {
	WebDriver driver;
	
	@FindBy(xpath = "//a[@href='/basic_auth']")
	WebElement linkBasicAuth;
	
	@FindBy(css = "div[class='example']>p")
	WebElement congText;
	
	String username = "admin";
	String password = "admin";
	String url = "https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth";
	String cong_msz_text = "Congratulations! You must have the proper credentials.";
	
	public BasicAuth(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickBasicAuthLink() {
		linkBasicAuth.click();
	}
	
	public void passAuthUrl() {
		driver.get(url);
	}
	
	public void validateCongText() {
		String actual_text = congText.getText();
		Assert.assertEquals(actual_text, cong_msz_text);
	}
	
	
 
}
