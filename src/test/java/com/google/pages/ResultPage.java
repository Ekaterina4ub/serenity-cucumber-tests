package com.google.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends PageObject {

    @FindBy(className = "rc")
    WebElementFacade results;

    public boolean areResultsDisplayed() {
        results.waitUntilVisible();
        return results.isDisplayed();
    }
}
