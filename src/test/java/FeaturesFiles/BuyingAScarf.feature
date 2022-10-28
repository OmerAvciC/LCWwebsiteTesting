Feature: LCW Website Testing
  Scenario: Buy a Scarf

    Given Open website go to home page
    When Verify that you are on the home page
    And Send keyword to search box and click Search
    And Click Scarf
    And Click on the addToCart
    And Click on the Cart
    And Save the product price
    And Click on the Payment
    And Fill out the form on the payment page
    Then Click on the save button
