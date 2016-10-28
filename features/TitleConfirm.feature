Feature: Check the page title  

  # value in the " " are parameters
  
  Scenario: Check the page title for BBC News
    Given I am on bbc website
    When I navigate to "//*[@href='http://www.bbc.co.uk/news'][text()='News']" 
    Then I check page title is "News"
    And I close the browser
    
  Scenario: Check the page title for BBC Sport
    Given I am on bbc website
    When I navigate to "//*[@href='http://www.bbc.co.uk/sport'][text()='Sport']" 
    Then I check page title is "Sport"
    And I close the browser
    
  Scenario: Check the page title for BBC Weather
    Given I am on bbc website
    When I navigate to "//*[@href='http://www.bbc.co.uk/weather'][text()='Weather']" 
    Then I check page title is "Weather"
    And I close the browser