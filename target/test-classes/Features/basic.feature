Feature: Automating basic features of Selenium

  @smoke
  Scenario: Add or remove elements
    Given User should be on home
    When Click on add remove element
    And Click on add element
    Then Delete button should enable
    
	@smoke
  Scenario: Automating Basic Auth
    Given User should be on home
    When Clicks on Basic Auth
    And Enters username and password
    Then Congratulation message should appear
    
	
  Scenario: Checking broken images
    Given User should be on home
    When Clicks on broken image section
    Then validate images are broken or not
	
  Scenario: Validate check box
    Given User should be on home
    When Clicks on check box link
    Then Check box two should be selected
    And select check box one
	
	
  Scenario: Handle java script alert
    Given User should be on home
    When Clicks on context menu link
    And Right click in the box to appear javascript alert
    Then Click on OK button to close javascript alert
	
	
  Scenario: Drag & Drop
    Given User should be on home
    When Clicks on drag & drop link
    And Drag & drop element A to B
    Then validate element A should be in element B position
	
  Scenario: Drop Down
    Given User should be on home
    When Clicks on drop down link
    And select option two
    Then validate option two should be selected
	
	
  Scenario: Handle entry add
    Given User should be on home
    When Clicks on entry add link
    And Clicks on add close button
    Then user should be able to click on click here link

  Scenario: Exit intent
    Given User should be on home
    When clicks on eit intent link
    And move mouse to outside viewport
    Then validate modal window should appear
