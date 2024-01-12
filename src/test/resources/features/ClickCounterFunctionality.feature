 Feature: ClickCounterFunctionality

   As a User of the click counter application
   I want to able to check the clicking functionality
   So that I can check the couter functionality

 Scenario: Counter Functionality
   Given I am on the click counter page with initial count as zero
   When I click the 'Click Me!' button 100 times
   Then the counter should show the count of the clicks