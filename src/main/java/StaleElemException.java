import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElemException {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String project_path =System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", project_path+"/src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");
		
		//Method 1: Retry Mechanism
		int maxAttempts = 3;
		int attempts = 0;
		WebElement element = null;

		while (attempts < maxAttempts) {
		    try {
		        element = driver.findElement(By.id("elementId"));
		        // Perform an action on the element (e.g., click)
		        element.click();
		        break; // Break the loop if the action is successful
		    } catch (StaleElementReferenceException e) {
		        // Element is stale; retry after a short delay
		        attempts++;
		        Thread.sleep(1000); // Add a delay before retrying
		    }
		}
		
		//Method 2 Refreshing the page
		
		try {
		    // Perform an action on the element (e.g., click)
		    element.click();
		} catch (StaleElementReferenceException e) {
		    // Refresh the page and re-locate the element
		    driver.navigate().refresh();
		    element = driver.findElement(By.id("elementId"));
		    // Perform the action again
		    element.click();
		}



	}

}
