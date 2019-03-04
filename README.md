# JavaFramework

This is a basic Java Selenium-Cucumber front-end test automation framework I created for fun

Quick set up instructions

  1. Create a folder on your C drive called SeleniumDrivers and dowload chromedriver.exe and geckodriver.exe(for firefox) into that     folder.

2. In order to run the test, add a maven configuration with the command line clean test.

3. By default the browser selected will be chrome. If you want to change it to firefox you need create an environment variable with the key BROWSER and the value firefox. In IntelliJ this would be under the runner tab of the maven configuration. 

4. Test results will be under target/cucumber-html-report

That's it have fun.
