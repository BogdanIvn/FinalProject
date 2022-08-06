Feature: Main Page Website
  These tests will verify the functionality of the main page

  Scenario: Valid Start the Enrollment button
    Given I am on the mainpage
    When I click on the Start the Enrollment button
    Then The page title should start with "software testing"

  Scenario: Valid Read more button in the Learn the fundamentals area
    Given I am on the mainpage
    When I click the Read More button of fundamentals area
    Then The page title should start with "fundamentals"

  Scenario: Valid Email Field
    Given I am on the mainpage
    When I enter "test@testing.com"
    Then A pop-up should appear and confirm the subscription

  Scenario: Valid Instructors Button
    Given I am on the mainpage
    When I click on the Instructor Button in the top right corner
    Then The page should take me to the Instructors Area

  Scenario: Valid Steve Smith LinkedIn button
    Given I am on the mainpage
    When I scroll to instructors area
    And click on Steve Smith's linkedIn button
    Then The page should take me to "linkedin" site