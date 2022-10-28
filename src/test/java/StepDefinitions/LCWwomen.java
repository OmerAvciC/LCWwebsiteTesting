package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;

public class LCWwomen {
    DialogContent dc=new DialogContent();
    @And("Go to Woman best seller page")
    public void Go_to_Woman_bes_seller_page() {
        dc.findAndClick("WOMAN");
        dc.findAndClick("WOMANLINK");

    }
}
