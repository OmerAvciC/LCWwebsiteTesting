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

//            case "addToCart":
//                myElement = addToCart;
//                break;


        }

        clickFunction(myElement);

    }

    public void findAndContainsText(String strElement, String text) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {

//            case "homepageVerify":
//                myElement = homepageVerify;
//                break;
//
        }

        verifyContainsText(myElement, text);
    }

}
