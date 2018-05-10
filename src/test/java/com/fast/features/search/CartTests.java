package com.fast.features.search;

import com.fast.steps.serenity.CartSteps;
import com.fast.steps.serenity.CheckoutSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)

public class CartTests {
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    CartSteps cartSteps;

    @Steps
    CheckoutSteps checkoutSteps;

    private String number = "2";

    @Test
    public void addToCart(){
        checkoutSteps.addToCart();
    }
    @Test
    public void editCartQuantity(){
        checkoutSteps.addToCart();
        cartSteps.editQuantity(number);
        cartSteps.clickOnUpdateButton();
        cartSteps.checkCartUpdate();

    }
    @Test
    public void removeProductFromCart(){
        checkoutSteps.addToCart();
        cartSteps.removeProductFromCart();
        cartSteps.checkRemoveProductFromCart();
    }

}
