#Author: Dhanalakshmi
  Feature:To check the Functionality of the screen
    Scenario Outline: User wants to search the products
      Given User opens the Browser
      Then User Enters the "https://www.smartbazaar.co.uk/"
      And User enters the '<Search>' data
      When User clicks on Search icon
      And User verifies the '<Search>' results
      Then User selects the '<Product>' from the list
      And User verifies the selected '<Product>' result
      Then User closes the Browser

      Examples:
      |Search|Product|
      |Flowers|SAMPANGI / TUBEROSE / GAJRA FLOWERS (100G)|
