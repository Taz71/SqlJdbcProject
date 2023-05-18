@DbLoginFeature @Regression
Feature: Techfios billing login page functionality validation by extracting data from september2022 DDB

  @DbScenario1
  Scenario: User should be able to login with valid credentials from DB
    Given User is on the techfios login page
    When User enters "username" from database
    When User enters "password" from database
    When User clicks on sign in button
    Then User should land on dashboard page
