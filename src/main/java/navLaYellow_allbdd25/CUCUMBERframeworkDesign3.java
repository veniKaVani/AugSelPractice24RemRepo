package navLaYellow_allbdd25;

public class CUCUMBERframeworkDesign3 {
	
	/*
	 * MyShortNotes: 
	 * 1.FeatureFiles: has all scenarios/features---pointing to its StepDefnFile 
	 * 2.StepDefnFile: has all GherkinkeywordAnnotations
	 * 3.TestRunner:   has CucumberOptions, JunitRunner, FeaturePath, StepDefnPath
	 *                 Report
	 * 
	 * CUCUMBER framework design:
	 * What are the diff files? options?
	 * We will be using eclipse to create the FEATURE file and the STEP DEFN
	 * -----we will see how to create a basic feature file, step definition
	 * and the Runner
	 * Before that we will have to design some components here
	 * First of all in BDD we have 
	 * User Story in the form of Requirement Document/BusinessReqDoc/SRS
	 * -----then PO/Dev/QA-will collaborate, discuss on the userstory 
	 * and create multiple features/Scenarios AND there can be multiple features
	 * first component--->
	 * 1. FEATURE FILE:
	 * ------------------------
	 * This component will be called the FEATURE file with the help of Gherkin
	 * Key words
	 * Gherkin: is Gherkin DSL(domain specific language) language
	 * How to create a feature file??
	 * multiple features in this file-feature1, feature2.....featureN
	 * in the same one feature-there can be multiple scenarios as well/scenario
	 * outlines will be there with diff egs
	 * --for each scenario-will write diff steps there
	 * file1.feature(Login.feature)
	 * in this file multiple scenarios and in each scenario-there will be
	 * multiple steps==>in the form of Gherkins keywords
	 * GIVEN
	 * WHEN
	 * THEN
	 * AND
	 * file2.feature(Search.feature)
	 * file3.feature(AddToCart.feature)
	 * file4.feature(payment.feature)
	 * ---this is not technical/javaCode/ProgrammingCode-is just plain English
	 * 
	 * SecondComponent--->
	 * 2.STEP DEFINITION FILE:
	 * ----------------------
	 *  this is the technical doc in any programming language
	 * java/python/ruby/javascript
	 * here we are using Cucumber with Java
	 * In this file--for each and every  feature---we will be mapping with the
	 * Gherkins - Given method, When method, Then method, And method
	 * will write separate methods for each annotation-@Given,@When, @And, @Then
	 * ---Here we will be creating a class called StepDefinition.java
	 * and will write some methods here-the method will behave as a step here
	 * Cucumber/JVM library will those annotations/methods
	 * These annotations-have a method each which behaves like a step here
	 * here will be defining which particular method is responsible for that
	 * particular step and these steps
	 * ****will then later on convert into multiple utilities
	 * The step methods will be calling the utilities created in the POM
	 * ===> can call the DB Utility, ExcelUtility, BrowserUtility/driverFactory,
	 * ElementUtility, StringUtility etc....
	 * eg: for certain methods/wrappers which we have written in the utilities
	 * To interact with the excel file-will write some ExcelUtility.java--which
	 * could be called from the Tc
	 * The mapping is very imp: the Given from the FeatureFile ---will be mapped to
	 * @Given
	 * |||ly the When, And, Then----will be mapped to corresponding
	 * @When, @And, @Then
	 * ----------So we will multiple one-one mapping from the Feature file --->
	 * the StepDefn file
	 * ======>multiple stepDefns for LoginFeature, SearchFeature, AddToCartFeature...
	 * ---------Each and every mapping is done from the respective feature file
	 * *************Once all of this is done
	 * We can directly execute the feature file from the feature file itself
	 * OR
	 * We can create a RunnerFile
	 * So the Third component--THE RUNNER FILE---comes into existence
	 * 
	 * third component--->
	 * 3.TEST RUNNER FILE:
	 * -----------------------
	 * The TestRunner.java ---will be using some-DiffTags defined here
	 *     Cucumber Options
	 *     Junit
	 *     we will be defining some basic annotations with diff options like--
	 *     where exactly ur feature file path here
	 *     where exactly is ur step defn file path here
	 *     In which format u want to execute-REPORTS
	 *     Can define some tags over here,
	 *     Also lot of other options that we will see --inside the TestRunner.java
	 *     
	 *     So the TestRunner.java -----------
	 *     will interact first with the feature file
	 *     --it will go to the feature because of the path given
	 *     then from feature file
	 *     --it will go to the stepDefn file
	 *     because each and every feature is already integrated with the corresponding
	 *     StepDefnFile
	 *     so will go to the corresponding annotation
	 *     and start executing the testng code-underneath the methods
	 *     the testng classes will calling the utilities accordingly
	 *     executes as per the TC and Generate The REPORTS
	 *     -------------THIS IS THE FLOW----------------
	 *     
	 *     CUCUMBER PLUGIN:
	 *     This Cucumber Eclipse Plugin--will improve the READABILITY
	 *     ---By highlighting the Features, Annotations 
	 *     ---in respective colors ===> Readability is improved
	 *     ---Lot of other features are also added thru this Plugin
	 *     
	 *     HENCE FORTH creating all the files inside a maven project
	 *     
	 */

}
