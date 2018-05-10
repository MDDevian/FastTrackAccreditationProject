package com.fast.features.search;

import com.fast.steps.serenity.CheckoutSteps;
import com.fast.steps.serenity.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import sun.rmi.runtime.Log;

@RunWith(SerenityRunner.class)
public class CheckoutTests {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    CheckoutSteps checkoutSteps;
    @Steps
    LoginSteps loginSteps;

    private String email2 = "marc10soccer@yahoo.com";
    private String pass = "daddyman10";

    private String product = "park row throw";
    private String firstname = "Marc";
    private String lastname = "Devian";
    private String email = "SimpleTime@mailinator.com";
    private String address = "Palm Street 54";
    private String city = "Miami";
    private String state = "Florida";
    private String postalcode = "876786";
    private String country = "Statele Unite ale Americii";
    private String telephone = "0123456789";


    @Test
    public void checkoutTestAsGuest() {
        checkoutSteps.navigateToHomepage();
        checkoutSteps.setSearchElement(product);
        checkoutSteps.clickOnSearchButton();
        checkoutSteps.setAddToCart();
        checkoutSteps.setCheckout();
        checkoutSteps.setCheckoutAsGuest();
        checkoutSteps.setFirstName(firstname);
        checkoutSteps.setLastName(lastname);
        checkoutSteps.setEmail(email);
        checkoutSteps.setAddress(address);
        checkoutSteps.setCity(city);
        checkoutSteps.setState(state);
        checkoutSteps.setPostalCode(postalcode);
        checkoutSteps.setCountry(country);
        checkoutSteps.setTelephone(telephone);
        checkoutSteps.setCheckoutContinueButton();
        checkoutSteps.waitABit(10000);
        checkoutSteps.clickOnShippingOptionButton();
        checkoutSteps.clickOnShippingContinueButtonOption();
        checkoutSteps.clickOnPaymentInfoButton();
        checkoutSteps.waitABit(5000);
        checkoutSteps.clickOnPlaceOrderButton();
        checkoutSteps.waitABit(3000);
        checkoutSteps.setCheckOrder();


    }

    @Test
    public void checkoutAsLoggedIn() {
        loginSteps.login(email2, pass);
        checkoutSteps.navigateToHomepage();
        checkoutSteps.setSearchElement(product);
        checkoutSteps.clickOnSearchButton();
        checkoutSteps.setAddToCart();
        checkoutSteps.setCheckout();
        checkoutSteps.setCheckoutContinueButton();
        checkoutSteps.waitABit(10000);
        checkoutSteps.clickOnShippingOptionButton();
        checkoutSteps.clickOnShippingContinueButtonOption();
        checkoutSteps.clickOnPaymentInfoButton();
        checkoutSteps.waitABit(5000);
        checkoutSteps.clickOnPlaceOrderButton();
        checkoutSteps.waitABit(3000);
        checkoutSteps.setCheckOrder();
    }

}

