package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;

public class BuyingAScarf {
    DialogContent dc=new DialogContent();
    @And("Send keyword to search box and click Search")
    public void sendKeywordToSearchBoxAndClickSearch() {
        dc.findAndSend("searchBox", "atkı");
        dc.findAndClick("search");
    }

    @And("Click Scarf")
    public void clickScarf() {
        dc.findAndClick("scarf");
    }
}
