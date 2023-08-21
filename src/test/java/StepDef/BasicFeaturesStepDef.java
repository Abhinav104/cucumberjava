package StepDef;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddRemoveElement;
import pages.BasicAuth;
import pages.BrokenImages;
import pages.CheckBox;
import pages.DragAndDrop;
import pages.DropDown;
import pages.EntryAd;
import pages.ExitIntent;
import pages.JavaScriptAlert;

public class BasicFeaturesStepDef {
	
//	WebDriver driver = null;
	WebDriver driver;
	
	//First need to create the object of AddRemoveElement
	AddRemoveElement addremele;
	BasicAuth basicauth;
	BrokenImages brokenimages;
	CheckBox checkbox;
	JavaScriptAlert javascriptalert;
	DragAndDrop draganddrop;
	DropDown dropdown;
	EntryAd entryad;
	ExitIntent exitintent;
	
	
	@Given("User should be on home")
	public void user_should_be_on_home() {
		
		String project_path = System.getProperty("user.dir"); //This will get the location of main project folder Cucumber Java
		System.setProperty("webdriver.chrome.driver", project_path+"/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		// Initialize the Page Class with the WebDriver instance
		addremele = new AddRemoveElement(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com");

	}

	@When("Click on add remove element")
	public void click_on_add_remove_element(){
	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("test");
		addremele.clickAddRemoveLink();
	}

	@When("Click on add element")
	public void click_on_add_element() {
	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("test");
		addremele.clickAddElement();
	}

	@Then("Delete button should enable")
	public void delete_button_should_enable() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("test");
		addremele.clickDelete();
		driver.close();
	}

	@When("Clicks on Basic Auth")
	public void clicks_on_basic_auth() {
	    // Write code here that turns the phrase above into concrete actions
		basicauth = new BasicAuth(driver);
		basicauth.clickBasicAuthLink();
	}

	@When("Enters username and password")
	public void enters_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions	
		basicauth.passAuthUrl();
	   
	}

	@Then("Congratulation message should appear")
	public void congratulation_message_should_appear() {
	    // Write code here that turns the phrase above into concrete actions
	    basicauth.validateCongText();
	    driver.close();
	}

	@When("Clicks on broken image section")
	public void clicks_on_broken_image_section() {
	    // Write code here that turns the phrase above into concrete actions
		brokenimages = new BrokenImages(driver);
		brokenimages.click_brokenImageLink();
	
	}

	@Then("validate images are broken or not")
	public void validate_images_are_broken_or_not() {
	    // Write code here that turns the phrase above into concrete actions
		brokenimages.getBrokenImage();
	   
	}

	@When("Clicks on check box link")
	public void clicks_on_check_box_link() {
	    // Write code here that turns the phrase above into concrete actions
	    checkbox =new CheckBox(driver);
	    checkbox.clickCheckboxLink();
	}

	@Then("Check box two should be selected")
	public void check_box_two_should_be_selected() {
	    // Write code here that turns the phrase above into concrete actions
	    checkbox.checkboxTwoSelected();
	}

	@Then("select check box one")
	public void select_check_box_one() {
	    // Write code here that turns the phrase above into concrete actions
	    checkbox.Selectcheckboxone();
	    driver.close();
	}

	@When("Clicks on context menu link")
	public void clicks_on_context_menu_link() {
	    // Write code here that turns the phrase above into concrete actions
	    javascriptalert = new JavaScriptAlert(driver);
	    javascriptalert.click_linkContextMenu();
	}

	@When("Right click in the box to appear javascript alert")
	public void right_click_in_the_box_to_appear_javascript_alert() {
		javascriptalert.rightClickSqBox();
		

	}

	@Then("Click on OK button to close javascript alert")
	public void click_on_ok_button_to_close_javascript_alert() {
	    // Write code here that turns the phrase above into concrete actions
	    javascriptalert.acceptAlert();
	}

	@When("Clicks on drag & drop link")
	public void clicks_on_drag_drop_link() {
	    // Write code here that turns the phrase above into concrete actions
		draganddrop = new DragAndDrop(driver);
	    draganddrop.clickDragdropLink();
	}

	@When("Drag & drop element A to B")
	public void drag_drop_element_a_to_b() {
		draganddrop.dragdropOperations(); 
	}

	@Then("validate element A should be in element B position")
	public void validate_element_a_should_be_in_element_b_position() {
	    // Write code here that turns the phrase above into concrete actions
	    draganddrop.assertDragDrop();
	    driver.close();
	}

	@When("Clicks on drop down link")
	public void clicks_on_drop_down_link() {
	    // Write code here that turns the phrase above into concrete actions
		dropdown = new DropDown(driver);
	    dropdown.click_dropdownlink();
	}

	@When("select option two")
	public void select_option_two() {
	    // Write code here that turns the phrase above into concrete actions
//	    dropdown.click_DropdownBox();
	    dropdown.selectDropdownValue();
	}

	@Then("validate option two should be selected")
	public void validate_option_two_should_be_selected() {
	    // Write code here that turns the phrase above into concrete actions
	    dropdown.validateDropdownSelection();
	}

	@When("Clicks on entry add link")
	public void clicks_on_entry_add_link() {
	    // Write code here that turns the phrase above into concrete actions
	    entryad = new EntryAd(driver);
	    entryad.click_linkEntryAd();
	}

	@When("Clicks on add close button")
	public void clicks_on_add_close_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    entryad.click_linkClose();
	    Thread.sleep(5000);
	}

	@Then("user should be able to click on click here link")
	public void user_should_be_able_to_click_on_click_here_link(){
	    // Write code here that turns the phrase above into concrete actions
	    entryad.gettext_linkClickHere();
	    driver.close();
	}

	@When("clicks on eit intent link")
	public void clicks_on_eit_intent_link() {
	    // Write code here that turns the phrase above into concrete actions
		exitintent = new ExitIntent(driver);
		exitintent.clickLinkExitIntent();
	    
	}

	@When("move mouse to outside viewport")
	public void move_mouse_to_outside_viewport() throws AWTException {
	    // Write code here that turns the phrase above into concrete actions
	    exitintent.moveCursor();
	}

	@Then("validate modal window should appear")
	public void validate_modal_window_should_appear() {
	    // Write code here that turns the phrase above into concrete actions
		exitintent.clickCloseBtn();
		driver.close();
	}
	
	

}
