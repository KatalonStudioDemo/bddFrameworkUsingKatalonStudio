Feature: Checkout with Existing user

  Scenario: Place order with valid details
    Given Navigate to sauceLab home page
    Given Maximize the webpage
    When Enter the email and password field
    And click on Login button
    Then verify the inventory html page url
    And click on Add to cart button
    And click on cart icon on top header of the page
    And click on Continue shopping button
    And click on Add to cart button for the second item to be selected
    And click on cart icon on top header of the page
    Then verify the cart page url
    And click on checkout button
    Then verify the checkout page url
    And Enter the first name field
    And Enter the last name field
    And Enter the zipCode field
    And Click on Continue button
    And Click on finish button

  Scenario: Place order with invalid email address
    Given Navigate to sauceLab home page
    Given Maximize the webpage
    When Enter the email field
    And Enter the valid password field
    And click on Login button
    Then verify invalid details message to be displayed

  Scenario: Place order with invalid email address
    Given Navigate to sauceLab home page
    Given Maximize the webpage
    When Enter the email field
    And Enter the invalid password field
    And click on Login button
    Then verify invalid details message to be displayed
