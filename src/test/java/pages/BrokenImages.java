package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

public class BrokenImages {
	WebDriver driver;
	
	@FindBy(css = "a[href='/broken_images']")
	WebElement linkBrokenImage;
	
	@FindBy(tagName = "img")
	List<WebElement> images;
	
    // Method to check whether an image is broken
    public boolean isImageBroken(WebElement image) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        String script = "return arguments[0].complete && " +
                "typeof arguments[0].naturalWidth !== 'undefined' && " +
                "arguments[0].naturalWidth > 0";

        Object isLoaded = jsExecutor.executeScript(script, image);
        return Boolean.parseBoolean(isLoaded.toString());
    }
	

    
	public List<WebElement> getImages() {
		return images;
	}
	
	public BrokenImages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void click_brokenImageLink() {
		linkBrokenImage.click();
	}
	
	public void getBrokenImage() {
		
        // Get the list of image elements using Page Factory
        List<WebElement> images = getImages();

        // Loop through the images and check if each image is broken or not
        for (WebElement image : images) {
            if (isImageBroken(image)) {
                System.out.println("Broken image: " + image.getAttribute("src"));
            } else {
                System.out.println("Valid image: " + image.getAttribute("src"));
            }
        }
		
	}

}
