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

Output Format:

```
# To get CSV Upload Option availability
--Checkpoint Passed: CSV upload option is available
# To get Dispense Button Option availablity
--Checkpoint Passed: Dispense Button is available
# To Check Listbox availability
--Checkpoint Passed: ListBox is available
*** TestCase Website Availability Check : Passed *** 
# To get CSV Upload Option availability
# To Check the upload of INput CSV File with EMployee List
# To Check taxReliefRefresh Button availability
# To Check if List is populated after File upload
*** Test Case CSVFile Upload : Passed *** 
# To check if Dispense Now Button is Red in Color
--Checkpoint Passed: Dispense Now Button color = RED
# To check if Dispense Now Button Text is as expected
--Checkpoint Passed: Dispense Now Button Text is as Expected
# To get Dispense Button Option availablity
Check confirmation page
--Checkpoint Passed: Dispense Now Button works as expected
*** TestCase Dispense Funds Functionality : Passed ***

```

_P.S: I was a little pressed for time this week. Could not implement the TestNG Framework._

QA
