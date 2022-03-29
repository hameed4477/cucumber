@OtherLoginFeature @Regression
Feature: TechFios Other Login functionality validation

Background:
Given User is on techfios login page

@OtherScenario1

Scenario Outline: Login with valid credentials (Other) 
When User enters username as "<username>"
When User enters password as "<password>"
When User clicks on signin button
Then User should land on dashboard page
Examples:
|username|password|
|demo2@techfios.com|abc123|
|demo@techfios.com|abc1234|
|demo2@techfios.com|abc1234|


