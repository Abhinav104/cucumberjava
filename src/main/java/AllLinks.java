import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String project_path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", project_path+"/src/test/resources/drivers/chromedriver.exe");
		
//		String project_path = System.getProperty("user.dir"); //This will get the location of main project folder Cucumber Java
//		System.setProperty("webdriver.chrome.driver", project_path+"/src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		List<WebElement> all_tags=driver.findElements(By.tagName("a"));
		
		for(WebElement all_tag:all_tags) {
			String href_value = all_tag.getAttribute("href");
			System.out.println(href_value);		
		}
		
		driver.close();

	}

}
