package navold_allbdd25;

public class BDDtheory1 {
	
	/*
	 * BDD: behaviour driven development-is an approach/design pattern
	 *      Cucumber is a bdd
	 *      to understand cucumber before we need to understand bdd
	 *      cucumber is not the only bdd
	 *      ---we need to understand-TDD vs BDD Process-------------
	 *      
	 * TDD: traditional development process-
	 * ---is like Po and BAs talks to Stake holders about the business requirements
	 * and Stake holders gives instructions about the business needs
	 * then the PO/BA writes the requirements in the form of BRD/BRS/UserStory
	 * ===>a typical water fall methodology can be applied over here
	 * Dev team will design the system(Architecture), then write the code and in
	 * the mean time testers will also write the tcs based on those requirements
	 * --they will follow the complete regression cycle over here,complete bug cycle
	 * will be followed --AND FINALLY FINISH THE PRODUCT
	 * then the technical writers/content writer writes the tech Doc
	 * ----BUT
	 * the problem here they are all working in asylo and there is no collaboration
	 * at all---they are all not on the same page/understanding
	 * Stake HOlder: who is at the top level,giving the reqment to the Po/BA
	 * doesnot participate in the discussions, no brainstorming done around the 
	 * reqment, they do not raise any Qs at all-like why it is happening, how
	 * exactly it is happening,how exactly we have to develop the things  etc...
	 * egs: could be a waterfall model that we follow in the Agile process
	 * Here we have to write the unitlevel tcs, analyse the tcs, keep refactoring/enhancing
	 * the code accordinglya then we will follow a typical test driven approach
	 * 1.Stake holders tell product owners/BA about business needs
	 * 2.PO/BA writes the requirements
	 * 3.Dev Team starts writing the code Parallely 4.Testers starts to write tcs
	 * 5.Both Dev team complete writing the code and testers test the tcs against
	 * the build ==> The finished Product is ready
	 * 6.Tech writer--->Doc
	 * 
	 * To overcome the dis-advantages/failures in the TDD approach-BDD came into pic
	 * 
	 * BDD Process: means everybody is on the same page first of all
	 * Here all the team members - the Amigos are all working on a common understanding
	 * More collaboration happens-they talk, discuss about the requirement,
	 *  the PO/BA/QA sit with the Stake holders,try to understand the customers problem
	 * --they try to understand what kind of business the customer needs and then
	 * and they try to convert the reqment into a USER STORY or some kind of
	 * documentation like BRD
	 * ----the requirements gets collected as the OUTPUT of the discussions
	 * by the 3 Amigos with the Stake holder
	 * ---In BDD terminology the PO/BA/QA ---are termed the THREE AMIGOS
	 * The Amigos then sit and talk, brainstorm around the requirement a lot
	 * --raise Qs like What they are developing, Why they are developing, How
	 * they are developing etc......
	 * they also collaborate and discuss on What are the other Scenarios according
	 * to the business Requirement, what are the diff ex's that satisfies the
	 * business process?
	 * Finally, they agree upon some Gherkin=>plain English language terminology 
	 * to develop the Scenarios
	 * they give ex's of diff requirements that satisfy the business needs
	 * for that Scenario
	 * DURING THIS PROCESS of defining the scenarios/features
	 * they again ask Qs
	 * why we are doing this?
	 * How exactly are we going to do this?
	 * What are the diff approaches that they can follow?
	 * The 3 Amigos discuss, give the feed back to the stake holders
	 * -------------------CUCUMBER
	 * To design the Gherkins Features-there are certain tools available in the
	 * market and Cucumber is one of them
	 * several others are JBehave,
	 * ---WE CANNOT CUCUMBER IS BDD
	 * BDD: is a diff methodology
	 * Cucumber: is an automation tool which supports BDD
	 * ---------------------------------BDD Process
	 * Once the Scenarios are available in the form of Feature files
	 * 1. it will be shared with the QA team and the Dev team
	 * 2. QA team uses the scenarios to write their manual tc's 
	 *                    AND
	 *    DEV team uses them to start writing the code, write their unit level
	 *    tcs and Keep refactoring their code till the tc's until they PASS
	 *    
	 *  3. Then the tcs are automated by Devs- Automated Test Report is given 
	 *  to the PO
	 *  4. They will fix the problems as per the Test Report and again
	 *  execute the tcs to see they pass-either manual or Automated
	 *  and then they FINISH the PRODUCT
	 *  ***************So this is the typical BDD approach
	 * The main fundamental behind the BDD process is that they collaborate
	 * more, brainstorm about the requirements, discuss, Ask the Qs revolving
	 * around the requirement 
	 * And then finally WRITE SCENARIOS/USER STORIES around the requirement
	 * in the form of plain english sentences => GHERKINS language
	 * *********GIVEN, WHEN, THEN
	 * only after every one agrees and is on the same page in the form of 
	 * FEATURES they have defined
	 * 
	 * These FEATURES are then used by every one in the team PO/Dev/QA
	 * to write code, test the code until the FINISHED product is produced
	 * The Tech writer also uses the same feature file to write the documentation
	 * as well
	 * ---There is this common Q that if Automation really necessary in BDD?
	 * Automation testing is up to the client, if there are no resources 
	 * available, they can just do it by running the tcs manual and generating
	 * the report-and use this report to enhance the code, refactor etc...
	 * and then they can give the report to the stake holder
	 * ----------Then if they have the band width and budget to afford for
	 * Cucumber tool -then they can have automation done
	 * 
	 * THE MOST IMP COMMON BASE for BDD: is the FEATURE file in the form of
	 * GHERKINS Keywords
	 * 
	 * BDD Process:
	 * 1.Stake holders+PO/BA --Both talk about the business requirement
	 * ===>they collaborate more on preparing the BRDocs
	 * 2.THREE AMIGOS-PO+DEV+QA:
	 * collaborate around the requirement 
	 * 3.The 3 Amigos agree upon the req as English Formatted Scenarios[GHERKIN]
	 * ===> Given, When, Then
	 * 4.QA Team: uses the Gherkin language Scenarios for manual Tcs
	 * 5.Dev uses the scenarios for Automated tests
	 * 6.Automation Test Report Generated using the Features
	 * 7.Finish and Package the PRODUCT
	 * 
	 */

}
