Feature: Login to the Signin Page

  Scenario Outline: Logging in with valid credentials
  
    Given I have initialized the driver to open the chromedriver
    And hit "https://rahulshettyacademy.com/" on chromebrowser
    When I click on the Signin link of the Page and get to signin page.send valid user credentials such as  userName <UserName>  and password <PassWord>
    Then Successfully logged into my account.
    And close the browser
    
    Examples:
    |UserName 											|PassWord| 
    |test99@gmail.com					|123456		|
    |jhemmige@gmail.com		|123456		|
    |jh@gmail.com								|123456		|
    
