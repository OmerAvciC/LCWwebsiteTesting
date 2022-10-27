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

    @FindBy(css = "[id='onetrust-accept-btn-handler']")
    private WebElement acceptCookies;

    @FindBy(css = "[class='menu-header-item__title--waikiki']")
    private WebElement assertPage;

    //orcun112---------------------------------
    @FindBy(xpath = "(//*[@class='editable ins-element-editable editable-text'])[3]")
    private WebElement clickincokie1;
    @FindBy(xpath = "//button[text()='ANLADIM']")
    private WebElement clickninanladım;
    @FindBy(xpath = "//*[@id='_sorun_icon_img']")
    private WebElement livesupportclick;

    @FindBy(xpath = "//div[text()='Sipariş Durumum']")
    private WebElement clickinorders;

    @FindBy(xpath = "//*[@id='endButton']")
    private WebElement quitlick;
//
    @FindBy(xpath = "//span[text()='Evet']")
    private WebElement quitclickYes;


    //-----------------------------------------

    WebElement myElement;

    public void findAndSend(String strElement, String value) {

        switch (strElement) {


//            case "searchInput":
//                myElement = searchInput;
//                break;

        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {

        switch (strElement) {
            case "clickincokie1":
                myElement = clickincokie1;
                break;
            case "clickninanladım":
                myElement = clickninanladım;
                break;
            case "livesupportclick":
                myElement = livesupportclick;
                break;
            case "clickinorders":myElement=clickinorders;break;

            case "quitlick":
                myElement = quitlick;
                break;
            case "quitclickYes":
                myElement = quitclickYes;
                break;


//            case "addToCart":
//                myElement = addToCart;
//                break;


        }

        clickFunction(myElement);

    }

    public void findAndContainsText(String strElement, String text) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {

            case "assertPage":
                myElement = assertPage;
                break;

        }

        verifyContainsText(myElement, text);
    }

}
