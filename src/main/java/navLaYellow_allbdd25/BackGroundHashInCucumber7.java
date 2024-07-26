package navLaYellow_allbdd25;

public class BackGroundHashInCucumber7 {
	/*
	 * #BACKGROUND:
	 * if many scenarios has the same existing pre-condition, then to stop repetition
	 * of the pre-condition - the BackGround keyword is used
	 * so all the TC's will loop this BackGround step-BEFORE STARTING THE EXEC OF TC
	 * 
	 * e.g: for using Amazon app-user needs to login=>enter email, password then hit
	 * login btn
	 * To see the previous order details--Go To SearchOrders
	 * ----then the user can go to other tabs as well on this page
	 * LIKE Buy Again, Open Orders, Cancelled Orders
	 * ----can chk Orders tab again with multiple options
	 *     past 3 months
	 *     based on years etc...
	 *     
	 *   these are the scenarios for a user who is on ORDER DETAILS PAGE
	 *     SO creating a feature file with multiple scenarios for a user who is on
	 *     this page
	 *     ********Order.feature
	 *     
	 *     Feature: Amazon Order Page
  In order to check my order details
  As a registered user
  I want to specify the features of order details page
  
  Scenario: Check Previous Order Details
    Given a registered user exists
    Given user is on Amazon login page
    When user enters username
    And user enters password
    And user clicks on login button
    Then user navigates to order page
    Then user checks the previous order details
    
    Scenario: Check the Order Details
      Given a registered user exists
      Given user is on Amazon login page
      When user enters username
      And user enters password
      And user clicks on login button
      Then user navigates to order page
      Then user checks the previous order details
      Then user checks the open order details
      
      Scenario: Check the cancelled order details
        Given a registered user exists
        Given user is on Amazon login page
        When user enters username
        And user enters password
        And user clicks on login button
        Then user navigates to order page
        Then user checks the previous order details
        Then user checks the cancelled order details
        
       ---------------------------These above steps are not systematically written
       over here and are not readable
	 * To avoid these unnecessary no. of lines again and again
	 * -----there needs to be introduced one keyword called BackGround
	 * that references to all the common steps all together--which is kind of a 
	 * PRE-CONDITION for all the scenarios to follow initially before the start of
	 * exec of the TC
	 * ----cucumber also flags all the common steps in yellow as well
	 * if it doesnot then 
	 * Right click on the Maven Prj-->Mvn--->update the prj
	 * the common lines get bolded in yellow
	 * ****SO IMPROVE THIS FEATURE FILE USING: BackGround keyword
	 * write 
	 * Background:
	 * Cut and copy paste all the common lines-MODIFIED Order.feature------->>
	 * 
	 * Feature: Amazon Order Page
  In order to check my order details
  As a registered user
  I want to specify the features of order details page

  Background:
    Given a registered user exists
    Given user is on Amazon login page
    When user enters username
    And user enters password
    And user clicks on login button
    Then user navigates to order page


  Scenario: Check Previous Order Details
    When user clicks on Order link
    Then user checks the previous order details

  Scenario: Check the Order Details
    When user clicks on open order link
    Then user checks the open order details

  Scenario: Check the cancelled order details
    When user clicks on cancelled order link
    Then user checks the cancelled order details

	 * Now this particular feature file is more elegant, more readable
	 * and each and every scenario
	 * focuses on exactly what to be tested
	 * 
	 * BACKGROUND:
	 * The property of this key word is that it will be executed 
	 * for each and every scenario
	 * 
	 * if there are a total of 10 scenarios
	 * 'Background' gets executed 10 times
	 * 
	 * ------------select the dot feature-->Run Config--> U will get the stepDefns
	 * on console
	 * copy paste that into the step Defns file
	 * ------create stepDefnFile in src/test/java----inside a separate pkg
	 * OrdersStepDefs.java
	 * copy paste the code from console
	 * import all annotations
	 * Reformat the code-removing all the comments and write proper code inside
	 * ---this code should be calling the page class as well
	 * ------So the OrdersPage.java -----should have been ready BEFORE inside
	 * src/main/java
	 * ------so once the feature file is written with Cucumber tool
	 * then any tool can be used to automate the bbrowser-Sel, python...etc...
	 * ***********BackGround should be short and limited
	 * ***********Do not write very complex steps here
	 * Like wise many scenarios/used cases can be automated
	 * 
	 * Creating TestRunner:
	 * to execute the scenarios 
	 * 
	 */
			
			
			

}
