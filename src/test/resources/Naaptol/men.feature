
@ApparelandAccessories
Feature: Apparel and Accessories Functionality
  

  @SmokeTest
  Scenario: To Validate the innerwear functionality
    Given open the browser, enter the naptol url in men
    And select the Apparel & Accessories from shopping categories dropdown in men
    When user click on the innerwear link
    And take screenshot
    And close browser
    
  @tag2
  Scenario: To Validate the personalise search
    Given open the browser, enter the naptol url in men
    And select the Apparel & Accessories from shopping categories dropdown in men
    When user click on the innerwear link
    Then user click on the all the checkboxes and click on set
    And take screenshot
    And close browser
    
  @tag3
  Scenario: To Validate the Brands of mens feature
    Given open the browser, enter the naptol url in men
    And select the Apparel & Accessories from shopping categories dropdown in men
    When user click on the innerwear link
    And user click on the Scottish club2,Branded from Brand
    And take screenshot
    And close browser
    
    
  @tag4
  Scenario: To Validate the Price of mens feature
    Given open the browser, enter the naptol url in men
    And select the Apparel & Accessories from shopping categories dropdown in men
    When user click on the innerwear link
    Then user click on the checkbox from Price
    And take screenshot
    And close browser
    
  @tag5
  Scenario: To Validate the Discount of mens feature
    Given open the browser, enter the naptol url in men
    And select the Apparel & Accessories from shopping categories dropdown in men
    When user click on the innerwear link
    Then user click on the more than fifty% discount
    And take screenshot
    And close browser
    
  @tag6
  Scenario: To Validate the color of mens feature
    Given open the browser, enter the naptol url in men
    And select the Apparel & Accessories from shopping categories dropdown in men
    When user click on the innerwear link
    Then user click on the black color
    And take screenshot
    And close browser
    
  
    
    
    

  
    
