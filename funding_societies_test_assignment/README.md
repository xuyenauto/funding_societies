# cucumber-automation-test

The framework using Cucumber + Selenium (Java) + Page Object Pattern (include page factory)  + Maven
to automate web application

What is this repository for? git@github.com:xuyenauto/funding_societies.git


Configuration
 - Install Java 8 version
 - Install an IDE (Eclipse| IntelliJ)
 - Install Cucumber plugin in your installed IDE
 - Install Maven 3 version at least (I'm using version 3.3.9)
 - git clone git@github.com:xuyenauto/funding_societies.git
 - Import the project in your installed IDE
 - run maven to download dependencies by command mvn test

Before run tests
 - Access to config.json file to set up something that you want to run like URL, browser and so on
    + browser: currently, it supports Chrome & Firefox.
    + url: the environment that you want to run
    + time_out_second: time out wait for element

How to run tests
 - Refer the ui.feature file
 - right click and run scenario what you want
- run via maven by typing 'mvn test' on the terminal

How to view the report
- Assess folder report at automation_test\target\cucumber-html-reports
- open the overview-features.html file

Troubleshooting
1.Error: Could not find or load main class io.cucumber.core.api.cli.Main
Solution
- Delete all configurations and also remove cucumber java by selecting and clicking the "-" 
- Add a new configuration for cucumber java and fill in "cucumber.api.cli.Main" as main class

2.You can implement missing steps with the snippets below:
Solution:
- Check the cucumber for java plugin
- Check the configuration to make sure the value "cucumber.api.cli.Main" is set.


--Contact Information
If any idea/feedback please mail to khacxuyenit@gmail.com
