Feature: Book a Flight

  Background:
    Given the homepage is open




  Scenario:
    Given the Email is filled with 'agent@phptravels.com'
    And the Password is filled with 'demoagent'
    And the Login button is clicked
    And Flight link is clicked
    And Air Philippines link is clicked
    And Book F Now button is clicked
#    Then 'Flights Booking' should be shown F