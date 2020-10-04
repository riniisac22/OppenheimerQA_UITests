# OppenheimerQA_UITests

The framework is created to test the UI aspects of the Oppenheimer Dev Project.

## Tools
##### 1. Selenium
##### 2. Maven
##### 3. IntelliJ IDEA
##### 4. TestNG(pending Framework)

## Pre-Requisite:
##### 1. Test Build to be deployed on the QA Environment – In this case – localhost:8080

## To proceed further:

##### 1. Download and clone this repository to your machine. 
##### 2. Update Relative File paths:
       - /src/test/java/OppenheimerTestSuite/main:
       "System.setProperty("webdriver.chrome.driver","/Users/riniisac/Rini_Documents/Oppenheimer/seleniumDependencies/drivers/chromedriver");"
       -/src/main/java/AddEmployeeCSVTest/CheckEmployeeAddedSuccessfully:
       "page.uploadCSV(CSVUpload, "/Users/riniisac/Rini_Documents/Oppenheimer/GDSQASolution/src/main/resources/ValidCSV/Valid.csv");"
##### 3. Run the Test Suite from INtelliJIDE Run option or directly from the Main Function. 




##### 4. For the timebeing Test results are only available in the Terminal when test is Run

_P.S: I was a little pressed for time this week. Could not implement the TestNG Framework._

QA
