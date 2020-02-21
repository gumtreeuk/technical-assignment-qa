# Technical Assignment for Quality Assurance

### General Coding Guidelines:
* Granular commits – we want to see your thinking process.
* Following best coding practices ([SOLID](https://howtodoinjava.com/best-practices/5-class-design-principles-solid-in-java/), [DRY and KISS](https://dzone.com/articles/software-design-principles-dry-and-kiss), leverage [OOP principles](https://raygun.com/blog/oop-concepts-java/)).
* Clear, maintainable code.
* Leverage [design patterns](https://www.journaldev.com/1827/java-design-patterns-example-tutorial).
* Send us the repository link for the project along with the test results attached checked in as HTML report.
* Please use:
  * If you are applying for permanent position: Java + Cucumber + JUnit/TestNG or Scala + ScalaTest.
  * If you are applying for contract position: Scala + ScalaTest.
  
## Task 1
### Test Case Generation
Based on the project specification below, generate with a set of test cases. We're looking for a structured approach, where you leverage [test design techniques](https://testautomationresources.com/software-testing-basics/software-test-design-techniques/) and how you prioritise your tests. The test cases also may include the expected results or be a simple checklist such as:
* Test Case 1 - Spelling and Grammar:
  * All spelling is correct
  * All grammar is correct
  * Words correctly describe the purpose of the application
  * …

**Project Specification:**
Below is the prototype for a web application that will process the date of birth (in dd/mm/yyyy format) and display the age. A user can input the numbers into the application and click on a calculate button to see the result.

![Task 3](/imgs/img.png)
 

## Task 2
### Functional E2E Automation
Functional automation for web UI testing using Selenium Web Driver.
* Open Google and perform a search for ‘Cars in London’.
* Get all search results displayed and validate how many Gumtree links there are available (you may only focus on the first page of the search results for the purpose of this task).
* Navigate to each Gumtree link and confirm the title is displayed and the number of the results is greater than 0.

Requirements:
* If you use Java, please write a feature file in BDD style using Gherkin language. If you use Scala, ScalaTest is sufficient, you may use any testing style (e.g. FeatureSpec).
* Develop the automation framework for the above feature file / spec.

On average, this task can be completed in 2-3 hours, but you are welcome to spend more time on it to submit a better quality code.

## Task 3
### Functional API Testing
Functional automation for API testing.
Write a test in Java or Scala for the following REST API:

https://jsonplaceholder.typicode.com/

Requirements:

* Get a random user (userID), print out its email address to console.
* Using this userID, get this user’s associated posts and verify they contains a valid Post IDs (an Integer  between 1 and 100).
* Do a post using same userID with a non-empty title and body, verify the correct response is returned (since this is a mock API, it might not return Response code 200, so check the documentation).

On average, this task can be completed in 2-3 hours, but you are welcome to spend more time on it to submit a better quality code.

## Task 4
### Unit Testing
We understand unit testing is not traditionally the job of a QA, however, in our company, we believe in collaborating closely with developers, taking them through the path towards a test first approach. This includes coaching ourselves to be able to coach them on how to improve the quality of their own tests. Our team goal is to ensure our test automation strategy follows the [Test Pyramid](https://martinfowler.com/articles/practical-test-pyramid.html) to ensure we have a quicker feedback on overall code quality and therefore are able to release faster, with higher quality.

**Here are our resource recommendations:**
* [The Practical Test Pyramid](https://martinfowler.com/articles/practical-test-pyramid.html) – Martin Fowler
* [Test Doubles](https://martinfowler.com/bliki/TestDouble.html) – Martin Fowler
* [XUnit Test Patterns](http://xunitpatterns.com/) – Chapter 11 -> Using Test Doubles
* [Definition of a unit test](https://www.artofunittesting.com/definition-of-a-unit-test)
* [Test Review Guidelines](https://www.artofunittesting.com/unit-testing-review-guidelines/)
* [Mockist vs. Classicist](https://medium.com/@adrianbooth/test-driven-development-wars-detroit-vs-london-classicist-vs-mockist-9956c78ae95f)

**Task Details**
In total there are 3 tasks you need to complete. You'll need to follow instructions for each individual exercise in the [unit testing repository](https://github.com/loiccara/technical-assignment-qa/tree/master/test-exercise). Please fork the code from there and create your tests in there.

On average, this task can be completed in 2-3 hours, once you have understood the unit testing concepts, but you are welcome to spend more time on it to submit a better quality code. Please not that you won't be required to use mocks for every unit, so please use your judgement.
