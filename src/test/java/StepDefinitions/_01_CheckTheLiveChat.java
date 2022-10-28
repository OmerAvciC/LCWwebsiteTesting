package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;

public class _01_CheckTheLiveChat {

    DialogContent dc = new DialogContent();
    WebDriver driver = GWD.getDriver();

    @And("Click on the element in the dialog")
    public void clickOnTheElementInTheDialog(DataTable elements) throws InterruptedException {
        Thread.sleep(8000);

        dc.findAndClick("livesupportclick");

        //compulsory usage threadsleep unfortunately :((((
        Thread.sleep(12000);
        driver.switchTo().frame(7);
        dc.findAndClick("clickinorders");
        Thread.sleep(8000);
        dc.findAndClick("quitlick");
        Thread.sleep(8000);
        dc.findAndClick("quitclickYes");


    }
}

