package com.fast.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://fasttrackit.org/selenium-test/customer/account/login/")
public class LoginPage extends PageObject {

    @FindBy(css = ".page-title")
    private WebElementFacade pageTitle;

    @FindBy(css = "input#email.input-text.required-entry.validate-email")
    private WebElementFacade emailField;

    @FindBy(css = "#pass")
    private WebElementFacade passwordField;

    @FindBy(css = "#send2")
    private WebElementFacade loginButton;

    @FindBy(css = ".hello")
    private WebElementFacade loginSuccess;


    public void checkLoginPage() {
        pageTitle.shouldContainText("LOGIN OR CREATE AN ACCOUNT");
    }

    public void setEmailField(String email) {
        typeInto(emailField, email);
    }

    public void setPasswordField(String password) {
        typeInto(passwordField, password);
    }

    public void clickLoginButton() {
        clickOn(loginButton);

    }

    public void verifyLoginSuccess() {
        loginSuccess.shouldContainText("Hello, ion pop!");
    }
}

