@LoginFeature @Regression
Feature: TechFios Login functionality validation

Background:
Given User is on techfios login page

@Scenario1 @Smoke
Scenario: Login with valid credentials 
When User enters username as "demo@techfios.com"
When User enters password as "abc123"
When User clicks on signin button
Then User should land on dashboard page
And User shoul click on the cash and bank
Then User should click on the New Account
Then User should insert the title as "Savings"
Then User should insert the description as "need to save mor money" 
Then User should insert the intial balance as "10000"


