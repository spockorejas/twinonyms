Feature: Connect to Twitter Search API

  Scenario: Get tweets of a given term
    Given a term
    When the term is sent to the Search Api
    Then a list of tweets is retrieved