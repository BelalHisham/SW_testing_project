Feature: Login page test

  Background:
    Given the homepage is open



    Scenario:
      Given the Email is filled with 'agent@phptravels.com'
      And the Password is filled with 'demoagent'
      And the Login button is clicked
      Then 'Welcome Back' should be shown


  Scenario Outline:
    Given the Email is filled with <email>
    And the Password is filled with <password>
    And the Login button is clicked
    Then <msg> should appear
    Examples:
      | email                | password    | msg
      | 'wrongEmail'         | 'demoagent' | wrong email
      | 'agent@phptravels.com| 'wrongPass' | wrong password
      |                      | 'demoagent' | Please fill the email
      | 'agent@phptravels.com|             | please fill the password
