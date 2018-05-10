package com.fast.steps.serenity;

import com.fast.pages.SearchPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SearchSteps extends ScenarioSteps {
    SearchPage searchPage;

    @Step
    public void navigateToHomePage() {
        searchPage.open();
    }

    @Step
    public void setSearchField(String searchElement) {
        searchPage.setSearchField(searchElement);

    }

    @Step
    public void clickOnSearchButton() {
        searchPage.clickSearchButton();

    }

    @Step
    public void verifySearchPage() {
        searchPage.verifySearchTest();
    }

    @Step
    public void clickOnAdvancedSearchQuickLink() {
        searchPage.clickAdvancedSearchQuickLink();
    }

    @Step
    public void setNameField(String product) {
        searchPage.setNameField(product);
    }
    @Step
    public void clickOnAdvancedSearchButton(){
        searchPage.clickAdvancedSearchButton();
    }

    @Step
    public void checkAdvancedSearch() {
        searchPage.verifyAdvancedSearch();
    }
}
