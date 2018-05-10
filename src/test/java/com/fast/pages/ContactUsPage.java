package com.fast.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://fasttrackit.org/selenium-test/")
public class ContactUsPage extends PageObject {
    @FindBy(css = "body > div > div.page > div.footer-container > div > div:nth-child(2) > ul > li:nth-child(2) > a")
    private WebElementFacade contactUsButton;

    @FindBy(css = ".page-title")
    private WebElementFacade contactUsPage;

    @FindBy(css = "#name")
    private WebElementFacade nameField;

    @FindBy(css = "#email")
    private WebElementFacade emailField;

    @FindBy(css = "#comment")
    private WebElementFacade commentField;

    @FindBy(css = "button[title=Submit]")
    private WebElementFacade submitButton;

    @FindBy(css = ".success-msg")
    private WebElementFacade commentSuccessMessage;

    public void clickOnContactUsButton() {
        clickOn(contactUsButton);
    }

    public void checkContactUsPage() {
        contactUsPage.shouldContainText("CONTACT US");
    }

    public void setNameField(String name) {
        typeInto(nameField, name);
    }
    public void setEmailField(String email){
        typeInto(emailField, email);
    }
    public void setCommentField(String comment){
        typeInto(commentField, comment);
    }
    public void clickOnSubmitButton(){
        clickOn(submitButton);
    }
    public void setCommentSuccessMessage(){
        commentSuccessMessage.shouldContainText("Your inquiry was submitted and will be responded to as soon as possible. Thank you for contacting us.");
    }
}
