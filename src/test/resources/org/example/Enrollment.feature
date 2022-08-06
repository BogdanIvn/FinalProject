Feature: Enrollment

  Scenario: Functionality of the Next button in the Enrollment Personal information area
    Given I am on the mainpage
    When I click on the Start the Enrollment button
    And press the next button
    Then the header of the page will be "Personal information"