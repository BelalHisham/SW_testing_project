Feature: Update the profile


  Background:
    Given the homepage is open


  Scenario Outline:
    Given the homepage is open
    And the Email is filled with <email>
    And the Password is filled with <password>
    And the Login button is clicked
    And my profile link clicked
    And First name is filled with 'Fname'
    And Last name is filled with 'Lname'
    And Phone is filled with '+36201234567'
    And update profile button is clicked
    Then 'Profile updated successfully.' is shown
    Examples:
      | email                      | password      |
      | 'agent@phptravels.com'     | 'demoagent'   |
      | 'someemail_test@email.com' | '123456789'   |
      | 'belalhisham@gmail.com'    | 'password123' |
      | 'BelalYoussef@yahoo.com'   | 'wordpassword'|


