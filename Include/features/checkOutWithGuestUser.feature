Feature: Checkout with Existing user

  Scenario: Place order with exisiting user
    Given Navigate to sauceLab home page
    When Enter the email and password field
    And click on Login button
    And click on Add to cart button
    And click on cart icon on top header of the page
    And click on Continue shopping button
    And click on Add to cart button for the second item to be selected
    And click on cart icon on top header of the page
    And click on checkout button
    And Enter the first name field
    And Enter the last name field
    And Enter the zipCode field
    And Click on Continue button
    And Click on finish button
