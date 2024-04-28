Feature: Check google search functioality 

@smoke
Scenario: Validate  google search function

  Given Open the browswer 
  And user is on google search page
  When user enters a text in google search box
  And hits Enter
  Then user is navigated to the Search results 
  
  
  