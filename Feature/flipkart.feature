Feature: Test the Flipkart site and add five items in the kart
 
   Scenario Outline: Verify the selected items are in add kart
    Given The user is in Flipkart site
    When The user selected the iphones "<itemname1>","<itemname2>","<itemname3>","<itemname4>","<itemname5>"
    Then The user verifies items are sucessfully added

    Examples:
      | itemname1 | itemname2 | itemname3 | itemname4 | itemname5 |
      |Apple iPhone X (Space Gray, 256 GB)|Apple iPhone X (Space Gray, 64 GB)|Apple iPhone X (Silver, 64 GB)|Apple iPhone X (Silver, 256 GB)|iron Box|
            