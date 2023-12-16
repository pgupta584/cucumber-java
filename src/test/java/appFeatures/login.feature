Feature:  I want to login into the site with valid data and Invalid data

  Background:
    Given I navigate to the Website

  Scenario: Login as a new sign-up user with valid data
    When I entered the user name
    And I entered the password
    And click on the sign-in button
    Then validate user successfully logged-in
    But log-in button is not present

  Scenario: Login as a new sign-up user with Invalid data
    When I entered the user name
    And I entered the password
    And click on the sign-in button
    Then validate error message