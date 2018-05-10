package com.fast.features.search;

import com.fast.steps.serenity.CheckoutSteps;
import com.fast.steps.serenity.NewsletterSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)


public class NewsletterTests {
    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    NewsletterSteps newsletterSteps;

    private String email = "sfjifsij@yahoo.com";

    @Test
    public void newsletterSubscription() {
        newsletterSteps.navigateToNewsletterPage();
        newsletterSteps.setNewsletterEmail(email);
        newsletterSteps.clickOnSubscribeButton();
        newsletterSteps.checkNewsletterSubscription();

    }
    }

