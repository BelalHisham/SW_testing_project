Feature: webshop login cart testing

  Background:
    Given the homepage is open
    And the Login word is clicked
    And the Username is filled with 'swtesting'
    And the Password is filled with '12345'
    And the Login button is clicked


  Scenario:
    Given the Samsung galaxy s6 is opened
    And the cart button is clicked
    When the cart word is clicked
    Then '360' should be shown





