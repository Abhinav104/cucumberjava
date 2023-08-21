package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DragAndDrop {
	
	WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Drag and Drop']")
	WebElement linkDragDrop;
	
	@FindBy(id = "column-a")
	WebElement sourceEle;
	
	@FindBy(id = "column-b")
	WebElement targetEle;
	
	String exp_txt = "A";
	
	public DragAndDrop(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickDragdropLink() {
		linkDragDrop.click();
	}
	
	public void dragdropOperations(){
		Actions action = new Actions(driver);
		action.dragAndDrop(sourceEle, targetEle).build().perform();
//		action.clickAndHold(sourceEle).moveToElement(targetEle).release(targetEle).build().perform();
//		Thread.sleep(5000);
	}
	
	public void assertDragDrop() {
		String act_txt = targetEle.getText();
		System.out.println(act_txt);
		Assert.assertEquals(act_txt, exp_txt, "Text does not match");
	}

}

