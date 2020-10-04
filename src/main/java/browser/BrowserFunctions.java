package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserFunctions {

    public void openWebsite(WebDriver driver)
    {
        //TODO Parameterize Website Link
        driver.manage().window().maximize();
        driver.get("localhost:8080");

        //System.out.println("Wait started");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("contents")));
    }
}
