import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckButtonDisabled {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver instance (open Chrome browser)
        WebDriver driver = new ChromeDriver();

        // Navigate to a web page
        driver.get("https://example.com");

        // Locate the button element by its locator (XPath, CSS selector, etc.)
        WebElement button = driver.findElement(By.id("buttonId"));

        // Get the value of the "disabled" attribute
        String disabledAttribute = button.getAttribute("disabled");

        // Check if the button is disabled
        if (disabledAttribute != null && (disabledAttribute.equals("true") || disabledAttribute.equals(""))) {
            System.out.println("The button is disabled.");
        } else {
            System.out.println("The button is enabled.");
        }

        // Close the WebDriver
        driver.quit();
    }
}
