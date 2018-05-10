package com.fast.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://fasttrackit.org/selenium-test/")
public class SearchPage extends PageObject {

    @FindBy(css = "#search")
    private WebElementFacade searchField;

    @FindBy(css = ".search-button")
    private WebElementFacade searchButton;

    @FindBy(css = ".page-title")
    private WebElementFacade checkSearch;

    @FindBy(css = "[title='Advanced Search']")
    private WebElementFacade advancedSearchQuickLink;

    @FindBy(css = "[id='name']")
    private WebElementFacade nameField;

    @FindBy(css = ".buttons-set [title='Search'].button")
    private WebElementFacade advancedSearchButton;

    @FindBy(css = "h2.product-name")
    private WebElementFacade advancedSearch;




    public void setSearchField(String searchObject) {
        typeInto(searchField, searchObject);

    }

    public void clickSearchButton() {
        clickOn(searchButton);

    }

    public void verifySearchTest() {
        checkSearch.shouldContainText("SEARCH RESULTS FOR 'PARK ROW THROW'");

    }

    public void clickAdvancedSearchQuickLink(){
        clickOn(advancedSearchQuickLink);
    }

    public void setNameField(String product){
        typeInto(nameField, product);
    }

    public void clickAdvancedSearchButton(){
        clickOn(advancedSearchButton);

    }

    public void verifyAdvancedSearch(){
        advancedSearch.shouldContainText("RACER BACK MAXI DRESS");
    }




}
