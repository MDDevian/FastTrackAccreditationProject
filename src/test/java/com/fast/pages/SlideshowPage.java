package com.fast.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://fasttrackit.org/selenium-test/")

public class SlideshowPage extends PageObject {
    @FindBy(css = ".slideshow-next")
    WebElementFacade clickOnNextSlideButton;

    @FindBy(xpath = "//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div/div[2]/div[1]/ul/li[3]/a/img")
    WebElementFacade nextSlideSuccess;

    @FindBy(css = ".slideshow-prev")
    WebElementFacade clickOnPrevSlideButton;

    @FindBy(xpath = "//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div/div[2]/div[1]/ul/li[2]/a/img")
    WebElementFacade prevSlideSuccess;

    public void slideshowNextButton() {
        clickOn(clickOnNextSlideButton);
    }

    public void verifyNextSlideSuccess() {
        nextSlideSuccess.shouldContainElements(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div/div[2]/div[1]/ul/li[3]/a/img"));

    }

    public void slideshowPrevButton(){
        clickOn(clickOnPrevSlideButton);
    }

    public void verifyPrevSlideSuccess(){
        prevSlideSuccess.shouldContainElements(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div/div[2]/div[1]/ul/li[2]/a/img"));
    }



}