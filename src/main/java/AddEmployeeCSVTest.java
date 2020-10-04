import browser.BrowserFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.mainPage;
public class AddEmployeeCSVTest {
    void CheckEmployeeAddedSuccessfully(WebDriver driver)
    {
        BrowserFunctions browser = new BrowserFunctions();
        try {
            browser.openWebsite(driver);

            //getCSV fIle
            mainPage page = new mainPage();

            WebElement CSVUpload = page.getCSVFileUploadOption(driver);

            //todo Parameterize File path
            page.uploadCSV(CSVUpload, "/Users/riniisac/Rini_Documents/Oppenheimer/GDSQASolution/src/main/resources/ValidCSV/Valid.csv");

            WebElement TaxReliefRefreshButton = page.getTaxRelief(driver);
            TaxReliefRefreshButton.click();

            Boolean testVariable = page.checkListPopulated(driver);

            if (testVariable)
                System.out.println("*** Test Case CSVFile Upload : Passed *** ");
            else
                System.out.println("*** Test Case CSVFile Upload : Failed *** ");
        }
        catch(Exception e)
        {
            System.out.println("Exception occured during File Upload");
            System.out.println("*** Test Case CSVFile Upload : Failed *** ");
        }

        //driver.close();
    }

}
