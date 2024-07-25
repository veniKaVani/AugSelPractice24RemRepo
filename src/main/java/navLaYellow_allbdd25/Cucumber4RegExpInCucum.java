package navLaYellow_allbdd25;

public class Cucumber4RegExpInCucum {
	/*
	 * --------------------redlined comments in # which appear on Navs feature file
	 * #Author: your.email@your.domain.com
	 * #Keywords Summary:
	 * #Feature: List of Scenarios
	 * #Given: Some precondition step
	 * #When: Some key actions
	 * #Then: To observe outcomes or validation
	 * #And, But: To enumerate more Given,When,Then steps
	 * #Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
	 * #Examples: Container for a s table
	 * #Background: List of steps run before each of the scenarios
	 * #""" (Doc Strings)
	 * #| (Data Tables)
	 * #@ (Tags/Labels): To group Scenarios
	 * #<> (place holder)
	 * #"" 
	 * ## (Comments)
	 * #Sample Feature Definition Template
	 * 
	 * Feature: Amazon Search
	 * 
	 * Given I have a search field on Amazon Page
	 * When I search for a product with name and price
	 * Then Product with name should be displayed
	 * Then Order id is 12345 and username is "veni@myyahoo.com"
	 * 
	 * 
	 * 
	 * Two types of REg Expressions in Cucumber:
	 * 
	 * 1.Regular Expression -->[0-9]+, (\\d+)
	 * 2.Cucumber Expression (2017)
	 * 
	 * rules:
	 * 1.Step def file will be generating cucumber exp by default
	 * 2.But you can use regular exp also in step def file
	 * 3.You can mix both regular and cucumber exp in step definition file
	 * 4.But you can not mix both expressions in a step definition method
	 * 
	 * {string} -- cucumber expression
	 * {string} {int} {float} --cucumber expression
	 * 
	 * REgular Expressions:
	 * 
	 * ([0-9]) -->capture group --> 0-9 digits appear
	 * 
	 * Quantifiers in Reg Exp:4 kinds -- + * ? {n}
	 * Quantifier: means Define --> how many times a character needs to be occurred
	 * {4} ==> means 4 digits will be occurred
	 * ([0-9]{4})==>means between 0-9 4 digits can be occurred-any combinations of nos
	 * between 0-9 range
	 * 
	 * ([0-9]+) --> 0-9 digits appear (once or more)
	 * means between 0-9 digits-it might occur once OR more than once
	 * 
	 * ([0-9]{4}) --> 0000 , 9999, 1212, 3456, 1234, 8888
	 * ([0-9]*) --> zero or more
	 * ([0-9]?) --> zero or once
	 * 
	 * Short hand characters in a regular expression(search on Google-www.oreilly.com)
	 * \d -- numeric digits
	 * \d ==> Backslash d means--Adds all digits to the character class
	 *                            Matches a single digit,if used outside character
	 *                            class
	 *  \w ===> is used for all the words
	 *  \s ===> is used for the white spaces, tabs, and characters                          
	 * (\d+)
	 * 
	 * ([a-zA-Z0-9]+) ===> a-z A-Z 0-9 appears more than once because of + symbol
	 * 
	 * -------------SO ACCORDINGLY U CAN CREATE UR REG EXPRESSIONS ALONG WITH THE 
	 * QUANTIFIERS AND USE IN UR STEP DEFN FILE
	 * 
	 * Cucumber Expression and the Normal Reg expression---cannot be together in the
	 * same step/method********************IMP
	 * examples1:
	 * if i want to write any kind of numeric digit for {price}
	 * then i simply write
	 * (\d+)
	 * + for more than once appearance
	 * u will see an error when u write (\d+) saying invalid sequence
	 * since java does not understand-so introduce one escape seq here with \
	 * the error will be gone
	 * (\\d+)
	 * 
	 * examples2:
	 * now to express "Apple Macbook Pro"
	 * which is written in double quotes
	 * so we have to write reg exp within double quotes first of all
	 * ("I search for a product with name "" and price (\\d+)")
	 * ---java doesnot understand and will treat the second double quote-as the
	 * end quote for string
	 * --Soln is to add one more escape character for both the strings==>
	 * ("I search for a product with name \"\" and price (\\d+)")
	 * then create one more capture gp + []
	 * ("I search for a product with name \"([])\" and price (\\d+)")
	 * then to express I want to have other than double quotes - any exp
	 * other than double quotes-because in Apple Mac Book- we do not have any double 
	 * quote here--so I want to escape that particular double quote also
	 * ("I search for a product with name \"([^\"]+)\" and price (\\d+)")
	 * ===> so one more backslash plus one more special character symbol ^
	 * carrot is used here, Also one more + is used here
	 * 
	 * \"([^\"]+)\"
	 * 
	 * REPRESENTS Apple Mac Book==> is replaced by the above exp
	 * ==> it is not flagged on cucumber console and it is being captured
	 * ---when u run configuration it picks up the price for Apple Mac Book
	 * to be $1000
	 * $1000
	 * is represented by ==> is replaced by in code
	 * ((\\d+)$)
	 * 
	 * ********for Latest Cucumber version 6 *****
	 * ALWAYS REMEMBER THE 4 RULES: listed above
	 * 
	 * These are the basic REg Exp, Capture Gp, Quantifiers
	 * Short Hand chars
	 * explained here
	 * 
	 * 
	 * 
	 */
		
		

}
