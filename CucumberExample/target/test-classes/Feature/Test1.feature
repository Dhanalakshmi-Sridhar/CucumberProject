#author:Dhanalakshmi
#date:Feb25

Feature: Verifying the Title
Scenario: User checks the whether the application opens in browser or not
  Given User opens the Browser
  Then User Enters the "https://www.smartbazaar.co.uk/"
  And User verifies the Title of the Application
  Then User closes the Browser
