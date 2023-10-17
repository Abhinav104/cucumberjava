import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DropdownValues {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver instance
        WebDriver driver = new ChromeDriver();

        // Navigate to the webpage with the dropdown
        driver.get("https://example.com");

        // Locate the dropdown element by its locator (XPath or CSS selector)
        WebElement dropdownElement = driver.findElement(By.id("dropdownId"));

        // Create a Select object to interact with the dropdown
        Select dropdown = new Select(dropdownElement);

        // Get all options from the dropdown
        List<WebElement> options = dropdown.getOptions();

        // Create a list to store the option values
        List<String> optionValues = new ArrayList<String>();

        // Iterate through the options and store their values
        for (WebElement option : options) {
            optionValues.add(option.getText());
        }

        // Sort the option values in ascending order
        Collections.sort(optionValues);

        // Print the sorted option values
        System.out.println("Dropdown Values in Ascending Order:");
        for (String value : optionValues) {
            System.out.println(value);
        }

        // Close the WebDriver
        driver.quit();
    }
}
