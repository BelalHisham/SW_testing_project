Feature: Contact us

  Background:
    Given the homepage is open
    And the Login word is clicked
    And the Username is filled with 'swtesting'
    And the Password is filled with '12345'
    And the Login button is clicked


    Scenario:
      Given contact link clicked
      And contact email filled with 'email@testing.com'
      And contact name filled with 'Belal'
      And message written 'Hello world'
      Then send message is clicked