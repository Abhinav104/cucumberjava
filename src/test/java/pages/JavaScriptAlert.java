package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavaScriptAlert {
	WebDriver driver;
	
	@FindBy(css = "a[href='/context_menu']")
	WebElement linkContextMenu;
	
	@FindBy(css = "div[id='hot-spot']")
	WebElement sqBox;
	
	public JavaScriptAlert(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void click_linkContextMenu() {
		linkContextMenu.click();
	}
	
	public void rightClickSqBox() {
		Actions action = new Actions(driver);
		action.contextClick(sqBox).perform();
	}
	
	public void acceptAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	
	
	

}
