package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
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

    @Given("Click on MARKALARA ÖZEL title from the main page")
    public void clickOnMARKALARAÖZELTitleFromTheMainPage() {
        dc.findAndClick("markalaraOzelIndirimKupon");
    }

    @And("Click on SHADE KADIN ÜRÜNLERİ title opportunity")
    public void clickOnSHADEKADINÜRÜNLERİTitleOpportunity() {
        dc.findAndClick("indirimliShadeKadinUrunleri");
    }

    @And("Filter products by Bluz and choose a random product")
    public void filterProductsByBluzAndChooseARandomProduct() {
        //dc.findAndClick("filtreBluz");
        // scroll sorunlu gibi fazla gidiyor. Bu sebeple tıklanılabilir değil hatası veriyor
        wait.until(ExpectedConditions.visibilityOf(dc.filtreBluz)).click();

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("product-card__product-info")));
        List<WebElement> BluzSelect=GWD.getDriver().findElements(By.className("product-card__product-info"));
        int random=(int)(Math.random() * BluzSelect.size());
        wait.until(ExpectedConditions.elementToBeClickable(By.className("product-card__product-info")));
        BluzSelect.get(random).click();
    }

    @And("If available, choose random size and color and add to cart")
    public void ıfAvailableChooseRandomSizeAndColorAndAddToCart() {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='colors-area']/a[contains(@class,'color-option')]")));
        List<WebElement> renkSecim=GWD.getDriver().findElements(By.xpath("//div[@class='colors-area']/a[contains(@class,'color-option')]"));
        int random2=(int)(Math.random() * renkSecim.size());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='colors-area']/a[contains(@class,'color-option')]")));
        renkSecim.get(random2).click();


        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//div[@id='option-size'])[1]/a[@data-toggle='popover']")));
        List<WebElement> bedenOlumlular=GWD.getDriver().findElements(By.xpath("(//div[@id='option-size'])[1]/a[@data-toggle='popover']"));
        List<WebElement> bitenBedenler=GWD.getDriver().findElements(By.xpath("(//div[@id='option-size'])[1]/a[@class='disabled']"));
        for (int i = 0; i < bitenBedenler.size(); i++) {
            bedenOlumlular.remove(bitenBedenler.get(i));
        }
        int random=(int)(Math.random() * bedenOlumlular.size());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@id='option-size'])[1]/a[@data-toggle='popover']")));
        bedenOlumlular.get(random).click();
    }
}
