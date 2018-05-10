package com.fast.features.search;

import com.fast.steps.serenity.ContactUsSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class ContactUsTests {
    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    ContactUsSteps contactUsSteps;
    private String name = "Ion";
    private String email = "ionpop@yahoo.com";
    private String comment = "Madison Island Comment Test.";

    @Test
    public void ContactUsTest(){
        contactUsSteps.navigateToHomepage();
        contactUsSteps.clickOnContactUs();
        contactUsSteps.setName(name);
        contactUsSteps.setEmail(email);
        contactUsSteps.setCommentField(comment);
        contactUsSteps.clickOnSubmitButton();
        contactUsSteps.setCommentSuccessMessage();
    }
}
