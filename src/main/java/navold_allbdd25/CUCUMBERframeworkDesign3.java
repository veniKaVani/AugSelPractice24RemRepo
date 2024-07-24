package navold_allbdd25;

public class CUCUMBERframeworkDesign3 {
	
	/*
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
	 * 1. This component will be called the FEATURE file with the help of Gherkin
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
	 * 
	 * 2.SecondComponent:
	 * StepDefinition file: this is the technical doc in any programming language
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
	 */

}
