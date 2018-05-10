package com.fast.steps.serenity;

import com.fast.pages.CartPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class CartSteps extends ScenarioSteps {
    CartPage cartPage;

    @Step
    public void editQuantity(String number) {
        cartPage.setQuantityBox(number);
    }
    @Step
    public void clickOnUpdateButton(){
        cartPage.clickUpdateButton();
    }
    @Step
    public void checkCartUpdate(){
        cartPage.verifyCartUpdate();
    }
    @Step
    public void removeProductFromCart(){
        cartPage.clickOnRemoveProductFromCartButton();
    }
    @Step
    public void checkRemoveProductFromCart(){
        cartPage.verifyRemoveProductFromCart();
    }
}
