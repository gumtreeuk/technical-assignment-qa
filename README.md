# Quality Assurance – Gumtree Technical Test

## What we are looking for:
### Coding tasks:
* Granular commits – we want to see your thinking process.
* Following best coding practices (SOLID, DRY, KISS, leverage OOP principles).
* Clear, maintainable code.
* Leverage design patterns.
* Send us the repository link for the project along with the test results attached checked in as HTML report.
* Please use:
  * If you are applying for permanent position: Java + Cucumber + JUnit/TestNG or Scala + ScalaTest.
  * If you are applying for contract position: Scala + ScalaTest.
  
### Test Design task:
* Structured approach - we want to see your thinking process.
* Leverage test design techniques.
* Prioritisation of the tests.

## Task 1

Functional automation for web UI testing using Selenium Web Driver.
* Open Google and perform a search for ‘Cars in London’.
* Get all search results displayed and validate how many Gumtree links there are available (you may only focus on the first page of the search results for the purpose of this task).
* Navigate to each Gumtree link and confirm the title is displayed and the number of the results is greater than 0.

Requirements:
* If you use Java, please write a feature file in BDD style using Gherkin language. If you use Scala, ScalaTest is sufficient, you may use any testing style (e.g. FeatureSpec).
* Develop the automation framework for the above feature file / spec.

On average, this task can be completed in 2-3 hours, but you are welcome to spend more time on it to submit a better quality code.

## Task 2

Functional automation for API testing.
Write a test in Java or Scala for the following REST API:
* Get a random user (userID), print out its email address to console.
* Using this userID, get this user’s associated posts and verify they contains a valid Post IDs (an Integer  between 1 and 100).
* Do a post using same userID with a non-empty title and body, verify the correct response is returned (since this is a mock API, it might not return Response code 200, so check the documentation).

On average, this task can be completed in 2-3 hours, but you are welcome to spend more time on it to submit a better quality code.

## Task 3

### Test Design.
Project Specification:
Below is the prototype for a web application that will process the date of birth (in dd/mm/yyyy format) and display the age. A user can input the numbers into the application and click on a calculate button to see the result.

![Task 3](/imgs/img.png)
 
### Task:
Write test cases for the application. These may include the expected results or be a simple checklist. 
For example, a checklist might contain:
* Spelling and Grammar:
* All spelling is correct
* All grammar is correct
* Words correctly describe the purpose of the application
* …

