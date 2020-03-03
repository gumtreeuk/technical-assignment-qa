# Technical Assignment for Quality Engineers
This is the Gumtree UK technical assignment for Quality Engineers. You'll find two main automation tasks: 1) Webdriver and 2) API functional testing. These two tasks is required as part of this assignment.

At the bottom of this readme you'll find a Unit Test Challenge with 3 examples which is optional. We'd love you to pick one example of your choice and try to come up with an answer, if you can find some spare time.

The tasks below are simple and therefore we'd like simple solutions where you show good coding practices such as the clear folder structure, intuitive method names, Page Object Pattern and Object Oriented Principles as a starting point. We recommend you follow the coding guidelines below and read the tasks carefully.

### General Coding Guidelines:
* Don't check in unnecessary files. Use .gitignore to exclude bin folder and other unnecessary files.
* Granular commits – we want to see your thinking process.
* Following best coding practices ([SOLID](https://howtodoinjava.com/best-practices/5-class-design-principles-solid-in-java/), [DRY and KISS](https://dzone.com/articles/software-design-principles-dry-and-kiss), leverage [OOP principles](https://raygun.com/blog/oop-concepts-java/)).
* Clear, maintainable code.
* Leverage [design patterns](https://www.journaldev.com/1827/java-design-patterns-example-tutorial).
* Send us the repository link for the project along with the test results attached checked in as HTML report.
* Please use:
  * If you are applying for permanent position: Java + Cucumber + JUnit/TestNG or Scala + ScalaTest.
  * If you are applying for contract position: Scala + ScalaTest.

## QA Assignment  
## Task 1: Functional E2E Automation
Functional automation for web UI testing using Selenium Web Driver.
* Open Google and perform a search for ‘Cars in London’.
* Get all search results displayed and validate how many Gumtree links there are available (you may only focus on the first page of the search results for the purpose of this task).
* Navigate to each Gumtree link and confirm the title is displayed and the number of the results is greater than 0.

Requirements:
* If you use Java, please write a feature file in BDD style using Gherkin language. If you use Scala, ScalaTest is sufficient, you may use any testing style (e.g. FeatureSpec).
* Develop the automation framework for the above feature file / spec.

On average, this task can be completed in 2-3 hours, but you are welcome to spend more time on it to submit a better quality code.

## Task 2: Functional API Testing
Functional automation for API testing.
Write a test in Java or Scala for the following REST API:

https://jsonplaceholder.typicode.com/

Requirements:

* Get a random user (userID), print out its email address to console.
* Using this userID, get this user’s associated posts and verify they contains a valid Post IDs (an Integer  between 1 and 100).
* Do a post using same userID with a non-empty title and body, verify the correct response is returned (since this is a mock API, it might not return Response code 200, so check the documentation).

On average, this task can be completed in 2-3 hours, but you are welcome to spend more time on it to submit a better quality code.

## Unit Testing Challenge
We understand unit testing is not traditionally the job of a QA, and we don't expect you to know details about unit testing. However, in our company, we believe in collaborating closely with developers, taking them through the path towards a test first approach. This includes coaching ourselves to be able to coach them on how to improve the quality of their own tests. Our team goal is to ensure our test automation strategy follows the [Test Pyramid](https://martinfowler.com/articles/practical-test-pyramid.html) to ensure we have a quicker feedback on overall code quality and therefore are able to release faster, with higher quality.

It would be really nice if you have the time, to try to complete one out of the 3 tasks in the test-exercise folder.

**Task Details**
In total there are 3 tasks you need to complete. You'll need to follow instructions for each individual exercise in the [unit testing folder](https://github.com/gumtreeuk/technical-assignment-qa/tree/master/test-exercise). Please fork the code from there and create your tests in there.

On average, this task can be completed in 2-3 hours, once you have understood the unit testing concepts, but you are welcome to spend more time on it to submit a better quality code. Please not that you won't be required to use mocks for every unit, so please use your judgement.

**Here are our resource recommendations:**
* [The Practical Test Pyramid](https://martinfowler.com/articles/practical-test-pyramid.html) – Martin Fowler
* [Test Doubles](https://martinfowler.com/bliki/TestDouble.html) – Martin Fowler
* [XUnit Test Patterns](http://xunitpatterns.com/) – Chapter 11 -> Using Test Doubles
* [Definition of a unit test](https://www.artofunittesting.com/definition-of-a-unit-test)
* [Test Review Guidelines](https://www.artofunittesting.com/unit-testing-review-guidelines/)
* [Mockist vs. Classicist](https://medium.com/@adrianbooth/test-driven-development-wars-detroit-vs-london-classicist-vs-mockist-9956c78ae95f)

Thanks for taking part in our selection process and good luck!
