Feature: Discount coupon check

  Background:
    Given Open website go to home page
    When Verify that you are on the home page

  Scenario: Up to 30 percent discount coupon check
    Given Click on MARKALARA ÖZEL title from the main page
    And Click on SHADE KADIN ÜRÜNLERİ title opportunity
    And Filter products by Bluz and choose a random product
    And If available, choose random size and color and add to cart
    And Click on the addToCart
    And Click on the Cart
    And Product price and discount rate
    And Click on the Payment
    And Fill out the form on the payment page
    Then Click on the save button