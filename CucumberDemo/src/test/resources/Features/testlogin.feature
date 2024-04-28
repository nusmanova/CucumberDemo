#author
#date
#Description
Feature: Login

As a user I want to login  application

 Scenario Outline:Sample 1 Check login is successful with valid credentials
    Given user is on  login page
    When user enters <username> and <password>
    And clicks on login button
    Then user succsessfully login and see information

    Examples: 
      | username                     | password |
      | dipafrodita@gmail.com        | America2024$   |
