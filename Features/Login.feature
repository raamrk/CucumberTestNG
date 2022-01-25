Feature: Login

Scenario: verify login feature with valid user credntails

Given open application in chrome browser

When enter userName "admin@yourstore.com" and enter password "admin"

And click on login button

Then verify user able to view Dashboard