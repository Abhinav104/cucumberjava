import java.awt.Window;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class SeleniumCom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String project_path = System.getProperty("user.dir"); //This will get the location of main project folder Cucumber Java
		System.setProperty("webdriver.chrome.driver", project_path+"/src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.getCurrentUrl();
		driver.getPageSource();
		driver.getTitle();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		
		driver.navigate().to("");
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
		
		WebElement testEle = driver.findElement(By.id(""));                    
		wait.until(ExpectedConditions.elementToBeClickable(testEle));
		
		
        // Switch to a frame by index (0-based)
        driver.switchTo().frame(0);
     // Now you can interact with elements inside the frame
        driver.switchTo().defaultContent();
        
        // Switch to a frame by name or id (if the frame has a name or id attribute)
        driver.switchTo().frame("frameName");
        
        // Switch to an iframe by locating it using a locator
        WebElement iframeElement = driver.findElement(By.id("iframeId"));
        driver.switchTo().frame(iframeElement);
        
        
        // Handling Alerts:
        Alert alert = driver.switchTo().alert();
        alert.accept();
        alert.dismiss();
        String alertText = alert.getText();  //Get Alert Text (Retrieve the Text from the Alert)
        alert.sendKeys("Your input text"); //Enter Text into the Alert (for Prompt Alerts):
        driver.switchTo().defaultContent();
        
        driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();
        driver.switchTo().defaultContent();
        
        //Right Click operation is also called Context Click in Selenium.
        Actions actions = new Actions(driver);
        WebElement elementLocator = driver.findElement(By.id("ID"));
        actions.contextClick(elementLocator).perform();
        
        // Send the character using the keyboard
        actions.sendKeys("character").build().perform();
        
        
       
        WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement test = driver.findElement(By.id(""));
        waits.until(ExpectedConditions.elementToBeClickable(test));
        waits.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id(""))));
        
        
        try {
        	WebDriverWait waiit = new WebDriverWait(driver, Duration.ofSeconds(10));
        	waiit.until(ExpectedConditions.elementToBeClickable(By.className("demo")));
        	WebElement wb = driver.findElement(By.id("demo wb"));
        	waiit.until(ExpectedConditions.elementToBeClickable(wb));
        	
        }
        
        catch(Exception e) {
        	e.printStackTrace();
        	e.printStackTrace();
        	System.out.println("An exception occured "+e.getMessage());
        	
        }
        
        
        ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());
        
        driver.switchTo().window(windows.get(1));
         
        String parentWindow = driver.getWindowHandle();
        driver.switchTo().window(parentWindow);
        
        
        String parentWindowHandle = driver.getWindowHandle(); // Store the parent window handle
        Set<String> windowHandles = driver.getWindowHandles(); //to get a set of all currently open window handles.


        // Switch to the parent window
        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(parentWindowHandle)) {
                driver.switchTo().window(parentWindowHandle);
                break;
            }
        }
        
        //Handling Dropdown
        WebElement dd_box = driver.findElement(By.id(""));
        Select dd = new Select(dd_box);
        dd.selectByValue("");
        dd.selectByVisibleText("");
        dd.selectByIndex(0);

        //Scroll to element
        actions.moveToElement(dd_box);
        actions.perform();
        
	}
	
	

}
