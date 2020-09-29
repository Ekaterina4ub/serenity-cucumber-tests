package com.google.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.google.com/")
public class SearchPage extends PageObject {

    @FindBy(name="q")
    WebElementFacade searchInput;

    @FindBy(className = "gNO89b")
    WebElementFacade searchButton;

    public void inputToSearchField(String text) {
        searchInput.type(text);
    }

    public void clickSearchInput() {
        searchInput.click();
    }

    public void clickSearchButton() {
        searchButton.click();
    }
}
