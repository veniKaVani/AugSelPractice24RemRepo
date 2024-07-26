package navLaYellow_allbdd25;

public class CrashBDDminiIntelliJNotes {
	/*
	 * How to create the entire BDD Cucumber Prj on intelliJ??
	 * ------------3 components
	 * Pageclasses : should be maintained in src/main/java --in separate pkg- Pages
	 *               will have locators for UI elements,and the page Actions
	 *               Also Page Objects=>ObjRefVars should be created=>initialization
	 *               Every web page should have a separate Java class
	 *               
	 *               this could be called one component as well lets say 3rd imp component
	 *               
	 *       PAGE CLASSES SHOULD BE CREATED UNDER: src/main/java
	 *       -------------------inside a separate package---com.app.pageName
	 * 
	 * If there are multiple Scenarios-that has the same pre-condition
	 * e.g: for Login page TCs-user needs to be on login page
	 * Instead of writing several Givens: When User is on Login page
	 * -----------Background keyword is used --to avoid repetition and this key
	 * would apply it for all the scenarios 
	 * 
	 * 1.Feature file: in the form of Gherkins key words-Given,When, Then, And
	 * --Create Multiple Features---EACH HAVING
	 * --create multiple scenarios
	 * --These feature files should have a mapping into/under StepDefnfile(which has to be
	 *    written in java code) ===> .java
	 *    
	 *    
	 *    SHOULD BE CREATED UNDER : src/test/resources
	 *    Under resources--it should be folder-in which a file created
	 *    
	 * 2.Step Defn File:
	 *    ===>All Given When Then And
	 *    ---has to be written in the form of annotations
	 *    ---@Given
	 *    ---@When description of the step
	 *    ---@Then description for the step
	 *    ---@And description for the respective step/action
	 *    
	 *   SHOULD BE CREATED UNDER: src/test/java
	 *   -----------------inside a separate package
	 * 
	 * the step defn file will not have the direct Selenium code written there-it has
	 * only and only testng annotations with embedded testng methods and assertions/validations
	 * ---the selenium reqd for the Tc will be called from the respective page classes, which
	 * in turn call the Custom Utility classes-e.g: ElementUtility, BrowserUtility, StringUtil
	 * JavascriptUtil, constantsUtil, ErrorsUtil etc...
	 * ----for the respective browser related, element related works
	 * 
	 * 4rth Component:
	 * Test Runner File:
	 * we need this file - which acts as a testng file - where from to run the tcases
	 * Here we will use cucumber + testng
	 * we will create the test runner with the help of cucumber ACTIONs
	 * and we will define the FEature File PATH and STepDefn File PATH in this class
	 * because with testng we could run tests, and also scenarios for the tc's in the parallel
	 *  mode
	 *  Junit: scenario wise Parallel execution cannot be done with Junit
	 *  we will define Feature file path AND step defn path
	 *  
	 *  TEST RUNNER ALSO CREATED: under src/test/java
	 *  ---------------inside runner package
	 *  MAP THIS FILE WITH TestNG.xml file
	 *  
	 * 
	 * testng.xml will read the Test Runner and execute the TC's
	 * AND give the configuration as Parallel = "test" or "classes"
	 * 
	 * TESTNG.XML CREATED UNDER: src/test/resources
	 * --------------------as a file
	 * this file could be executed as testng file as well as with the maven build also
	 * Run---> Maven ---
	 * push the code onto Git-take url from there and create jobs on jenkins UI-trigger them
	 * from the jenkins pipeline job as well---
	 * 
	 * REPORTS:
	 * we can get both the html + JSon Reports on the cloud and in the local also
	 * --------------------TECHNOLOGIES USED
	 * for java technology-we use maven prj==>for build automation and mgmt pt of view, 
	 * for automation point of view - we use pom.xml for dependency and plugin maintenance
	 * ******************THIS IS THE OVERALL ARCHITECTURE*******************************
	 * 
	 * fresh prj creation on eclipse_Mywork
	 * ------------------------------------
	 * Started a new maven prj
	 * in pom.xml-the properties section updated the jdk to 1.8 version instead of 1.7
	 * remove junit since we r not going to use it
	 * -------couple of dependencies need to be added
	 * which are
	 * cucumber-java(7.11.1)
	 * cucumber-testng(7.11.1)
	 * 
	 * testng ---separate dependency(7.7.1)
	 * selenium-java  ---as well(4.8.3)
	 * --------------NOW UPDATE THE MAVEN PRJ
	 * will start configuring all dep's into ur system
	 * 
	 * 
	 * 
	 * 
	 */

}
