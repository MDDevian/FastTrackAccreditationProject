package com.fast.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://fasttrackit.org/selenium-test/customer/account/create/")
public class RegisterPage extends PageObject {


    @FindBy(css = "#firstname")
    private WebElementFacade firstNameField;

    @FindBy(css = "#lastname")
    private WebElementFacade lastNameField;

    @FindBy(css = ".page-title")
    private WebElementFacade pageTitle;

    @FindBy(css = "#email_address")
    private WebElementFacade emailAddressField;

    @FindBy(css = "#password")
    private WebElementFacade passwordField;

    @FindBy(css = "#confirmation")
    private WebElementFacade passwordConfirmationField;

    @FindBy(css = "button[title=Register]")
    private WebElementFacade registerButton;

    @FindBy(css = "li.success-msg")
    private WebElementFacade registrationSuccessMessage;

    public void checkRegisterPage() {
        pageTitle.shouldContainText("CREATE AN ACCOUNT");
    }

    public void setFirstNameField(String firstName) {
        typeInto(firstNameField, firstName);
    }


    public void setLastNameField(String lastName) {
        typeInto(lastNameField, lastName);
    }

    public void setEmailAddressField(String emailAddress) {
        typeInto(emailAddressField, emailAddress);
    }

    public void setPasswordField(String password) {
        typeInto(passwordField, password);
    }

    public void setPasswordConfirmationField(String confirmation) {
        typeInto(passwordConfirmationField, confirmation);
    }

    public void clickRegisterButton() {
        clickOn(registerButton);
    }
    public void checkRegistrationSuccess(){
        registrationSuccessMessage.shouldContainText("Thank you for registering with Madison Island.");
    }


}
