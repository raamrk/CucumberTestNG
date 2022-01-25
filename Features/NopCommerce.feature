

Feature: Login

Background:
Login to the application
    Given Open application 
    When Enter userName "admin@yourstore.com" and Enter password "admin"
    And Click Login

    
    
 	Scenario: Add new customer

 	Given Navigate to customer page
 	When Fill the customer details Firstname & Lastname and click on submit
 	
 	
 	#Examples:
 	#| Firstname | Lastname |
 	#| John|  Peter|
 #| James |  Thomas|

    
    
    
    
    
    
    
    
    
    
    
    

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
