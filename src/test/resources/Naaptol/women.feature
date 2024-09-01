
@ApparelandAccessories
Feature: Apparel and Accessories Functionality
  

  @SmokeTest
  Scenario: To Validate the clearall of bottom wear functionality
    Given open the browser, enter the naaptol url
    And select the apparel & accessories from shopping categories dropdown
    #And user click on womens wear
    When user click on the bottom wear link
    #And user click on Clear all from the Narrow Results
    And user click on anyproduct 
    And Add to cart page should be displayed
    Then user click on the add to cart
    And takes screenshots
    And close browsers
    
    

  @tag2
  Scenario: To Validate the personalise search of bottom wear functionality 
    Given open the browser, enter the naaptol url
    And select the apparel & accessories from shopping categories dropdown
    #And user click on womens wear
    When user click on the bottom wear link
    Then user click on all the checkboxes from personalise search and click on set
    And takes screenshots
    And close browsers
   # Then user click on anyproduct
    #Then Add to cart should be displayed
    
    
  @tag3
  Scenario: To Validate the Brands of bottom wear functionality
    Given open the browser, enter the naaptol url
    And select the apparel & accessories from shopping categories dropdown
    #And user click on womens wear
    When user click on the bottom wear link
    Then user click on the pakhi,American indigo,Stylexa,Vrindam Creations,Airiki from Brands
    And takes screenshots
    And close browsers
   # Then Item should be displayed in the page
    
    
  @tag4
  Scenario: To Validate the the Price of bottom wear functionality
    Given open the browser, enter the naaptol url
    And select the apparel & accessories from shopping categories dropdown
    #And user click on womens wear
    When user click on the bottom wear link
    #And user click on Clear all from the Narrow Results
    Then user click on the all the checkboxes from Price
    And takes screenshots
    And close browsers
    #Then Item should be displayed in the page
    
  @tag5
  Scenario: To Validate the Discount of bottom wear functionality
    Given open the browser, enter the naaptol url
    And select the apparel & accessories from shopping categories dropdown
   # And user click on womens wear
    When user click on the bottom wear link
    Then user click on the all the checkboxes from Discount
    And takes screenshots
    And close browsers
   # Then Item should be displayed in the page
    
  @tag5
  Scenario: To Validate the Type of bottom wear functionality
    Given open the browser, enter the naaptol url
    And select the apparel & accessories from shopping categories dropdown
    When user click on the bottom wear link
    Then user click on the all the checkboxes from Type
    And takes screenshots
    And close browsers
  
    
  @tag6
  Scenario: To Validate the sortby of bottom wear functionality
    Given open the browser, enter the naaptol url
    And select the apparel & accessories from shopping categories dropdown
    When user click on the bottom wear link
    And user select  most popular from sortby dropdown
    And takes screenshots
    And close browsers
    
  @tag7
  Scenario: To Validate by navigating multiple feature of womens wear
    Given open the browser, enter the naaptol url
    And select the apparel & accessories from shopping categories dropdown
    And takes screenshots
    And close browsers
    
  @tag8
  Scenario: To Validate western wear by search functionality
    Given open the browser, enter the naaptol url
    When user search western wear in search bar 
    And user click on the search link
    Then weatern wear page should be displayed in the page
    And takes screenshots
    And close browsers
    
  @tag9
  Scenario: To Validate by comparing the products
    Given open the browser, enter the naaptol url
    And select the apparel & accessories from shopping categories dropdown
    When user click on the lehangas
    And user click on the Add to Compare1,Add to Compare2
    Then user click on compare now
    And takes screenshots
    And close browsers
    
  @tag10
  Scenario: To Validate the aboutpage of women wear 
    Given open the browser, enter the naaptol url
    And select the apparel & accessories from shopping categories dropdown
    When user click on the Stylexa from Brand
    Then Stylexa Apparel and Accessories page should be displayed
    And takes screenshots
    And close browsers

    