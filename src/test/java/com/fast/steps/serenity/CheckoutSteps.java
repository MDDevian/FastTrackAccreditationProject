package com.fast.steps.serenity;


import com.fast.pages.CheckoutPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class CheckoutSteps extends ScenarioSteps {

    CheckoutPage homepage;

    private String searchElement = "park row throw";

    @Step
    public void navigateToHomepage() {
        homepage.open();
    }

    @Step
    public void setSearchElement(String searchElement) {
        homepage.setSearchField(searchElement);
    }

    @Step
    public void clickOnSearchButton() {
        homepage.setSearchButton();
    }

    @Step
    public void setAddToCart() {
        homepage.setAddToCartButton();
    }

    @Step
    public void setCheckout() {
        homepage.setCheckoutButton();
    }

    @Step
    public void setCheckoutAsGuest() {
        homepage.setCheckoutAsGuestButton();
    }

    @Step
    public void setFirstName(String firstName) {
        homepage.setFirstNameField(firstName);
    }

    @Step
    public void setLastName(String lastName) {
        homepage.setLastNameField(lastName);
    }

    @Step
    public void setEmail(String email) {
        homepage.setEmailField(email);
    }

    @Step
    public void setAddress(String address) {
        homepage.setAddressField(address);
    }

    @Step
    public void setCity(String city) {
        homepage.setCityField(city);
    }

    @Step
    public void setState(String state) {
        homepage.setStateField(state);
    }

    @Step
    public void setPostalCode(String postalCode) {
        homepage.setPostalCodeField(postalCode);
    }

    @Step
    public void setCountry(String country) {
        homepage.setCountryField(country);
    }

    @Step
    public void setTelephone(String telephone) {
        homepage.setTelehponeField(telephone);
    }

    @Step
    public void setCheckoutContinueButton() {
        homepage.setCheckoutContinueButton();
    }

    @Step
    public void clickOnShippingOptionButton() {
        homepage.clickOnShippingButton();
    }

    @Step
    public void clickOnShippingContinueButtonOption() {
        homepage.clickOnShippingContinueButton();
    }

    @Step
    public void clickOnPaymentInfoButton() {
        homepage.clickOnPaymentButton();
    }

    @Step
    public void clickOnPlaceOrderButton() {
        homepage.clickOnPlaceOrderButton();
    }


    @Step
    public void setCheckOrder() {
        homepage.setCheckOrderPlacement();
    }

    @StepGroup
    public void addToCart(){
        navigateToHomepage();
        setSearchElement(searchElement);
        clickOnSearchButton();
        setAddToCart();
    }
}