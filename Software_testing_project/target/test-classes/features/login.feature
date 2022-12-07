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
      | email            | password    | msg
      | 'wrongEmail'     | 'demoagent' | wrong email
      |                  |             | wrong password



#    log in ( with more than one case )
#    Book a hotel
#    Book a flight
#    Book a Tour
#    Book a trnsfer
#    Update profile information
#    Check your bookings or check your balance or check number of bookings