package com.fast.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;
import org.yecht.Data;

@DefaultUrl("https://fasttrackit.org/selenium-test/customer/account/login/")
public class CheckoutPage extends PageObject {

    @FindBy(css = "#search")
    private WebElementFacade searchField;

    @FindBy(css = "[title=Search]")
    private WebElementFacade searchButton;

    @FindBy(css = "div.actions button[class='button btn-cart']")
    private WebElementFacade addToCartButton;

    @FindBy(css = "div.page-title button[title='Proceed to Checkout']")
    private WebElementFacade checkoutButton;

    @FindBy(css = " button[id=onepage-guest-register-button]")
    private WebElementFacade checkoutAsGuestButton;

    @FindBy(css = "[name='billing[firstname]']")
    private WebElementFacade firstNameField;

    @FindBy(css = "[name='billing[lastname]']")
    private WebElementFacade lastNameField;

    @FindBy(css = "input[title='Email Address']")
    private WebElementFacade emailField;

    @FindBy(css = "#billing\\3a street1")
    private WebElementFacade addressField;

    @FindBy(css = "input[name='billing[city]']")
    private WebElementFacade cityField;

    @FindBy(css = "#billing\\3a region_id")
    private WebElementFacade stateField;

    @FindBy(css = "input[name='billing[postcode]']")
    private WebElementFacade postalCodeField;

    @FindBy(css = "[name='billing[country_id]']")
    private WebElementFacade countryField;

    @FindBy(css = "[name='billing[telephone]'")
    private WebElementFacade telehponeField;

    @FindBy(css = "#billing-buttons-container > button")
    private WebElementFacade checkoutContinueButton;

    @FindBy(css = "#s_method_freeshipping_freeshipping.radio")
    private WebElementFacade shippingOptionButton;

    @FindBy(css = "[onClick='shippingMethod.save()']")
    private WebElementFacade shippingContinueButton;

    @FindBy(css = "[onClick='payment.save()']")
    private WebElementFacade paymentButton;

    @FindBy(css = "[title='Place Order']")
    private WebElementFacade placeOrderButton;

    @FindBy(css = "h2.sub-title")
    private WebElementFacade checkOrderPlacement;


    public void setSearchField(String searchElement) {
        typeInto(searchField, searchElement);
    }

    public void setSearchButton() {
        clickOn(searchButton);
    }


    public void setAddToCartButton() {
        clickOn(addToCartButton);
    }

    public void setCheckoutButton() {
        clickOn(checkoutButton);
    }

    public void setCheckoutAsGuestButton() {
        clickOn(checkoutAsGuestButton);
    }

    public void setFirstNameField(String firstname) {
        typeInto(firstNameField, firstname);
    }

    public void setLastNameField(String lastname) {
        typeInto(lastNameField, lastname);
    }

    public void setEmailField(String email) {
        typeInto(emailField, email);
    }

    public void setAddressField(String address) {
        typeInto(addressField, address);
    }

    public void setCityField(String city) {
        typeInto(cityField, city);
    }

    public void setStateField(String state) {
        selectFromDropdown(stateField, state);
    }

    public void setPostalCodeField(String postalcode) {
        typeInto(postalCodeField, postalcode);
    }

    public void setCountryField(String country) {
        selectFromDropdown(countryField, country);
    }

    public void setTelehponeField(String telehpone) {
        typeInto(telehponeField, telehpone);
    }

    public void setCheckoutContinueButton() {
        clickOn(checkoutContinueButton);
    }

    public void clickOnShippingButton() {
        clickOn(shippingOptionButton);
    }

    public void clickOnShippingContinueButton() {
        clickOn(shippingContinueButton);
    }

    public void clickOnPaymentButton() {
        clickOn(paymentButton);
    }

    public void clickOnPlaceOrderButton() {
        clickOn(placeOrderButton);
    }

    public void setCheckOrderPlacement() {
        shouldContainText("THANK YOU FOR YOUR PURCHASE!");
    }

}

