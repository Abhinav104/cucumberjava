import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String project_path = System.getProperty("user.dir"); //This will get the location of main project folder Cucumber Java
		System.setProperty("webdriver.chrome.driver", project_path+"/src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		

	}

}
