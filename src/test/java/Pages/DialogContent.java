package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "[class='menu-header-item__title--waikiki']")
    private WebElement assertPage;

    @FindBy(xpath = "//a[text()='Ayakkabı']")
    public WebElement shoesLink;

    @FindBy(xpath = "(//div[contains(@class,'col-sm-3 pl-0 image_Box visible-lg visible-md')])[1]")
    public WebElement menLink;

    @FindBy(xpath = "//span[text()='X']")
    public WebElement otherFrame;

    @FindBy(xpath = "//button[text()='ANLADIM']")
    public WebElement cookieClose;

    @FindBy(xpath = "(//a[text()='SEPETE EKLE'])[2]")
    public WebElement addToCart;

    @FindBy(xpath = "(//div/a[@class='quick-filters__item'])[3]")
    public WebElement menBots;

    @FindBy(css = "[id='shopping-cart']")
    public WebElement cartInside;

    @FindBy(xpath = "(//a[text()='ÖDEME ADIMINA GEÇ'])[2]")
    public WebElement payment;

    @FindBy(xpath = "(//*[@placeholder='E-Posta Adresiniz'])[2]")
    public WebElement eMail;

    @FindBy(id = "FullNameInput")
    public WebElement nameForm;

    @FindBy(id = "PhoneNumberInput")
    public WebElement PhoneNumberInput;

    @FindBy(xpath = "//input[@aria-controls='vs1__listbox']")
    public WebElement cityList;

    @FindBy(xpath = "//input[@aria-controls='vs2__listbox']")
    public WebElement districtList;

    @FindBy(xpath = "//input[@aria-controls='vs3__listbox']")
    public WebElement neigList;

    @FindBy(id = "AddressInput")
    public WebElement AddressInput;

    @FindBy(id = "AddressDefinitionInput")
    public WebElement AddressDefinitionInput;

    @FindBy(css = "[class='modalAddButton']")
    public WebElement saveBtn;

    @FindBy(xpath = "//span[@class='vs__selected']/text()")
    public WebElement anyCity;

    @FindBy(xpath = "//a[text()='EV & YAŞAM']")
    public WebElement homeLifeTitle;

    @FindBy(xpath = "(//img[contains(@src,'hlp-lisans.jpg')])[1]")
    public WebElement lisancedProducts;

    @FindBy(xpath = "(//div/a[@class='quick-filters__item'])[4]")
    public WebElement kizBebekCheckButton;

   @FindBy(className = "product-card__product-info")
    public List<WebElement> productSelect;

    WebElement myElement;

    public void findAndSend(String strElement, String value) {

        switch (strElement) {

            case "eMail":
                myElement = eMail;
                break;

            case "nameForm":
                myElement = nameForm;
                break;

            case "PhoneNumberInput":
                myElement = PhoneNumberInput;
                break;

            case "AddressInput":
                myElement = AddressInput;
                break;

            case "AddressDefinitionInput":
                myElement = AddressDefinitionInput;
                break;

            case "cityList":
                myElement = cityList;
                break;

            case "districtList":
                myElement = districtList;
                break;

            case "neigList":
                myElement = neigList;
                break;

        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {
        int rnd=(int)(Math.random()*productSelect.size());

        switch (strElement) {

            case "otherFrame":
                myElement = otherFrame;
                break;

            case "cookieClose":
                myElement = cookieClose;
                break;

            case "menBots":
                myElement = menBots;
                break;

            case "shoesLink":
                myElement = shoesLink;
                break;

            case "menLink":
                myElement = menLink;
                break;

            case "addToCart":
                myElement = addToCart;
                break;

            case "cartInside":
                myElement = cartInside;
                break;

            case "payment":
                myElement = payment;
                break;


            case "saveBtn":
                myElement = saveBtn;
                break;

            case "anyCity":
                myElement = anyCity;
                break;

            case "homeLifeTitle":
                myElement = homeLifeTitle;
                break;

            case "lisancedProducts":
                myElement = lisancedProducts;
                break;

            case "kizBebekCheckButton":
                myElement = kizBebekCheckButton;
                break;

            case "productSelect":
                myElement = productSelect.get(rnd);
                break;

        }

        clickFunction(myElement);

    }

    public void findAndContainsText(String strElement, String text) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {

            case "assertPage":  myElement = assertPage;   break;

        }

        verifyContainsText(myElement, text);
    }

}
