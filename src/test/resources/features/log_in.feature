#author: felipeCorrea
#date: 14/11/2023
#language: en

  Feature: Log In to the site

  @LogInSuccess
  Scenario: Log in to the platform succesfully
     Given in the log in page
    When input my email
    And input my password
    Then I succesfully log in to the site