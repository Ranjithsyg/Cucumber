
Feature: Ajio Mens Jeans

Background: Ajio launching function
Given Launch the Ajio website "https://www.ajio.com"
And Navigate to Mens and click on Jeans

@jeans
Scenario: Sorting Mens Jeans by Lowest Price

When User clicks on sort dropdown and select option in a dropdown with one dim map
|sort1|highest|
|sort2|Discount|
|sort3|lowest|
|sort4|What|
|sort5|Ratings|
|sort6|Relevance|
Then Validate the outcome



