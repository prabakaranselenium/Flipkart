Feature: Test the Flipkart site and add five items in the kart
 
   Scenario Outline: Verify the selected items are in add kart
    Given The user is in Flipkart site
    When The user selected the iphones "<itemname>"
    Then The user verifies items are sucessfully added

    Examples: 
      | itemname |
      | Apple iPhone X (Space Gray, 64 GB) | 
      