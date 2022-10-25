Feature: LCW Website Testing
  Scenario: Add and pay

    Given Open website go to home page
    When Verify that you are on the home page
    And Go to Men's boots using the action class or with the help of the search button
    And Click any Bot
    And Click any Size
    And Click on the addToCart
    And Click on the Cart
    And Save the product price
    And Click on the Payment
    And Fill out the form on the payment page
    Then Click on the save button

