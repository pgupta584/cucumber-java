#Feature: Login functionality of Facebook Application
#
#  Scenario Outline: Verification of Login functionality
#    Given user launch the application and be at login page
#    When user Enter the <Username> and <Password> at login page
#    And user click on submit button
#    Then user is able to login to the application
#    Examples:
#      | Username | Password   |
#      | admin    | manager    |
#      | admin123 | manager123 |