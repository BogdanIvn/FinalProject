Feature: Enrollment
  These tests will verify the functionality of the Enrollment page

  Scenario: Functionality of the Next button in the Enrollment Personal information area
    Given I am on the mainpage
    When I click on the Start the Enrollment button
    And press the next button without filling any field
    Then the header of the page will be "Personal information"

  Scenario:Functionality of the Personal information area after filling the fields
    Given I am on the mainpage
    When I click on the Start the Enrollment button
    And I fill the first name field with "Bruce"
    And last name field with "Wayne"
    And username field with "Batman"
    And password field with "Gotham"
    And confirm password with "Gotham"
    Then the header of the next page will be "Contact information"

  Scenario: Functionality of the Contact information area after filling the fields
    Given I am on the Contact information page
    When I fill the email field with "test@testing.com"
    And phone field with "0799111222"
    And country field with "Romania"
    And city field with "Brasov"
    And postcode field with "111222"
    Then the header of the next page will be "Course options"

  Scenario: Functionality of the