import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessExecutionExample {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

        // Create ChromeOptions to run in headless mode
        ChromeOptions options = new ChromeOptions();
//        options.setHeadless(true); // Set headless mode to true
        
        // Create ChromeOptions to run in headless mode
        options.addArguments("--headless");

        // Initialize the WebDriver with the ChromeOptions
        WebDriver driver = new ChromeDriver(options);

        // Navigate to a web page
        driver.get("https://example.com");

        // Find and interact with web elements (e.g., perform clicks, extract text)
        WebElement element = driver.findElement(By.id("elementId"));
        element.click();

        // Perform additional test steps

        // Quit the WebDriver
        driver.quit();
    }
}
