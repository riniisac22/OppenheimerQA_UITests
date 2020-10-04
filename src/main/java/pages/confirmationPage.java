package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class confirmationPage {
    public Boolean checkConfirmedMsg(WebDriver driver)
    {
        //check msg
        System.out.println("Check confirmation page");
        if(driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div/div")).getText().equals("Cash dispensed"))
            return true;
        else
            return false;
    }
}
