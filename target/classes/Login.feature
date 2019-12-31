Feature: Log in Application
@FirstTest
Scenario: Log in page
Given user has login information
When user log into the application with "Jhon" and password "4569"
Then user should be able log in successfully

@NuhaaTest
Scenario: User in home page login
Given User is on Nissan OEM landing page
When User sign up with following details
|Mohammad | Naushin | mzrahman74@gmail.com | Plano | 2149730438 |
Then Home page should displayed


@Users
Scenario Outline: Home page default login
Given User is on NetBanking landing page
When User log in to application with <Username> and  <Password>
Then Home page will display
Examples:

| Username | Password |
| mrahman1 | Bbyk1945? |
| mrhaman2 | Bbyk1965? |
| mrahman3 | Bbyk1989? |


