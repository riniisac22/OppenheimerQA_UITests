package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mainPage {
    //Elements on Main Page
    public WebElement getCSVFileUploadOption(WebDriver driver)
    {
        //check that
        System.out.println("# To get CSV Upload Option availability");
        WebElement CSV = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[2]/input"));
        return CSV;
    }

    public WebElement getDispenseNowButton(WebDriver driver)
    {
        //check Button
        System.out.println("# To get Dispense Button Option availablity");
        WebElement dispense = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/a[2]"));
        return dispense;
    }



    public WebElement getTaxRelief(WebDriver driver)
    {
        System.out.println("# To Check taxReliefRefresh Button availability");
        WebElement taxRelief = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/button[1]"));
        return taxRelief;
    }

    public WebElement getListBox(WebDriver driver)
    {
        //check List
        System.out.println("# To Check Listbox availability");
        WebElement List = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]"));
        return List;

    }

    // Functions on Main Page
    public void uploadCSV(WebElement CSVUpload, String filePath)
    {
        try {
            //upload csv
            System.out.println("# To Check the upload of INput CSV File with EMployee List");
            CSVUpload.sendKeys(filePath);
        }
        catch(Exception e)
        {
            System.out.println("Error in File Upload");
        }
    }

    public Boolean checkListPopulated(WebDriver driver)
    {
        try {
            //checkvalue
            System.out.println("# To Check if List is populated after File upload");
            WebElement NatID = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/table/thead/tr/th[1]"));
            WebElement TaxRelief = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/table/thead/tr/th[2]"));
            //Expected header to include name as well but not available in UI hence not adding test
            //WebElement Name = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/table/thead/tr/th[3]"));

            //TODO More conditions need to be added

            if ((NatID != null) && (TaxRelief != null))
                return true;
            else
                return false;

        }
        catch(Exception e)
        {
            System.out.println("Exception Encountered during List verification");
            return false;
        }
    }

    public String getDispenseButtonColor(WebDriver driver)
    {
        System.out.println("# To check if Dispense Now Button is Red in Color");
        String bgcolor = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/a[2]")).getCssValue("background-color");
        return bgcolor;
    }

    public String getDispenseButtonText(WebDriver driver)
    {
        System.out.println("# To check if Dispense Now Button Text is as expected");
        String ButtonText = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/a[2]")).getText();
        return ButtonText;
    }


    public void dispenseFunds(WebElement dispenseButton)
    {
        dispenseButton.click();
    }

}
