import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHandlingExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10)); // Set a timeout of 10 seconds
        

        driver.get("https://example.com");

        // Click a button or perform an action that triggers the popup (JavaScript alert)
        WebElement popupTrigger = driver.findElement(By.id("popupTriggerId"));
        popupTrigger.click();

        try {
            // Wait for the presence of the popup alert
            wait.until(ExpectedConditions.alertIsPresent());

            // Switch to the alert
            Alert alert = driver.switchTo().alert();

            // Perform actions on the alert (e.g., accept, dismiss, get text)
            String alertText = alert.getText();
            alert.accept(); // You can accept the alert

            // Handle the alert as required

        } catch (org.openqa.selenium.NoAlertPresentException e) {
            // If no alert is present, this exception will be caught
            // Handle the case when no alert is found (e.g., log a message)
            System.out.println("No alert was found.");
        }

        // Continue with the rest of your test

        driver.quit();
    }
}
