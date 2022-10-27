package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AddingProductsSteps {
    DialogContent dc=new DialogContent();
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
    @And("Click on EV & YASAM title from the main page")
    public void clickOnEVYASAMTitleFromTheMainPage() {
        dc.findAndClick("homeLifeTitle");
    }

    @And("Click on the Lisansli urunler")
    public void clickOnTheLisansliUrunler() {
        dc.findAndClick("lisancedProducts");
    }

    @And("Click on the Kiz Bebek radio button")
    public void clickOnTheKizBebekRadioButton() {
        wait.until(ExpectedConditions.visibilityOf(dc.kizBebekCheckButton)).click();
    }

    @And("Click on the a random product")
    public void clickOnTheARandomProduct() {

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("product-card__product-info")));

        List<WebElement> productSelect=GWD.getDriver().findElements(By.className("product-card__product-info"));

        int random=(int)(Math.random() * productSelect.size());

        wait.until(ExpectedConditions.elementToBeClickable(By.className("product-card__product-info")));

        productSelect.get(random).click();

    }
}
