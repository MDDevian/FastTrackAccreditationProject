package com.fast.features.search;

import com.fast.steps.serenity.SearchSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SearchTests {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    SearchSteps searchSteps;
    private String searchElement = "park row throw";
    private String product = "racer";

    @Test
    public void searchTest() {
        searchSteps.navigateToHomePage();
        searchSteps.setSearchField(searchElement);
        searchSteps.clickOnSearchButton();
        searchSteps.verifySearchPage();
    }

    @Test
    public void advancedSearchTest() {
        searchSteps.navigateToHomePage();
        searchSteps.clickOnAdvancedSearchQuickLink();
        searchSteps.setNameField(product);
        searchSteps.clickOnAdvancedSearchButton();
        searchSteps.checkAdvancedSearch();

    }

}
