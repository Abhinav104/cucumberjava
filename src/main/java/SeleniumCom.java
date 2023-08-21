import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumCom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "");
		WebDriver driver = new ChromeDriver();
		
		driver.get("");
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

	}

}
