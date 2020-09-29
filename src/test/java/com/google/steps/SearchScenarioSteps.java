package com.google.steps;

import com.google.pages.ResultPage;
import com.google.pages.SearchPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;

public class SearchScenarioSteps {
    SearchPage searchPage;
    ResultPage resultPage;

    @Given("^user opens the site$")
    public void givenUserOpensTheSite() {
        searchPage.open();
    }

    @Given("^user clicks on input$")
    public void givenUserClicksOnInput() {
        searchPage.clickSearchInput();
    }

    @When("^user (?:searches for|searches) (.*)$")
    public void whenUserSearches(String text) {
        searchPage.inputToSearchField(text);
    }

    @When("^user clicks on Search button$")
    public void whenUserClicksOnSearchButton() {
        searchPage.clickSearchButton();
    }

    @Then("^user sees list of results$")
    public void thenUserSeesListOfResults() {
        assertTrue(resultPage.areResultsDisplayed());
    }

    @Then("^(.*) should be displayed$")
    public void thenShouldBeDisplayed(String expectedName) {
        String title = resultPage.getTitle();
        System.out.println(title);
        //TODO delete this
        assertTrue(title.contains(expectedName));
    }


}
