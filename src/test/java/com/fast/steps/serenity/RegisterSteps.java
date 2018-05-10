package com.fast.steps.serenity;

import com.fast.pages.RegisterPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by cosminciocan on 11/12/2017.
 */
public class RegisterSteps extends ScenarioSteps {

    RegisterPage registerPage;

    @Step
    public void navigateToRegisterPage(){
        registerPage.open();
        registerPage.checkRegisterPage();
    }

    @Step
    public void setUserName(String name) {
        registerPage.setFirstNameField(name);
    }

    @Step
    public void setLastName(String lastName) {
        registerPage.setLastNameField(lastName);
    }

    @Step
    public void setEmailAddress(String emailAddress) {
        registerPage.setEmailAddressField(emailAddress);
    }

    @Step
    public void setPassword(String password) {
        registerPage.setPasswordField(password);
    }

    @Step
    public void setPasswordConfirmation(String confirmation) {
        registerPage.setPasswordConfirmationField(confirmation);
    }
    @Step
    public void clickRegisterButton(){
        registerPage.clickRegisterButton();
    }
    @Step
    public void registrationSuccess(){
        registerPage.checkRegistrationSuccess();
    }

    @StepGroup
    public void register(String firstName, String lastName, String email, String pass, String passConfirmation) {

        navigateToRegisterPage();
        setUserName(firstName);
        setLastName(lastName);
        setEmailAddress(email);
        setPassword(pass);
        setPasswordConfirmation(passConfirmation);
        clickRegisterButton();
    }
}


