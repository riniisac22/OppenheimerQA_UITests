import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OppenheimerTestSuite {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/riniisac/Rini_Documents/Oppenheimer/seleniumDependencies/drivers/chromedriver");
        //TODO Parameterize Browser to be used

        WebDriver driver = new ChromeDriver();

        //TODO Implement TestNG Framework

        TC_CheckWebsiteAVailability(driver);
        TC_CheckCSVUploadFunctionality(driver);
        TC_CheckDispenseNowFunctionality(driver);

        driver.close();
        driver.quit();
    }

    public static void TC_CheckDispenseNowFunctionality(WebDriver driver)
    {
        DispenseFundsTest TC3 = new DispenseFundsTest();
        TC3.checkFUndsToDispense(driver);
    }
    public static void TC_CheckWebsiteAVailability(WebDriver driver)
    {
        WebsiteAvailabilityTest TC1 = new WebsiteAvailabilityTest();
        TC1.checkElementsOnPageLoad(driver);
    }

    public static void TC_CheckCSVUploadFunctionality(WebDriver driver)
    {
        AddEmployeeCSVTest TC2 = new AddEmployeeCSVTest();
        TC2.CheckEmployeeAddedSuccessfully(driver);
    }
}
