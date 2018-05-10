package com.fast.features.search;

import com.fast.steps.serenity.LoginSteps;
import com.fast.steps.serenity.RegisterSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.Session;
import sun.rmi.runtime.Log;

/**
 * Created by cosminciocan on 11/12/2017.
 */
@RunWith(SerenityRunner.class)
public class RegisterTests {


    @Managed(uniqueSession = true)
    public WebDriver driver;



    @Steps
    RegisterSteps registerSteps;
    private String password = "123456";
    private String firstname = "Marc";
    private String lastname = "Devian";
    private String email = "FareakyFace@mailinator.com";

    @Test
    public void registerUser() {
        registerSteps.navigateToRegisterPage();
        registerSteps.setUserName(firstname);
        registerSteps.setLastName(lastname);
        registerSteps.setEmailAddress(email);
        registerSteps.setPassword(password);
        registerSteps.setPasswordConfirmation(password);
        registerSteps.clickRegisterButton();
        registerSteps.registrationSuccess();

    }


    }

