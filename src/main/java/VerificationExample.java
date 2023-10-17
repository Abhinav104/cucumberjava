import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");

        WebElement element = driver.findElement(By.id("nonExistentElement"));
        if (element.isDisplayed()) {
            System.out.println("Element is displayed.");
        } else {
            System.out.println("Element is not displayed (Verification failed).");
        }

        // Test execution continues even if the verification fails
        driver.quit();
    }
}
