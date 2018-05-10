package com.fast.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://fasttrackit.org/selenium-test/")

public class NewsletterPage extends PageObject {

    @FindBy(css = "#newsletter")
    WebElementFacade newsletterField;

    @FindBy(css = "[title='Subscribe']")
    WebElementFacade subscribeButton;

    @FindBy(css = ".success-msg")
    WebElementFacade verifySubscription;

    public void setNewsletterField(String email) {
        typeInto(newsletterField, email);
    }

    public void clickSubscribeButton() {
        clickOn(subscribeButton);
    }

    public void verifyNewsletterSubscription(){
        verifySubscription.shouldContainText("Thank you for your subscription.");



}


}
