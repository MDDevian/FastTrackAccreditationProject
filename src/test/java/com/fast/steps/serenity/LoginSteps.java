package com.fast.steps.serenity;

import com.fast.pages.LoginPage;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps {
    LoginPage loginPage;

    @Step
    public void navigateToLoginPage() {
        loginPage.open();
        loginPage.checkLoginPage();
    }

    @Step
    public void setEmailField(String emailAddress) {
        loginPage.setEmailField(emailAddress);
    }

    @Step
    public void setPasswordField(String password) {
        loginPage.setPasswordField(password);
    }

    @Step
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Step
    public void verifyLoginSuccess() {
        loginPage.verifyLoginSuccess();
    }

    @StepGroup
    public void login(String email, String pass) {
        navigateToLoginPage();
        setEmailField(email);
        setPasswordField(pass);
        clickLoginButton();
        verifyLoginSuccess();

    }

}


