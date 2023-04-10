Feature: Add Items To Cart For Shopping
  Background:
    Given User open a browser
    And Enter search URL

    Scenario: Item add to Cart
      Then Search an item for purchase
      And Select an item which you want to purchase
      Then add one more in selected one
      And check avail for collect



