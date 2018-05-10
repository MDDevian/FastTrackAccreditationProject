package com.fast.steps.serenity;

import com.fast.pages.NewsletterPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class NewsletterSteps extends ScenarioSteps {

    NewsletterPage newsletterPage;

    @Step
    public void navigateToNewsletterPage() {
        newsletterPage.open();
    }

    @Step
    public void setNewsletterEmail(String email) {
        newsletterPage.setNewsletterField(email);
    }

    @Step
    public void clickOnSubscribeButton() {
        newsletterPage.clickSubscribeButton();
    }
    @Step
    public void checkNewsletterSubscription(){
        newsletterPage.verifyNewsletterSubscription();
}

}

