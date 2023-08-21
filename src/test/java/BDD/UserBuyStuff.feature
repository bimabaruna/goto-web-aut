@buyStuff
Feature: User buy stuff

  @buyStuffWithSortHiPrice
  Scenario: user wan to buy stuff on the web with sort by highest price
    Given User input field user name with "standard_user"
    And User input field password with "secret_sauce"
    And User click login button
    And User sort of product by Highest Price
    And User click product card
    And User click add to cart button
    And user click check out button
    And user input "bima" on first name field
    And user input "baruna" on last name field
    And user input "16340" on zip code field
    And user click continue button

  @buyStuffWithoutSort
  Scenario: user wan to buy stuff on the web with sort by highest price
    Given User input field user name with "standard_user"
    And User input field password with "secret_sauce"
    And User click login button
    And User click product card
    And User click add to cart button
    And user click check out button
    And user input "bima" on first name field
    And user input "baruna" on last name field
    And user input "16340" on zip code field
    And user click continue button