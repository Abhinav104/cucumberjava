package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CheckBox {
	
	WebDriver driver;
	
	@FindBy(css = "a[href='/checkboxes']")
	WebElement checkboxLink;
	
	@FindBy(css = "input[type='checkbox']:checked")
	WebElement checkboxtwo;
	
	@FindBy(css = "input[type='checkbox']")
	WebElement checkboxone;
	
	public CheckBox(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickCheckboxLink() {
		checkboxLink.click();
	}
	
	public void checkboxTwoSelected() {
		Assert.assertTrue(checkboxtwo.isSelected(), "Check box is not selected");
		
	}
	
	public void Selectcheckboxone() {
		
		if(checkboxone.isSelected()==false) {
			
			checkboxone.click();
		}
	}

}
