import browser.BrowserFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.mainPage;
import pages.confirmationPage;
public class DispenseFundsTest {

    void checkFUndsToDispense(WebDriver driver)
    {
        BrowserFunctions browser = new BrowserFunctions();
        String ExpecteddispenseButtonColor = "rgba(220, 53, 69, 1)";
        String ExpectedDispenseButtonText = "Dispense Now";
        Integer testVariable = 1;

        try {
            browser.openWebsite(driver);

            mainPage page = new mainPage();
            confirmationPage confPage = new confirmationPage();
            //check Funds

            String DispenseButtonColor = page.getDispenseButtonColor(driver);
            if (ExpecteddispenseButtonColor.equals(DispenseButtonColor)) {
                System.out.println("--Checkpoint Passed: Dispense Now Button color = RED");
            } else {
                System.out.println("--Checkpoint Failed: Dispense Now Button color NOT = RED");
                System.out.println("Expected: " + ExpecteddispenseButtonColor);
                testVariable = 0;
            }

            String DispenseButtonText = page.getDispenseButtonText(driver);
            if (ExpectedDispenseButtonText.equals(DispenseButtonText)) {
                System.out.println("--Checkpoint Passed: Dispense Now Button Text is as Expected");
            } else {
                System.out.println("--Checkpoint Failed: Dispense Now Button Text is not as Expected");
                testVariable = 0;
            }
            WebElement dispenseNowButton = page.getDispenseNowButton(driver);
            page.dispenseFunds(dispenseNowButton);
            //wait

            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div/main/div/div/div")));
            //confPage.checkConfirmedMsg(driver);

            Boolean checkMsg = confPage.checkConfirmedMsg(driver);

            if (checkMsg) {
                System.out.println("--Checkpoint Passed: Dispense Now Button works as expected");
            } else {
                System.out.println("--Checkpoint Failed: Dispense Now Button does not work as expected");
                testVariable = 0;
            }

            if (testVariable == 1) {
                System.out.println("*** TestCase Dispense Funds Functionality : Passed ***");
            } else {
                System.out.println("*** TestCase Dispense Funds Functionality : Failed *** ");
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception Occured during Dispense Funds");
            System.out.println("*** TestCase Dispense Funds Functionality : Failed *** ");
        }
    }
}
