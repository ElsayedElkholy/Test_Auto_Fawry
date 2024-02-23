@smoke
Feature: F01_Login | Validate the Subscription Packages – Type & Price and Currency for all Countries (SA / Kuwait and Baharin)

  Scenario: Validate Type & Price and Currency for Saudi Arabia
    Given user navigate to Plans page
    When user Select Country KSA
    Then Verify that the package types are displayed
    And Verify that the currency type is "sar"
    And Verify that the price Lite "15" Classic "25" Premium "60"

  Scenario: Validate Type & Price and Currency for Kuwait
    Given user navigate to Plans page
    When user Select Country Kuwait
    Then Verify that the package types are displayed
    And Verify that the currency type is "kwd"
    And Verify that the price Lite "1.2" Classic "2.5" Premium "4.8"

  Scenario: Validate Type & Price and Currency for Baharin
    Given user navigate to Plans page
    When user Select Country Baharin
    Then Verify that the package types are displayed
    And Verify that the currency type is "bhd"
    And Verify that the price Lite "2" Classic "3" Premium "4"



