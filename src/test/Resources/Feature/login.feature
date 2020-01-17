@login
Feature: login
  Scenario: user should able to login with valid credential
    when user use valid username and password and press enter he or she should be able to see login successful message
    Given user is on homepage
    When user enter valid credential for login
    Then user should be able to login successfully