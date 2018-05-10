package com.fast.features.search;

import com.fast.steps.serenity.CheckoutSteps;
import com.fast.steps.serenity.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTests {
    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    CheckoutSteps checkoutSteps;
    @Steps
    LoginSteps loginSteps;

    private String email = "ionpop@yahoo.com";
    private String password = "ionpop";

    @Test
    public void loginUser() {
        loginSteps.navigateToLoginPage();
        loginSteps.setEmailField(email);
        loginSteps.setPasswordField(password);
        loginSteps.clickLoginButton();
        loginSteps.verifyLoginSuccess();
    }

}








