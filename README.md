README

Automation spec:
- Java
- TestNG annotation
- Selenium
- Cucumber
- Cucumber report

Design pattern for this automation is base on the page
for the Test step and Object is base on page on web app its make clear and easier for other contributor to check where the step is

for the scenario or feature file i make it in single file because the step will be end to end scenario
but for the step its reuse able in another feature file or scenario

Step for run the test

Dependency:

JDK 1.8
Up to date selenium (already included)
Cucumber
maven (pom.xml)

tools:
Intellij (personal preference)

Plugin:
Cucumber for java
Gherkin jetbrains

how run the test:

Test runner will be at TestRunner
The test will be using TestNG cucumber
Type scenario that want to run on "@tags" in TestRunner
Run TestNG in TestRunner

Reporting:

Capture screen will be in \goto-test-web-aut\target\cucumber-html-reports\screenshots order success

Reporting using cucumber generate report
for the report will be at \goto-test-web-aut\target\cucumber-html-reports



Happy Testing! Thank you




