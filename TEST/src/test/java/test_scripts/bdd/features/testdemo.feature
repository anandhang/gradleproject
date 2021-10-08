Feature: test google page

  Scenario : Open and search google page
    Given Open the URL "https://www.google.com/"
    When user is entering "Google"
    And press the enter key
    Then validate results

