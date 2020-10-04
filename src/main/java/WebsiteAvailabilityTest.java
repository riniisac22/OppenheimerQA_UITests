import org.openqa.selenium.WebDriver;


import org.testng.annotations.Test;
import pages.mainPage;
import browser.BrowserFunctions;


public class WebsiteAvailabilityTest {

    void checkElementsOnPageLoad(WebDriver driver)
    {
        BrowserFunctions browser = new BrowserFunctions();
        try {
            browser.openWebsite(driver);


            //check if page loaded
            mainPage form = new mainPage();
            Integer testVariable = 1;
            if (form.getCSVFileUploadOption(driver) != null) {
                System.out.println("--Checkpoint Passed: CSV upload option is available");
            } else {
                System.out.println("--Checkpoint Failed: CSV upload option is not available");
                testVariable = 0;
            }

            if (form.getDispenseNowButton(driver) != null) {
                System.out.println("--Checkpoint Passed: Dispense Button is available");
            } else {
                System.out.println("--Checkpoint Failed: Dispense Button is not available");
                testVariable = 0;
            }

            if (form.getListBox(driver) != null) {
                System.out.println("--Checkpoint Passed: ListBox is available");
            } else {
                System.out.println("--Checkpoint failed: ListBox is not available");
                testVariable = 0;
            }

            if (testVariable == 1)
                System.out.println("*** TestCase Website Availability Check : Passed *** ");
            else
                System.out.println("*** TestCase Website Availability Check : Failed *** ");
        }
        catch(Exception e)
        {
            System.out.println("Exception occured during Page Load");
            System.out.println("*** TestCase Website Availability Check : Failed *** ");
        }
        //driver.close();

    }



}
