package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.Duration;
import java.util.List;

public class LWCmensbottesting {

    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
    DialogContent dc=new DialogContent();

    Actions actions = new Actions(GWD.getDriver());

    @Given("Open website go to home page")
    public void open_website_go_to_home_page() {
        WebDriver driver = GWD.getDriver();
        driver.get("https://www.lcwaikiki.com/tr-TR/TR");
        driver.manage().window().maximize();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='X']")));
        dc.findAndClick("otherFrame");
        dc.findAndClick("cookieClose");
    }
    @When("Verify that you are on the home page")
    public void verify_that_you_are_on_the_home_page() {

        dc.findAndContainsText("assertPage", "WAIKIKI");

    }
    @And("Go to Men's boots using the action class or with the help of the search button")
    public void go_to_men_s_boots_using_the_action_class_or_with_the_help_of_the_search_button() {

        dc.findAndClick("shoesLink");
        dc.findAndClick("menLink");
    }
    @And("Click any Bot")
    public void click_any_bot() {

        wait.until(ExpectedConditions.visibilityOf(dc.menBots)).click();

        List<WebElement> botList=GWD.getDriver().findElements(By.className("product-card__product-info"));

        int random=(int)(Math.random() * botList.size());

        wait.until(ExpectedConditions.elementToBeClickable(By.className("product-card__product-info")));

        botList.get(random).click();
    }
    @And("Click any Size")
    public void click_any_size() {

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("div[class='mobile-size-and-cart-container'] a[data-tracking-label='BedenSecenekleri']:not(.disabled)")));

        List<WebElement> sizeList=GWD.getDriver().findElements(By.cssSelector("div[class='mobile-size-and-cart-container'] a[data-tracking-label='BedenSecenekleri']:not(.disabled)"));

        int random=(int)(Math.random() * sizeList.size());

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[class='mobile-size-and-cart-container'] a[data-tracking-label='BedenSecenekleri']:not(.disabled)")));

        sizeList.get(random).click();

    }
    @And("Click on the addToCart")
    public void click_on_the_add_to_cart() {

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[text()='SEPETE EKLE'])[2]")));
        WebElement sepet = GWD.getDriver().findElement(By.xpath("(//a[text()='SEPETE EKLE'])[2]"));
        sepet.click();

    }
    @And("Click on the Cart")
    public void click_on_the_cart() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='shopping-cart']")));
        dc.findAndClick("cartInside");

    }
    @And("Save the product price")
    public void save_the_product_price() {
        WebElement price = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='rd-cart-item-price mb-15']")));
        System.out.println("info.getText() = " + price.getText());

        try{

            File dosya = new File("src/test/java/Resources/productInfo.txt");
            FileWriter yazici = new FileWriter(dosya,true);
            BufferedWriter yaz = new BufferedWriter(yazici);
            yaz.write("  Information  :  " + price.getText());
            yaz.close();
            System.out.println("Successfully");
        }
        catch (Exception hata){
            hata.printStackTrace();
        }
    }
    @And("Click on the Payment")
    public void click_on_the_payment() {

        dc.findAndClick("payment");
    }
    @And("Fill out the form on the payment page")
    public void fill_out_the_form_on_the_payment_page() {

        dc.findAndSend("eMail","omercav@gmail.com");

        WebElement agrement = GWD.getDriver().findElement(By.xpath("//*[@name='memberPrivacyApprove']"));
        agrement.click();

        WebElement continuee = GWD.getDriver().findElement(By.xpath("//button[text()='Üye Olmadan Devam Et']"));
        continuee.click();

        dc.findAndSend("nameForm","Shopen Özyilmaz");
        dc.findAndSend("PhoneNumberInput","5554445520");

        dc.findAndSend("cityList","İzmir");
        actions.keyDown(Keys.ENTER).build().perform();
        actions.keyUp(Keys.ENTER).build().perform();

        GWD.Bekle(1);
        dc.findAndSend("districtList","Çeşme");
        actions.keyDown(Keys.ENTER).build().perform();
        actions.keyUp(Keys.ENTER).build().perform();

        GWD.Bekle(1);
        dc.findAndSend("neigList","Altınkum Mh.");
        actions.keyDown(Keys.ENTER).build().perform();
        actions.keyUp(Keys.ENTER).build().perform();

        GWD.Bekle(1);
        dc.findAndSend("AddressInput","Figen konakları");

        GWD.Bekle(1);
        dc.findAndSend("AddressDefinitionInput","Avci gecekondu mahlesi");
    }
    @Then("Click on the save button")
    public void click_on_the_save_button() {

        dc.findAndClick("saveBtn");
    }

    @And("Product price and discount rate")
    public void productPriceAndDiscountRate() {
        WebElement sonFiyat;
        int ilkFiyatInt=0;

        List<WebElement> indirimVar=GWD.getDriver().findElements(By.cssSelector("[class='rd-cart-item-old-price']"));
        if (indirimVar.size() > 0) {
            WebElement ilkFiyat = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='rd-cart-item-old-price']")));
            System.out.println("------------------------------------------------");
            System.out.println("İlk Fiyat = " + ilkFiyat.getText());
            System.out.println("------------------------------------------------");
            String ilkFiyatString=ilkFiyat.getText();
            ilkFiyatInt=Integer.parseInt(ilkFiyatString.substring(0,3));
        }else {
            System.out.println("------------------------------------------------");
            System.out.println("Bu üründe indirim bulunmamaktadır.");
            sonFiyat = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='rd-cart-item-price mb-15']")));
            System.out.println("İndirimsiz fiyat = " + sonFiyat.getText());
            System.out.println("------------------------------------------------");
        }
        sonFiyat = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='rd-cart-item-price mb-15']")));

        if (indirimVar.size() > 0) {
            System.out.println("Son Fiyat = " + sonFiyat.getText());
            String sonFiyatString=sonFiyat.getText();
            int sonFiyatInt=Integer.parseInt(sonFiyatString.substring(0,3));

            int indirimyuzdeligi=100-(sonFiyatInt*100/ilkFiyatInt);
            System.out.println("------------------------------------------------");
            System.out.println("Ürünün indirim oranı %"+indirimyuzdeligi+" olarak bulunmuş olup.");
            System.out.println("Ürün %"+indirimyuzdeligi+" indirimli olarak satın alınabilir.");
            System.out.println("------------------------------------------------");
        }
    }
}
