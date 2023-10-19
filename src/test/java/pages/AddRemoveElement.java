package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRemoveElement {
	WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Add/Remove Elements']")
	WebElement addremovelink;
	
	@FindBy(xpath = "//button[@onclick='addElement()']")
	WebElement btn_add_element;
	
	@FindBy(xpath = "//button[@onclick='deleteElement()']")
	WebElement btn_delete;
	
//	By searchButtonLocator = By.id("searchButton");
	
	//Creating contructor: It is func with same class name and does not have return type
	
    public AddRemoveElement(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	public void clickAddRemoveLink() {
		addremovelink.click();
	}
	
	public void clickAddElement() {
		btn_add_element.click();
	}
	
	public void clickDelete() {
		if(btn_delete.isDisplayed()==true) {
			btn_delete.click();
			driver.close();
		}
	}
	
	

}
