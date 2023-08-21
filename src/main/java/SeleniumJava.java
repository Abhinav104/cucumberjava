import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String project_path =System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", project_path+"/src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");
		
		driver.navigate().to("");
		WebElement test = driver.findElement(By.xpath(""));
		
		driver.close();

	}

}
