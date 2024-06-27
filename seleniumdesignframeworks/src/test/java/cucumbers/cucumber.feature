
@tag
Feature: purchase the product from shopping application
  I want to use this template for my feature file
  
  Background:
  Given land on shopping application 

  @tag2
  Scenario Outline: Shopping application
    Given login in an application with username <email> and password <pswd>
    When select the product <productName> and add to cart
    And checkout the <productname> and submit order 
    Then get the message from after place the order is "THANKYOU FOR THE ORDER"

    Examples: 
      | email                | pswd          | productName  |
      | chakri123@gmail.com |     Chakri@123 | ADIDAS ORIGINAL      |
      
