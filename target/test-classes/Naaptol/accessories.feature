
@ApparelandAccessories
Feature: Apparel and Accessories Functionality
  

  @SmokeTest
  Scenario: To Validate the Add to Cart of eyewear functionality
    Given open the browser, enter the naaptol url in acc
    And select the aparel & acessories from shopping categories dropdown
    #When user click the Accessories 
    When user click on the eyewear link
    Then user click on the anyproduct
    And take a screenshot 
    And close the browser
    

  @tag2
  Scenario: To Validate the ps search functionality
    Given open the browser, enter the naaptol url in acc
    And select the aparel & acessories from shopping categories dropdown
   # When user click the Accessories
    When user click on the eyewear link
    Then user click on the with case on delivery,exclude out of stock and click on set
    And take a screenshot 
    And close the browser
    
    
    
  @tag3
  Scenario: To Validate the brands of eyewear functionality
    Given open the browser, enter the naaptol url in acc
    And select the aparel & acessories from shopping categories dropdown
    #When user click the Accessories
    When user click on the eyewear link
    Then user click on the all checkboxes of brand
    And take a screenshot 
    And close the browser
  
  @tag4
  Scenario: To Validate the price of eyewear functionality
    Given open the browser, enter the naaptol url in acc
    And select the aparel & acessories from shopping categories dropdown
    #When user click the Accessories
    When user click on the eyewear link
    #Then user click on the two checkboxes of brand
    
    
  @tag5
  Scenario: To Validate the discount 
    Given open the browser, enter the naaptol url in acc
    And select the aparel & acessories from shopping categories dropdown
   # When user click the Accessories
    When user click on the eyewear link
    Then user click on the forty-fifty% discount
    And take a screenshot
    And close the browser 
    
  @tag6
  Scenario: To Validate the card slots of mens wallet functionality
    Given open the browser, enter the naaptol url in acc
    And select the aparel & acessories from shopping categories dropdown
    #When user click the Accessories
    When user click on the mens wallet link
    Then user click on the checkbox of card slot
    And take a screenshot 
    And close the browser
    
  @tag7
  Scenario: To Validate the Type of mens wallet
    Given open the browser, enter the naaptol url in acc
    And select the aparel & acessories from shopping categories dropdown
    #When user click the Accessories
    When user click on the mens wallet link
    Then user click on the all the checkboxes of type in mens wallet
    And take a screenshot 
    And close the browser
    
  @tag8
  Scenario: To Validate the product type in sunglasses functionality
    Given open the browser, enter the naaptol url in acc
    And select the aparel & acessories from shopping categories dropdown
    #When user click the Accessories
    When user click on the sunglasses link
    Then user click on the eyeglasses checkbox
    And take a screenshot 
    And close the browser
    
  @tag9
  Scenario: To Validate the frame style of sunglasses
    Given open the browser, enter the naaptol url in acc
    And select the aparel & acessories from shopping categories dropdown
    #When user click the Accessories
    When user click on the sunglasses link
    Then user click on the full rim checkbox
    And take a screenshot
    And close the browser 
    
  @tag10
  Scenario: To Validate the Gender 
    Given open the browser, enter the naaptol url in acc
    And select the aparel & acessories from shopping categories dropdown
   # When user click the Accessories
    When user click on the sunglasses link
    Then user click on the female checkbox
    And take a screenshot 
    And close the browser
    
