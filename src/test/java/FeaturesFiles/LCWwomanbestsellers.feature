Feature: LCW Website Testing
  Scenario: Add and pay

    Given Open website go to home page
    When Verify that you are on the home page
    And Go to Woman best seller page
    And Click on the a random product
    And Click any Size
    And Click on the addToCart
    And Click on the Cart
    And Save the product price
    And Click on the Payment
    And Fill out the form on the payment page
    Then Click on the save button
