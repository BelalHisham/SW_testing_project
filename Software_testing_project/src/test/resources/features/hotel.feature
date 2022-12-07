Feature: Book a hotel

Background:
    Given the homepage is open




  Scenario:
    Given the Email is filled with 'agent@phptravels.com'
    And the Password is filled with 'demoagent'
    And the Login button is clicked
    And Hotel link is clicked
    And Rendezvous Hotels link is clicked
    And Book H Now button is clicked
#    Then 'Hotel Booking' should be shown H