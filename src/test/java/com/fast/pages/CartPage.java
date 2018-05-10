package com.fast.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://fasttrackit.org/selenium-test/")
public class CartPage extends PageObject {
    @FindBy(css = "[title='Qty']")
    WebElementFacade quantityBox;

    @FindBy(css = ".button.btn-update")
    WebElementFacade updateButton;

    @FindBy(css = ".product-cart-total .cart-price")
    WebElementFacade cartUpdate;

    @FindBy(css = "td.a-center.product-cart-remove.last .btn-remove.btn-remove2")
    WebElementFacade removeProductFromCart;

    @FindBy(css = "div.col-main")
    WebElementFacade checkRemoveProductFromCart;


    public void setQuantityBox(String number) {
        typeInto(quantityBox, number);
    }

    public void clickUpdateButton() {
        clickOn(updateButton);
    }

    public void verifyCartUpdate(){
        cartUpdate.shouldContainText("550,00 RON");
    }

    public void clickOnRemoveProductFromCartButton(){
        clickOn(removeProductFromCart);
    }
    public void verifyRemoveProductFromCart(){
        checkRemoveProductFromCart.shouldContainText("SHOPPING CART IS EMPTY\n" +
                "You have no items in your shopping cart.");
    }
}

