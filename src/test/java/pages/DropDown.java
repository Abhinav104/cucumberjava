package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDown {
	
	WebDriver driver;
	
	@FindBy(css = "a[href='/dropdown']")
	WebElement linkDropDown;
	
	@FindBy(css = "select[id='dropdown']")
	WebElement dropdownBox;
	
	@FindBy(css = "option[value='2']")
	WebElement dropdownValue;
	
	public DropDown(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	
	
	public void click_dropdownlink() {
		linkDropDown.click();
	}
	
	public void click_DropdownBox() {
		dropdownBox.click();
	}
	
	public void selectDropdownValue() {
		Select dropdown = new Select(dropdownBox);
		dropdown.selectByVisibleText("Option 2");
	}
	
	public void validateDropdownSelection() {
		Select dropdown = new Select(dropdownBox);
		String dropdownText =dropdown.getFirstSelectedOption().getText();
		Assert.assertEquals(dropdownText, "Option 2", "Dropdown text didn't match");

	}

}
