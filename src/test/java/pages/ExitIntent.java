package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExitIntent {
	
	WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Exit Intent']")
	WebElement linkExitIntent;
	
	@FindBy(css = "div[class='modal-footer']")
	WebElement linkClose;
	
	public ExitIntent(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickLinkExitIntent() {
		linkExitIntent.click();
	}
	
	public void moveCursor() throws AWTException {
		Robot robot = new Robot();
		
        int targetX = 100;  // Change to desired X coordinate
        int targetY = 100;  // Change to desired Y coordinate

        robot.mouseMove(targetX, targetY);
	}
	
	public void clickCloseBtn() {
		
        try {
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        	WebElement popup = wait.until(ExpectedConditions.elementToBeClickable(linkClose));
        	popup.click();
        			
        }
        
        catch(Exception e){
        	e.printStackTrace();
        }
	}

}
