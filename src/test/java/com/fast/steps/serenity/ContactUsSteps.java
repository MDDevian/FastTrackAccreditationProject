package com.fast.steps.serenity;

import com.fast.pages.ContactUsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class ContactUsSteps extends ScenarioSteps {

    ContactUsPage contactUsPage;

    @Step
    public void navigateToHomepage() {
        contactUsPage.open();
    }

    @Step
    public void clickOnContactUs() {
        contactUsPage.clickOnContactUsButton();
        contactUsPage.checkContactUsPage();
    }

    @Step
    public void setName(String name) {
        contactUsPage.setNameField(name);
    }

    @Step
    public void setEmail(String email){
        contactUsPage.setEmailField(email);
    }
    @Step
    public void setCommentField(String comment){
        contactUsPage.setCommentField(comment);
    }
    @Step
    public void clickOnSubmitButton(){
        contactUsPage.clickOnSubmitButton();
    }
    @Step
    public void setCommentSuccessMessage(){
        contactUsPage.setCommentSuccessMessage();
    }
}

